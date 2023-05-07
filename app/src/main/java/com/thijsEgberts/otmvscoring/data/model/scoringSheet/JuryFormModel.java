package com.thijsEgberts.otmvscoring.data.model.scoringSheet;

import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.user.JuryUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A data model for a jury scoring sheet.
 */
public class JuryFormModel {
    private CategoryModel category;
    private JuryUser jury;
    private int nrOfFields;
    private List<Integer> fieldNrs;

    //A list of scores for each contestant
    //The list is a mapping of fieldNr -> (scoringCriteria -> score)
    private Map<Integer, Map<ScoringCriteriaModel, Integer>> scores;

    /**
     * Constructs a jury score sheet model with existing scores.
     *
     * @param category the category to be graded on
     * @param jury the jury user that grades this competition
     * @param nrOfFields the amount of contestant fields
     * @param fieldNrs a list of the contestant field numbers
     * @param scores the scores each contestant received
     *
     * @throws IllegalArgumentException when the size of the list of fields doesn't match with the number of fields
     * @throws IllegalArgumentException when the size of the list of scores doesn't match with the number of fields
     * TODO throws IllegalArgumentException when the scores don't match with the field numbers
     * TODO throws IllegalArgumentException when the amount of score criteria maps doesn't match with the number of category scoring criteria
     */
    public JuryFormModel(CategoryModel category, JuryUser jury, int nrOfFields, List<Integer> fieldNrs, Map<Integer, Map<ScoringCriteriaModel, Integer>> scores) throws IllegalArgumentException {
        if (fieldNrs.size() != nrOfFields) throw new IllegalArgumentException("The size of the list of field numbers doesn't match nrOfFields");
        if (scores.size() != nrOfFields) throw new IllegalArgumentException("The size of the list of scores doesn't match nrOfFields");
        //TODO make the extra robustness checks

        this.category = category;
        this.jury = jury;
        this.nrOfFields = nrOfFields;
        this.fieldNrs = fieldNrs;
        this.scores = scores;
    }

    /**
     * Constructs an empty jury scoring form.
     *
     * @param category the category to be graded on
     * @param jury the jury user that grades this competition
     * @param nrOfFields the amount of contestant fields
     * @param fieldNrs a list of the contestant field numbers
     *
     * @throws IllegalArgumentException when the size of the list of fields doesn't match with the number of fields
     */
    public JuryFormModel(CategoryModel category, JuryUser jury, int nrOfFields, List<Integer> fieldNrs) throws IllegalArgumentException {
        if (fieldNrs.size() != nrOfFields) throw new IllegalArgumentException("The size of the list of field numbers doesn't match nrOfFields");

        this.category = category;
        this.jury = jury;
        this.nrOfFields = nrOfFields;
        this.fieldNrs = fieldNrs;

        //initialize a new score map
        scores = new HashMap<Integer, Map<ScoringCriteriaModel, Integer>>();
        for (int fieldNr : fieldNrs) {
            scores.put(fieldNr, new HashMap<ScoringCriteriaModel, Integer>());
        }
    }
}

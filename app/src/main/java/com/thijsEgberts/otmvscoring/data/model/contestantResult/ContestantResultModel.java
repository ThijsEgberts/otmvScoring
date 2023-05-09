package com.thijsEgberts.otmvscoring.data.model.contestantResult;

import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;
import com.thijsEgberts.otmvscoring.data.model.user.JuryUser;

import java.util.List;
import java.util.Map;

/**
 * A model class representing the results of a competition for a contestant in a category.
 */
public class ContestantResultModel {
    private List<JuryUser> juryList;
    private int fieldNr;
    private CategoryModel category;
    private Map<JuryUser, Map<ScoringCriteriaModel, Integer>> scores;

    /**
     * Constructs a new instance of a contestant result.
     *
     * @param juryList a list of jury users grading the contestant
     * @param fieldNr the field nr of the contestant
     * @param category the category in which the contestant participated
     * @param scores a map of the scores each jury member gave the contestant
     */
    public ContestantResultModel(List<JuryUser> juryList, int fieldNr, CategoryModel category, Map<JuryUser, Map<ScoringCriteriaModel, Integer>> scores) {
        this.juryList = juryList;
        this.fieldNr = fieldNr;
        this.category = category;
        this.scores = scores;
    }

    /**
     * Empty constructor for firebase
     */
    public ContestantResultModel() {}

    //getters

    public List<JuryUser> getJuryList() {
        return juryList;
    }

    public int getFieldNr() {
        return fieldNr;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public Map<JuryUser, Map<ScoringCriteriaModel, Integer>> getScores() {
        return scores;
    }
}

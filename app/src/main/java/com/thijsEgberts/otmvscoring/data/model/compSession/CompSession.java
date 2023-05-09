package com.thijsEgberts.otmvscoring.data.model.compSession;

import com.thijsEgberts.otmvscoring.data.model.contestantResult.ContestantResultModel;
import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.JuryFormModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;
import com.thijsEgberts.otmvscoring.data.model.user.JuryUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class to model a competition session.
 */
public class CompSession {
    private Map<CategoryModel, List<JuryUser>> juryUserMap; //a map to keep track of which juries are grading each category in this session
    private Map<JuryUser, List<JuryFormModel>> juryForms; //a map to associate the jury forms to jury users
    private Map<CategoryModel, List<JuryFormModel>> categoryJuryFormsMap;

    private List<Integer> fieldNumbers;
    private Map<CategoryModel, Integer> fieldNrsPerCategory;

    //TODO make the constructors


    /**
     * Get the results for a single contestant in the comp session.
     *
     * @param fieldNr the fieldNr of the contestant
     * @param category the category the contestant is competing in
     *
     * @return the contestantResult
     */
    public ContestantResultModel getContestantRestult(int fieldNr, CategoryModel category) {
        //TODO this might need robustness checks

        List<JuryUser> juryUserList = new ArrayList<>();
        Map<JuryUser, Map<ScoringCriteriaModel, Integer>> scores = new HashMap<>();

        //List<JuryUser> catJuryUsers = juryUserMap.get(category);
        List<JuryFormModel> juryForms = categoryJuryFormsMap.get(category);

        //check if the jury forms contain the field nr
        for (JuryFormModel juryForm : juryForms) {
            if (juryForm.getFieldNrs().contains(fieldNr)) {
                //add the jury to the jury list
                juryUserList.add(juryForm.getJury());

                //get the grades the jury gave
                scores.put(juryForm.getJury(), juryForm.getScores().get(fieldNr));
            }
        }

        ContestantResultModel contestantResult = new ContestantResultModel(juryUserList, fieldNr, category, scores);
        return contestantResult;
    }

    /**
     * Returns a list of all the results of the contestants in a certain category.
     *
     * @param category the category to get the results for
     *
     * @return a list of the results in that category
     */
    public List<ContestantResultModel> getAllContestantResults(CategoryModel category) {
        List<ContestantResultModel> resultsList = new ArrayList<>();

        //put all of the results of the field numbers in the category in the list
        fieldNrsPerCategory.forEach((k, v) -> {
            if (k.equals(category)) {
                resultsList.add(getContestantRestult(v, category));
            }
        });

        return resultsList;
    }
}

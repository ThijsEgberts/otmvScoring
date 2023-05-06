package com.thijsEgberts.otmvscoring.data.model.scoringSheet;

import java.util.List;

public abstract class AbstractScoringSheet {
    protected CompetitionCategories category; //the category of the
    protected int fieldNumber;
    protected List<Integer> subtotalScores;
    protected int totalScore;


    //getters and setters

    public CompetitionCategories getCategory() {
        return category;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public List<Integer> getSubtotalScores() {
        return subtotalScores;
    }

    public void setSubtotalScores(List<Integer> subtotalScores) {
        this.subtotalScores = subtotalScores;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}

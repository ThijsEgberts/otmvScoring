package com.thijsEgberts.otmvscoring.data.model.scoringSheet;

public class ScoringAttribute {

    private String name;
    private String description;
    private String scoringHint;
    private double score;

    public ScoringAttribute(String name, String description, String scoringHint, double score) {
        this(name, description, scoringHint);
        this.score = score;
    }

    public ScoringAttribute(String name, String description, String scoringHint) {
        this(name, description);
        this.scoringHint = scoringHint;
    }

    public ScoringAttribute(String name, String description) {
        this(name);
        this.description = description;
    }

    public ScoringAttribute(String name) {
        this.name = name;
    }
}

package com.thijsEgberts.otmvscoring.data.model.scoringSheet;

/**
 * A model class to represent an attribute that can be scored over in the competition.
 */
public class ScoringCriteriaModel {

    private String name; //the name of the attribute
    private String description; //the description of how the attribute should be graded
    private String displayIndex; //the index that is displayed in the form

    /**
     * Default constructor for firebase.
     */
    public ScoringCriteriaModel() {}

    /**
     * Constructs a new scoring attribute.
     * This constructor should only really be used when creating new attributes and categories to store in the db.
     *
     * @param name The name of the attribute
     * @param description The description of how the attribute should be graded
     */
    public ScoringCriteriaModel(String name, String description, String displayIndex) {
        this.name = name;
        this.description = description;
        this.displayIndex = displayIndex;
    }

    //The attributes should not be changeable in code, only in the database

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDisplayIndex() {
        return displayIndex;
    }
}

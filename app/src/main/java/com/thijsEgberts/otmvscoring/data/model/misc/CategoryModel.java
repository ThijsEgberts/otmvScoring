package com.thijsEgberts.otmvscoring.data.model.misc;

import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;

import java.util.List;

/**
 * A model class containing category information.
 */
public class CategoryModel {
    private List<ScoringCriteriaModel> scoringCriteriaList; //a list of all the scoring attributes connected to this category
    private String categoryName; //the (display) name of the category
    //private String CategoryDescription; //a possible description of the category
    private String categoryId; //the database id for the category

    /**
     * Constructs a new category data model.
     * This constructor should only really be used when creating new categories in the database
     *
     * @param scoringCriteriaList A list of scoring attributes that this category is graded on
     * @param categoryName The name of the category
     * @param categoryId The database id of the category
     */
    public CategoryModel(List<ScoringCriteriaModel> scoringCriteriaList, String categoryName, String categoryId) {
        this.scoringCriteriaList = scoringCriteriaList;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    /**
     * Empty constructor for firebase
     */
    public CategoryModel() {}

    //The category data should be read only in code and only be writable in the database

    public String getCategoryId() {
        return categoryId;
    }

    public List<ScoringCriteriaModel> getScoringCriteriaList() {
        return scoringCriteriaList;
    }

    public String getCategoryName() {
        return categoryName;
    }

//    public String getCategoryDescription() {
//        return CategoryDescription;
//    }
}

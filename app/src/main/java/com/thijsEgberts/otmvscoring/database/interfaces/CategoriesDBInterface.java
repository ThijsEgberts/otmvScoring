package com.thijsEgberts.otmvscoring.database.interfaces;

import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;

import java.util.List;

public interface CategoriesDBInterface {

    /**
     * Callback method for fetching all categories from the database.
     *
     * @param categoryModelsList the list of categories that got fetched
     */
    void fetchCategoriesCallBack(List<CategoryModel> categoryModelsList);
}

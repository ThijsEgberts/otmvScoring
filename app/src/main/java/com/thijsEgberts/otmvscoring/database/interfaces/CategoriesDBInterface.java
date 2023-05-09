package com.thijsEgberts.otmvscoring.database.interfaces;

import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;

import java.util.List;

public interface CategoriesDBInterface {

    public abstract List<CategoryModel> fetchCategoriesCallBack(List<CategoryModel> categoryModelsList);
}

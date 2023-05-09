package com.thijsEgberts.otmvscoring.database;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.database.interfaces.CategoriesDBInterface;

import java.util.ArrayList;
import java.util.List;

public class CategoryDatabaseHandler extends DatabaseHandler {

    public static final String CATEGORIES = "categories"; //path constant

    private static final String TAG = "categoryDbHandler"; //log tag

    public static DatabaseReference getCategoryRef() {
        return getInstance().getReference(CATEGORIES);
    }

    /**
     * Adds a new category model to the database.
     *
     * @param category the category model to be added to the database
     */
    public static void addNewCategoryToDB(CategoryModel category) {
        getCategoryRef().child(category.getCategoryId()).setValue(category).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "addNewCategoryToDb: Added new category to the database");
                }
            }
        });
    }

    /**
     * Fetches all category models from the database.
     *
     * @param callBack a callback interface to pass the results of the fetch to
     */
    public static void fetchCategoriesFromDB(CategoriesDBInterface callBack) {
        getCategoryRef().get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    callBack.fetchCategoriesCallBack(null);
                    Log.e(TAG, "fetchCategoriesFromDB: Failed to fetch categories from DB.", task.getException());
                }

                List<CategoryModel> categoriesList = new ArrayList<>();

                for (DataSnapshot catSnapShot : task.getResult().getChildren()) {
                    categoriesList.add(catSnapShot.getValue(CategoryModel.class));
                }

                callBack.fetchCategoriesCallBack(categoriesList);
                Log.d(TAG, "fetchCategoriesFromDB: Fetched categories from db");
            }
        });
    }
}

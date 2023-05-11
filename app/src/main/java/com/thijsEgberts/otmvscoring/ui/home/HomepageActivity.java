package com.thijsEgberts.otmvscoring.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thijsEgberts.otmvscoring.R;
import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;
import com.thijsEgberts.otmvscoring.data.util.CategoryInitializer;
import com.thijsEgberts.otmvscoring.database.CategoryDatabaseHandler;

import java.util.ArrayList;
import java.util.List;

public class HomepageActivity extends AppCompatActivity {

    private Button addCategoriesButton;
    private List<CategoryModel> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        linkUiElements();
        setButtonListeners();

        categories = CategoryInitializer.initializeCategories();
    }

    /**
     * Link the ui elements to ui objects in the class.
     */
    private void linkUiElements() {
        addCategoriesButton = (Button) findViewById(R.id.addCategoriesButton);
    }

    /**
     * Add the buttonListeners in the ui.
     */
    private void setButtonListeners() {
        addCategoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (CategoryModel cat : categories) {
                    CategoryDatabaseHandler.addNewCategoryToDB(cat);
                }
            }
        });
    }
}
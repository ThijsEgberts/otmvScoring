package com.thijsEgberts.otmvscoring.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thijsEgberts.otmvscoring.R;
import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;
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

        categories = new ArrayList<>();
        List<ScoringCriteriaModel> scoringCritCat1 = new ArrayList<>();

        scoringCritCat1.add(new ScoringCriteriaModel("Beginvoor", "Hieronder wordt de dubbele opening verstaan. Deze moet naar weerszijden zijn uitgeploegd en wel zodanig, dat de open voor schoon is en  geen losse en ongeploegde stukjes bevat. De naar weerszijden uitgeploegde sneden moeten per zijde een uniform beeld vertonen. De plaats van de middelste snede en de vorm is aan de ploeger, maar moet uniform zijn over de gehele lengte. Geen wielspoor zichtbaar.", "1"));
        scoringCritCat1.add(new ScoringCriteriaModel("Rechtheid beginvoor", "", "1a"));
        scoringCritCat1.add(new ScoringCriteriaModel("De aanstorting (1)", "De aanstorting, d.w.z. de eerste omgang rond, moet zodanig worden uitgevoerd, dat bij de eerste snede de grondbalk goed is losgesneden en de vegetatie (15-16 sneden) goed is ondergebracht. Goed gesloten over gehele lengte. Elke snede (met name de eerste) moet een volledige snede zijn, geen dun laagje grond uitgesmeerd. Geen wielspoor zichtbaar.", "2"));
        scoringCritCat1.add(new ScoringCriteriaModel("De aanstorting (2)", "De aanstorting moet van voor tot achter hetzelfde beeld vertonen en mag niet hoger of lager liggen dan de rest van de geploegde sneden. Uniforme sneden in breedte en vorm, links met rechts symetrisch . Dit is na 15 of 16 sneden  te beoordelen.", "3"));
        scoringCritCat1.add(new ScoringCriteriaModel("Rechtheid aanstorting", "", "3b"));
        scoringCritCat1.add(new ScoringCriteriaModel("Stevigheid van de ploegsnedes", "De geploegde sneden moeten stevig, compact en voldoende gekeerd zijn. Geen gaten, geen wielspoor zichtbaar.", "4"));
        scoringCritCat1.add(new ScoringCriteriaModel("Grond voor zaadbed", "De geploegde sneden moeten stevig, compact en voldoende gekeerd zijn. Geen gaten, geen wielspoor zichtbaar.", "5"));
        scoringCritCat1.add(new ScoringCriteriaModel("Uniformiteit ploegsnedes", "De geploegde sneden moeten ten opzichte van elkaar even hoog en even breed zijn (geen paring) en over de gehele lengte uniform. Voldoende geaccentueerd.", "6"));
        scoringCritCat1.add(new ScoringCriteriaModel("Dekking groen en stoppel", "Niet de eerste 15-16 sneden en de laatste 12 sneden van de eindvoor. Voldoende afgedekt voor een zaadbed. Alle groen, stoppels, e.d. moeten over het gehele perceel goed zijn ondergeploegd. Alle wortelresten dienen te zijn doorgesneden. Gebruik van voorscharen is verplicht.", "7"));
        scoringCritCat1.add(new ScoringCriteriaModel("Opbouw eindvoor", "Het betreft de laatste 12 ploegsnedes, uniform ploegwerk richting eindvoor, goede dekking groen en stoppel, voldoende grond voor een zaadbed. De eindvoor moet schoon zijn.  Laatste snede moet richting aanstorting liggen.", "8"));
        scoringCritCat1.add(new ScoringCriteriaModel("Rechtheid geploegde sneden", "", "8a"));
        scoringCritCat1.add(new ScoringCriteriaModel("Eindvoor", "De eindvoor moet zo smal mogelijk zijn en niet dieper dan normaal ploegwerk. De laatste snede moet uniform zijn met het overige ploegwerk. Geen trapje. Wielspoor parallel aan overig ploegwerk en niet te diep.  Niet meer dan een (1) trekker- en een (1) ploeg wiel spoor zichtbaar.", "9"));
        scoringCritCat1.add(new ScoringCriteriaModel("Rechtheid eindvoor", "", "9a"));
        scoringCritCat1.add(new ScoringCriteriaModel("Inzetten en uitlichten", "Betreft de eerste 2 meter. Het inzetten en uitlichten van de ploeg moet geschieden op de merkvoor die daarvoor is aangegeven en wel zodanig dat het geploegde perceel aan de kopakkers zo regelmatig en exact mogelijk wordt begrensd. Tevens is het van belang, dat de ploeg bij het inzetten zo gauw mogelijk op de voorgeschreven diepte is. Binnen de merkvoren moet alles omgeploegd en losgesneden zijn, met volle sneden, van begin tot eind. Geen wielspoor zichtbaar.", "10"));
        scoringCritCat1.add(new ScoringCriteriaModel("Algemene indruk", "Beoordeling vakmanschap ploeger, behoeft niet het gemiddelde van afzonderlijke onderdelen te zijn.", "11"));

        categories.add(new CategoryModel(scoringCritCat1, "Rondgaand wiel categorie 1", "Cat1RondgaandWiel"));

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
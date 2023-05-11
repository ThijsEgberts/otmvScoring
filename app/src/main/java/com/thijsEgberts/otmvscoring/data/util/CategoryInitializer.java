package com.thijsEgberts.otmvscoring.data.util;

import com.thijsEgberts.otmvscoring.data.model.misc.CategoryModel;
import com.thijsEgberts.otmvscoring.data.model.scoringSheet.ScoringCriteriaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A class made to initialize the categories by code.
 * Note: this class isn't meant to be used under normal use since it's best to fetch the categories from the database.
 */
@Deprecated
public class CategoryInitializer {

    /**
     * Initializes a list of the categories that are in the excel files provided to the author as of 11-5-2023.
     * This method should only be used during development
     *
     * @deprecated as of 11-5-2023 because you should fetch the categories from the database
     * @return a list of concrete categories
     */
    @Deprecated
    public static List<CategoryModel> initializeCategories() {
        List<CategoryModel> categories = new ArrayList<>();
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

        List<ScoringCriteriaModel> scoringCritCat2 = new ArrayList<>();

        scoringCritCat2.add(new ScoringCriteriaModel("Beginvoor", "Hieronder wordt de dubbele opening verstaan. Deze moet naar weerszijden zijn uitgeploegd en wel zodanig, dat de open voor schoon is en  geen losse en ongeploegde stukjes bevat. De naar weerszijden uitgeploegde sneden moeten per zijde een uniform beeld vertonen. De plaats van de middelste snede en de vorm is aan de ploeger, maar moet uniform zijn over de gehele lengte. Geen wielspoor zichtbaar.", "1"));
        scoringCritCat2.add(new ScoringCriteriaModel("Rechtheid beginvoor", "", "1a"));
        scoringCritCat2.add(new ScoringCriteriaModel("De aanstorting (1)", "De aanstorting, d.w.z. de eerste omgang rond, moet zodanig worden uitgevoerd, dat bij de eerste snede de grondbalk goed is losgesneden en de vegetatie (15-16 sneden) goed is ondergebracht. Goed gesloten over gehele lengte. Elke snede (met name de eerste) moet een volledige snede zijn, geen dun laagje grond uitgesmeerd. Geen wielspoor zichtbaar.", "2"));
        scoringCritCat2.add(new ScoringCriteriaModel("De aanstorting (2)", "De aanstorting moet van voor tot achter hetzelfde beeld vertonen en mag niet hoger of lager liggen dan de rest van de geploegde sneden. Uniforme sneden in breedte en vorm, links met rechts symetrisch . Dit  is  na 15 of 16 sneden  te beoordelen.", "3"));
        scoringCritCat2.add(new ScoringCriteriaModel("Rechtheid aanstorting", "", "3b"));
        scoringCritCat2.add(new ScoringCriteriaModel("Stevigheid van de ploegsnedes", "De geploegde sneden moeten stevig, compact en voldoende gekeerd zijn. Geen gaten, geen wielspoor zichtbaar.", "4"));
        scoringCritCat2.add(new ScoringCriteriaModel("Grond voor zaadbed", "Voldoende gekeerd, voldoende grond voor een zaadbed bewerking. Het moet mogelijk zijn een zaadbed te maken zonder dat er plantenresten boven komen.", "5"));
        scoringCritCat2.add(new ScoringCriteriaModel("Uniformiteit ploegsnedes", "De geploegde sneden moeten ten opzichte van elkaar even hoog en even breed zijn (geen paring) en over de gehele lengte uniform. Voldoende geaccentueerd.", "6"));
        scoringCritCat2.add(new ScoringCriteriaModel("Dekking groen en stoppel", "Niet de eerste 15-16 sneden en de laatste 12 sneden van de eindvoor. Voldoende afgedekt voor een zaadbed. Alle groen, stoppels, e.d. moeten over het gehele perceel goed zijn ondergeploegd. Alle wortelresten dienen te zijn doorgesneden. Gebruik van voorscharen is verplicht.", "7"));
        scoringCritCat2.add(new ScoringCriteriaModel("Opbouw eindvoor", "Het betreft de laatste 12 ploegsnedes, uniform ploegwerk richting eindvoor, goede dekking groen en stoppel, voldoende grond voor een zaadbed. De eindvoor moet schoon zijn. Laatste snede moet richting aanstorting liggen.", "8"));
        scoringCritCat2.add(new ScoringCriteriaModel("Rechtheid geploegde sneden", "", "8a"));
        scoringCritCat2.add(new ScoringCriteriaModel("Eindvoor", "De eindvoor moet zo smal mogelijk zijn en niet dieper dan normaal ploegwerk. De laatste snede moet uniform zijn met het overige ploegwerk. Geen trapje. Wielspoor parallel aan overig ploegwerk en niet te diep. Niet meer dan een (1) trekker- en een (1) ploeg wiel spoor zichtbaar.", "9"));
        scoringCritCat2.add(new ScoringCriteriaModel("Rechtheid eindvoor", "", "9a"));
        scoringCritCat2.add(new ScoringCriteriaModel("Inzetten en uitlichten", "Betreft de eerste 2 meter. Het inzetten en uitlichten van de ploeg moet geschieden op de merkvoor die daarvoor is aangegeven en wel zodanig dat het geploegde perceel aan de kopakkers zo regelmatig en exact mogelijk wordt begrensd. Tevens is het van belang, dat de ploeg bij het inzetten zo gauw mogelijk op de voorgeschreven diepte is. Binnen de merkvoren moet alles omgeploegd en losgesneden zijn, met volle sneden, van begin tot eind. Geen wielspoor zichtbaar.", "10"));
        scoringCritCat2.add(new ScoringCriteriaModel("Algemene indruk", "Beoordeling vakmanschap ploeger, behoeft niet het gemiddelde van afzonderlijke onderdelen te zijn.", "11"));

        categories.add(new CategoryModel(scoringCritCat2, "Hefploegen categorie 2", "Cat2HefPloegen"));

        List<ScoringCriteriaModel> scoringCritCat3 = new ArrayList<>();

        scoringCritCat3.add(new ScoringCriteriaModel("Beginvoor", "De open voor moet schoon zijn. Doorgesneden over hele lengte. Er mag maar 1 uitgeploegde snede zichtbaar zijn en deze moet een uniform beeld tonen over de gehele lengte. Er mag geen ongeploegd land en vegetatie zichtbaar zijn tussen de voor en de uitgeploegde snede. Geen wielspoor zichtbaar.", "1"));
        scoringCritCat3.add(new ScoringCriteriaModel("Rechtheid beginvoor", "", "1a"));
        scoringCritCat3.add(new ScoringCriteriaModel("De aanstorting", "De aanstorting kan pas worden beoordeeld als deze voltooid is. De uitgeploegde snede van de openingsvoor moet exact worden teruggekeerd. De aanstorting moet zodanig worden uitgevoerd, dat bij de eerste snede de grondbalk goed is losgesneden en de vegetatie goed is ondergebracht. Uniforme sneden in breedte en vorm, goed gesloten over de gehele lengte. Elke snede (met name de eerste) moet een volledige snede zijn, geen dun laagje grond uitgesmeerd. Geen wielspoor zichtbaar.", "2"));
        scoringCritCat3.add(new ScoringCriteriaModel("Rechtheid aanstorting", "", "2b"));
        scoringCritCat3.add(new ScoringCriteriaModel("De geer", "Het inzetten en uitlichten van de geer, geen gaten en bulten, geen vegetatie zichtbaar. Alle grond moet goed geploegd zijn. Recht in- en uitgereden. Geen halve of stukjes van snedes van de aanstorting zichtbaar (geen uniformiteit).", "3"));
        scoringCritCat3.add(new ScoringCriteriaModel("Aanstorting van de geer", "1 volle snede dient zichtbaar te zijn over de gehele lengte. Recht, uniform, conform aan het overige ploegwerk en egaal. Moet goed aansluiten op het overige ploegwerk. Geen trekkerwielspoor.", "4"));
        scoringCritCat3.add(new ScoringCriteriaModel("Stevigheid van de ploegsnedes", "De geploegde sneden moeten stevig, compact en voldoende gekeerd zijn. Geen gaten, geen wielspoor zichtbaar.", "5"));
        scoringCritCat3.add(new ScoringCriteriaModel("Grond voor zaadbed", "Voldoende gekeerd, voldoende grond voor een zaadbed bewerking. Het moet mogelijk zijn een zaadbed te maken zonder dat er plantenresten boven komen.", "6"));
        scoringCritCat3.add(new ScoringCriteriaModel("Uniformiteit ploegsnedes", " De geploegde sneden moeten ten opzichte van elkaar even hoog en even breed zijn (geen paring) en over de gehele lengte uniform. Voldoende geaccentueerd.", "7"));
        scoringCritCat3.add(new ScoringCriteriaModel("Dekking groen en stoppel", "Niet de eerste 8 - 9 sneden. Voldoende afgedekt voor een zaadbed. Alle groen, stoppels, e.d. moeten over het gehele perceel goed zijn ondergeploegd. Alle wortelresten dienen te zijn doorgesneden. Gebruik van voorscharen is verplicht.", "8"));
        scoringCritCat3.add(new ScoringCriteriaModel("Afwerking derde wendakker", "Goede dekking groen en stoppel, uniforme sneden in breedte en vorm die goed aansluiten bij het overige ploegwerk. 16 sneden zichtbaar. Exact 1,50 m van de buurman, geen geer, gemeten op 5 meter van de merkvoor.", "9"));
        scoringCritCat3.add(new ScoringCriteriaModel("Rechtheid geploegde sneden", "", "9a"));
        scoringCritCat3.add(new ScoringCriteriaModel("Eindvoor", "De laatste 2 à 3 sneden moeten uniform zijn aan het overige ploegwerk. De eindvoor moet schoon zijn", "10"));
        scoringCritCat3.add(new ScoringCriteriaModel("Rechtheid eindvoor", "", "10a"));
        scoringCritCat3.add(new ScoringCriteriaModel("Inzetten en uitlichten", "Betreft de eerste 2 meter. Het inzetten en uitlichten van de ploeg moet geschieden op de merkvoor die daarvoor is aangegeven en wel zodanig dat het geploegde perceel aan de kopakkers zo regelmatig en exact mogelijk wordt begrensd. Tevens is het van belang, dat de ploeg bij het inzetten zo gauw mogelijk op de voorgeschreven diepte is. Binnen de merkvoren moet alles omgeploegd en losgesneden zijn, met volle sneden, van begin tot eind. Geen wielspoor zichtbaar.", "11"));
        scoringCritCat3.add(new ScoringCriteriaModel("Algemene indruk", "Beoordeling vakmanschap ploeger, behoeft niet het gemiddelde van afzonderlijke onderdelen te zijn.", "12"));

        categories.add(new CategoryModel(scoringCritCat3, "Heen en weergaand categorie 3", "Cat3HeenEnWeerGaand"));

        List<ScoringCriteriaModel> scoringCritCat4 = new ArrayList<>();

        scoringCritCat4.add(new ScoringCriteriaModel("Beginvoor", "De open voor moet schoon zijn. Doorgesneden over hele lengte. Er mag maar 1 uitgeploegde snede zichtbaar zijn en deze moet een uniform beeld tonen over de gehele lengte. Er mag geen ongeploegd land en vegetatie zichtbaar zijn tussen de voor en de uitgeploegde snede. Geen wielspoor zichtbaar.", "1"));
        scoringCritCat4.add(new ScoringCriteriaModel("Rechtheid beginvoor", "", "1a"));
        scoringCritCat4.add(new ScoringCriteriaModel("De aanstorting", "De aanstorting kan pas worden beoordeeld als deze voltooid is. De uitgeploegde snede van de openingsvoor moet exact worden teruggekeerd. De aanstorting moet zodanig worden uitgevoerd, dat bij de eerste snede de grondbalk goed is losgesneden en de vegetatie goed is ondergebracht. Uniforme sneden in breedte en vorm, goed gesloten over de gehele lengte. Elke snede (met name de eerste) moet een volledige snede zijn, geen dun laagje grond uitgesmeerd. Geen wielspoor zichtbaar.", "2"));
        scoringCritCat4.add(new ScoringCriteriaModel("Rechtheid aanstorting", "", "2b"));
        scoringCritCat4.add(new ScoringCriteriaModel("Stevigheid van de ploegsnedes", "De geploegde sneden moeten stevig, compact en voldoende gekeerd zijn. Geen gaten, geen wielspoor zichtbaar.", "3"));
        scoringCritCat4.add(new ScoringCriteriaModel("Grond voor zaadbed", "Voldoende gekeerd, voldoende grond voor een zaadbed bewerking. Het moet mogelijk zijn een zaadbed te maken zonder dat er plantenresten boven komen.", "4"));
        scoringCritCat4.add(new ScoringCriteriaModel("Uniformiteit ploegsnedes", "De geploegde sneden moeten ten opzichte van elkaar even hoog en even breed zijn (geen paring) en over de gehele lengte uniform. Voldoende geaccentueerd.", "5"));
        scoringCritCat4.add(new ScoringCriteriaModel("Dekking groen en stoppel", "Niet de eerste 8 - 9 sneden. Voldoende afgedekt voor een zaadbed. Alle groen, stoppels, e.d. moeten over het gehele perceel goed zijn ondergeploegd. Alle wortelresten dienen te zijn doorgesneden. Gebruik van voorscharen is verplicht.", "6"));
        scoringCritCat4.add(new ScoringCriteriaModel("Opbouw eindvoor", "Het betreft de laatste 12 ploegsnedes, uniform aan het overige ploegwerk in breedte en vorm. Goede dekking groen en stoppel, voldoende grond voor een zaadbed.", "7"));
        scoringCritCat4.add(new ScoringCriteriaModel("Rechtheid geploegde sneden", "", "7a"));
        scoringCritCat4.add(new ScoringCriteriaModel("Eindvoor", "Het betreft de laatste 2 gangen. Uniforme sneden die goed aansluiten bij het overige ploegwerk. Niet meer dan een (1) trekker- en een (1) ploeg wiel spoor zichtbaar. De eindvoor moet schoon zijn. Exact afgeploegd tot aan de eigen aanstorting. Geen geer.", "8"));
        scoringCritCat4.add(new ScoringCriteriaModel("Rechtheid eindvoor", "", "8a"));
        scoringCritCat4.add(new ScoringCriteriaModel("Inzetten en uitlichten", "Betreft de eerste 2 meter. Het inzetten en uitlichten van de ploeg moet geschieden op de merkvoor die daarvoor is aangegeven en wel zodanig dat het geploegde perceel aan de kopakkers zo regelmatig en exact mogelijk wordt begrensd. Tevens is het van belang, dat de ploeg bij het inzetten zo gauw mogelijk op de voorgeschreven diepte is. Binnen de merkvoren moet alles omgeploegd en losgesneden zijn, met volle sneden, van begin tot eind. Geen wielspoor zichtbaar.", "9"));
        scoringCritCat4.add(new ScoringCriteriaModel("Algemene indruk", "Beoordeling vakmanschap ploeger, behoeft niet het gemiddelde van afzonderlijke onderdelen te zijn.", "10"));

        categories.add(new CategoryModel(scoringCritCat4, "Parallel ploegen categorie 4", "Cat4ParallelPloegen"));

        return categories;
    }
}

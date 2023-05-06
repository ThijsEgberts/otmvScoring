package com.thijsEgberts.otmvscoring.data.model.scoringSheet;

public enum CompetitionCategories {
    WIEL_PLOEGEN (1),
    HEF_PLOEGEN (2),
    HEEN_EN_WEER_GAAND_PLOEGEN (3),
    PARALLEL_PLOEGEN (4);

    private int categoryNumber;
    CompetitionCategories(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

}

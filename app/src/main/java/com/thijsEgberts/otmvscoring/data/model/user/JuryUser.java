package com.thijsEgberts.otmvscoring.data.model.user;

public class JuryUser extends User {

    public JuryUser(String UID, String displayName, String fistName, String lastName) {
        super(UID, displayName, fistName, lastName);
    }

    public JuryUser(String UID, String firstName, String lastName) {
        super(UID, firstName, lastName);
    }
}

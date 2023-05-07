package com.thijsEgberts.otmvscoring.data.model.user;

/**
 * A model class corresponding to users who can jury a competition.
 */
public class JuryUser extends User {

    public JuryUser(String UID, String displayName, String fistName, String lastName) {
        super(UID, displayName, fistName, lastName);
        this.userRole = UserRoles.JURY;
    }

    public JuryUser(String UID, String firstName, String lastName) {
        super(UID, firstName, lastName);
        this.userRole = UserRoles.JURY;
    }
}

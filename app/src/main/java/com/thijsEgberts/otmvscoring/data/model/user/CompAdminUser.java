package com.thijsEgberts.otmvscoring.data.model.user;

/**
 * A model class corresponding to users who can manage competitions.
 */
public class CompAdminUser extends User {
    public CompAdminUser(String UID, String displayName, String fistName, String lastName) {
        super(UID, displayName, fistName, lastName);
        this.userRole = UserRoles.COMP_ADMIN;
    }

    public CompAdminUser(String UID, String firstName, String lastName) {
        super(UID, firstName, lastName);
        this.userRole = UserRoles.COMP_ADMIN;
    }
}

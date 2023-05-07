package com.thijsEgberts.otmvscoring.data.model.user;

/**
 * A user model class corresponding to full admin users of the app.
 */
public class AdminUser extends User {

    public AdminUser(String UID, String displayName, String fistName, String lastName) {
        super(UID, displayName, fistName, lastName);
        this.userRole = UserRoles.ADMIN;
    }

    public AdminUser(String UID, String firstName, String lastName) {
        super(UID, firstName, lastName);
        this.userRole = UserRoles.ADMIN;
    }
}

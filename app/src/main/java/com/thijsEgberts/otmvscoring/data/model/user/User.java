package com.thijsEgberts.otmvscoring.data.model.user;

/**
 * Data class to represent a basic user.
 */
public abstract class User {

    protected String UID;
    protected String displayName;
    protected String fistName;
    protected String lastName;
    protected UserRoles userRole;


    public User(String UID, String displayName, String fistName, String lastName) {
        this.UID = UID;
        this.displayName = displayName;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public User(String UID, String firstName, String lastName) {
        this(UID, firstName + " " + lastName, firstName, lastName);
    }

    public String getUID() {
        return UID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }
}

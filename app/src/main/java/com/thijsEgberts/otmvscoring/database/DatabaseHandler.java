package com.thijsEgberts.otmvscoring.database;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Database handler class to provide methods to provide a facade for common tasks
 */
public class DatabaseHandler {

    //public constants
    public static final String DATABASE_URL = "https://console.firebase.google.com/project/otmv-72337/database/otmv-72337-default-rtdb/data/~2F";
    public static final String USERS = "users";

    //private constants
    private static final FirebaseDatabase DATABASE_INSTANCE = FirebaseDatabase.getInstance(DATABASE_URL);
    private static final DatabaseReference USERS_REF = getInstance().getReference(USERS);

    /**
     * This method returns an instance of the firebase database.
     *
     * @return database instance variable
     */
    public static FirebaseDatabase getInstance() {
        return DATABASE_INSTANCE;
    }

    /**
     * This method returns a reference to the users entry in the firebase database.
     *
     * @return database reference for the users entry
     */
    public static DatabaseReference getUsersRef() {
        return USERS_REF;
    }

    public static FirebaseUser getCurrentAuthUser() {
        return FirebaseAuth.getInstance().getCurrentUser();
    }
}

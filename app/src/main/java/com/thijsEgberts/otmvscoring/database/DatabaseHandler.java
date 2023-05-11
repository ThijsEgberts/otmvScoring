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
    public static final String DATABASE_URL = "https://otmv-72337-default-rtdb.europe-west1.firebasedatabase.app/";

    public static final String USERS = "users";

    /**
     * This method returns an instance of the firebase database.
     *
     * @return database instance variable
     */
    public static FirebaseDatabase getInstance() {
        return FirebaseDatabase.getInstance(DATABASE_URL);
    }

    /**
     * This method returns a reference to the users entry in the firebase database.
     *
     * @return database reference for the users entry
     */
    public static DatabaseReference getUsersRef() {
        return getInstance().getReference(USERS);
    }

    public static FirebaseUser getCurrentAuthUser() {
        return FirebaseAuth.getInstance().getCurrentUser();
    }
}

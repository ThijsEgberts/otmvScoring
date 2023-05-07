package com.thijsEgberts.otmvscoring.data.model.user;

/**
 * Enum to keep track of all the different user roles.
 */
public enum UserRoles {
    JURY (0),
    COMP_ADMIN (1),
    ADMIN (2);

    private int roleId;
    UserRoles(int roleId) {
        this.roleId = roleId;
    }
}

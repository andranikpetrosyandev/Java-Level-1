package com.exam.exam3.service.impl;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String passportNumber) {
        super(String.format(
                "User having a passport number - %s not found",
                passportNumber
        ));
    }

    public UserNotFoundException(final Long id) {
        super(String.format(
                "User having a id - %s not found",
                id
        ));
    }
}

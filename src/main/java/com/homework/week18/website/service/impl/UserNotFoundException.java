package com.homework.week18.website.service.impl;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userName) {
        super(String.format(
                "User having a username - %s not found",
                userName
        ));
    }
}

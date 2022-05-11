package com.homework.week18.website.service.core;

import org.springframework.util.Assert;

public class UserCreateParams {
    private final String firstName;
    private final String secondName;
    private final String userName;
    private final String password;

    public UserCreateParams(String firstName, String secondName, String userName, String password) {
        Assert.hasText(firstName, "firstName should have a text");
        Assert.hasText(secondName, "secondName should have a text");
        Assert.hasText(userName, "username should have a text");
        Assert.hasText(password, "password should have a text");
        this.firstName = firstName;
        this.secondName = secondName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

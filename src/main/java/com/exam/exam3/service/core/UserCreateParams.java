package com.exam.exam3.service.core;

import org.springframework.util.Assert;

public class UserCreateParams {
    private String firstName;
    private String secondName;
    private String passportNumber;

    public UserCreateParams(String firstName, String secondName, String passportNumber) {
        Assert.notNull(firstName, "The first_name should not be null");
        Assert.notNull(secondName, "The second_name should not be null");
        Assert.notNull(passportNumber, "The passport number should not be null");
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}

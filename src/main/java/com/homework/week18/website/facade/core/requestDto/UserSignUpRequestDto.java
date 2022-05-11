package com.homework.week18.website.facade.core.requestDto;

import org.springframework.util.Assert;

public class UserSignUpRequestDto {

    private String firstName;
    private String secondName;
    private String username;
    private String password;

    public UserSignUpRequestDto(String firstName, String secondName, String username, String password) {
        Assert.hasText(firstName, "firstName should have a text");
        Assert.hasText(secondName, "secondName should have a text");
        Assert.hasText(username, "username should have a text");
        Assert.hasText(password, "password should have a text");
        this.firstName = firstName;
        this.secondName = secondName;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

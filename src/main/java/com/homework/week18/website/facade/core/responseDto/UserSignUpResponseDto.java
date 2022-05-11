package com.homework.week18.website.facade.core.responseDto;

import com.homework.week18.website.entity.User;

import java.util.List;

public class UserSignUpResponseDto {
    private String username;
    private String firstName;
    private String secondName;

    private List<String> errorList;

    public UserSignUpResponseDto(List<String> errorList) {
        this.errorList = errorList;
    }

    public UserSignUpResponseDto(String username, String firstName, String secondName) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "UserSignUpResponseDto{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", errorList=" + errorList +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<String> getErrorList() {
        return errorList;
    }
}

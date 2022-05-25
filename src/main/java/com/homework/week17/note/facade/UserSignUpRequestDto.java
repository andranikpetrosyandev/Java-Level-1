package com.homework.week17.note.facade;

public class UserSignUpRequestDto {

    private String firstName;
    private String secondName;

    public UserSignUpRequestDto(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}

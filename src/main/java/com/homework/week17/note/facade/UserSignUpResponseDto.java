package com.homework.week17.note.facade;

public class UserSignUpResponseDto {
    private final String username;


    public UserSignUpResponseDto(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "UserSignUpResponseDto{" +
                "username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }
}

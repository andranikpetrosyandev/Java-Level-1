package com.homework.week18.website.facade.core.requestDto;

public class UserPostSRequestDto {
    private String username;

    public UserPostSRequestDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "UserPostSRequestDto{" +
                "username='" + username + '\'' +
                '}';
    }
}

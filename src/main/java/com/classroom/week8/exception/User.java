package com.classroom.week8.exception;

public class User {
    private String username;
    private String firstName;

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public User(String username, String firstName) {
        if(username == null){
            throw new IllegalArgumentException("Username is null");
        } if(firstName ==null){
            throw new IllegalArgumentException("firstName is null");
        }
        this.username = username;
        this.firstName = firstName;
    }


}

package com.homework.week17.note.service.core;

import org.springframework.util.Assert;

public class CreateUserParams {
    private final String username;
    private final String firstName;
    private final String secondName;

    public CreateUserParams(String firstName, String secondName) {
        Assert.hasText(firstName, "The first name should not be null");
        Assert.hasText(secondName, "The second name should not be null");

        this.username = firstName + "_" + secondName;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "CreateUserParams{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateUserParams that = (CreateUserParams) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return secondName != null ? secondName.equals(that.secondName) : that.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        return result;
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
}

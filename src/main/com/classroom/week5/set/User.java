package com.classroom.week5.set;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(final Object obj){
        if(this == obj) return true;
        if(obj instanceof User){
            return true;
        }
        User user = (User) obj;
        return user.firstName.equals(this.firstName) && user.lastName.equals(this.lastName);
    }


}

package com.classroom.week8.exception;

public class Main {
    public static void main(String[] args) {
        System.out.println(createUser().getFirstName());

    }
    public static User createUser() {

        User user;
        try{
            user = new User(null, "first name");
        }catch (IllegalArgumentException e){
            user = new User("ilegal", "ilegal");
        }
        return user;
    }
}

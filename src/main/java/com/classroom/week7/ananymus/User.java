package com.classroom.week7.ananymus;


public interface User {

    static User ofImpl(String name, int age) {
        return new UserImpl(name, age);
    }
    static User of(String name, int age) {
        return new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
    }
    String getName();

    int getAge();
}

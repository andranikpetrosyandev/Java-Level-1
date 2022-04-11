package com.classroom.week7.ananymus;

public class UserImpl implements User {

    private String name;
    private int age;

    public UserImpl(final String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

package com.homework.week15.sql.generate;

@Table(name = "users")
public class User implements Model {

    @Column(name = "full_name")
    private String name;


    @Column(name = "age")
    private Integer age;

    private Integer year;

    public User(String name, Integer age, Integer year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
}

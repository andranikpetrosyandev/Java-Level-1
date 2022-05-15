package com.classroom.week17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private  Animal animal;

    public Person(){

    }

    public Person(Animal animal) {
        this.animal = animal;
    }
}

package com.classroom.week9.clone;

public class Car implements ConstructorClonable<Car> {
    private int age;

    public Car(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car" + age;
    }

    @Override
    public Car doClone() {
        return new Car(this.age);
    }
}

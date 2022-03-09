package com.classroom.week9.clone;

public class Computer implements ConstructorClonable<Computer> {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public Computer doClone() {
        return new Computer(this.brand);
    }

    @Override
    public String toString() {
        return "Computer" + brand;
    }
}

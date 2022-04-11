package com.classroom.week7.clone;

public class PredatorAnimal extends Animal{

    public PredatorAnimal(String name) {
        super(AnimalType.PREDATOR, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new PredatorAnimal("Tiger");
        Animal clonedPredator = tiger.clone();
        System.out.println("zxczxczczc"+clonedPredator.getClass());

    }
}

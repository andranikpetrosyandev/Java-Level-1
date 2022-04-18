package com.classroom.week7.clone;

public class Animal implements Cloneable{

    private AnimalType type;
    private  String name;

    public Animal(AnimalType type,String name){
        this.name = name;
        this.type = type;
    }

    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal tiger = new Animal(AnimalType.PREDATOR,"Tiger");
        System.out.println(tiger.clone().getClass());
    }
}

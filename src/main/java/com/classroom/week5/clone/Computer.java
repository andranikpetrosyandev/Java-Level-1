package com.classroom.week5.clone;

public class Computer implements Cloneable{
    private Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //sdkman
        //sdk list java
        //sdk install java 15.0.2-open
        return (Computer) super.clone();
    }
}

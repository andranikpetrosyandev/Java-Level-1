package com.classroom.week5.hirarchy;

public class CircleFigure implements Figure{

    private double radius;

    public  CircleFigure(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * this.radius;
    }

    @Override
    public double primiter() {
        return 2 * Math.PI * this.radius;
    }
}

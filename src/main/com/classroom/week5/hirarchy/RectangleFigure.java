package com.classroom.week5.hirarchy;

public class RectangleFigure implements Figure{

    private double width;
    private double height;

    public RectangleFigure(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width+height;
    }

    @Override
    public double primiter() {
        return 2*(width+height);
    }
}

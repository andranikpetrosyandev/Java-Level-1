package com.classroom.week5.figure;

public class Figure {
    private Type figureType ;
    private double width;
    private double height;
    private double radius;

    public Figure(double width, double height) {
        this.figureType = Type.REACTANGLE;
        this.width = width;
        this.height = height;
    }

    public Figure(double radius){
        this.figureType = Type.CIRCLE;
        this.radius = radius;
    }



    public double area(){
        if(figureType == Type.REACTANGLE){
            return this.width*this.height;
        }else{
            return 2* Math.PI* radius;
        }
    }

    public double perimeter(){
        return 0.0;
    }
    public String toString(){
        return "";
    }


    public static Figure ofRectangle(double width,double height){
        return new Figure(width,height);
    }

    public static Figure ofCircle(double width){
        return new Figure(width);
    }
}



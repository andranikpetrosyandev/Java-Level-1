package com.classroom.week7;

public enum ColorType {
    GREEN("green color",0xFF00FF00),
    RED("red color",0xFFFF0000),
    ORANGE("orange color",0xFF0000FF);


    private String colorStringRepresentation;
    private int intValue;

    ColorType(String colorStringRepresentation,int intValue){
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = intValue;
        System.out.println("The constructor was invoke"+colorStringRepresentation);

    }
    ColorType(String colorStringRepresentation){
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = 0;
        System.out.println("The constructor was invoke"+colorStringRepresentation);

    }
    public static String getColor(ColorType colors)
    {
        if(colors ==  ColorType.GREEN){
            return "Green Color";
        }
        if(colors ==  ColorType.RED){
            return "Red Color";
        }
        if(colors ==  ColorType.ORANGE){
            return "Orange Color";
        }
        return "default value";
    }

    public String toString(){
       if(this == ColorType.RED){
           return "Red Color";
       }
       if(this == ColorType.GREEN){
           return "Green Color";
       }
        if(this == ColorType.ORANGE){
            return "Orange Color";
        }
       return super.toString();

    }

    public String getColorStringRepresentation(){
        return colorStringRepresentation;
    }
    public int getIntValue(){
        return intValue;
    }
}

package com.homework.week7.ui;

public class UiButton extends UIView{
    private String buttonColor;

    public UiButton(String buttonColor,double width,double heigth){
        this.buttonColor = buttonColor;
        this.width = width;
        this.height = heigth;
    }

    public static UiButton createUiButton(String buttonColor,double width,double heigth){
        return new UiButton(buttonColor,width,heigth);
    }

    @Override
    public String click() {
        return "clicked on a button having a color:" + buttonColor +", width:"+ width+", height:"+ height;

    }
}

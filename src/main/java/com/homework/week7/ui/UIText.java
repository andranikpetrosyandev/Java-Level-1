package com.homework.week7.ui;

public class UIText extends UIView {
    private String textColor;

    private UIText(String textColor, double width, double heigth) {
        this.textColor = textColor;
        this.width = width;
        this.height = heigth;
    }

    public static UIText createUiText(String textColor, double width, double heigth) {
        return new UIText(textColor, width, heigth);
    }

    @Override
    public String click() {
        return "clicked on a button having a color" + textColor + ", width:" + width + ", height:" + height;

    }
}

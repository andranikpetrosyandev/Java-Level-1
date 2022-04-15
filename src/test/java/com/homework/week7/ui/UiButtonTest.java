package com.homework.week7.ui;


class UiButtonTest {

    public static void main(String[] args) {
        UIView uiButton = UiButton.createUiButton("Red",3.5,3.8);
        System.out.println(uiButton.click());
    }


}
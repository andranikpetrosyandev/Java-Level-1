package com.homework.week7.clone;

class LightTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light onLight = Light.onLight();
        Light offLight = Light.offLight();

        Light clonabelOnLight = onLight.clone();
        Light clonabelOffLight = offLight.clone();

        System.out.println(clonabelOnLight.toString());
        System.out.println(clonabelOffLight.toString());

    }

}
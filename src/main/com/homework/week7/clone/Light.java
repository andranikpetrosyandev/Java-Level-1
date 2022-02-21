package com.homework.week7.clone;

public class Light implements Cloneable {
    private final LightType lightType;

    private Light(LightType lightType) {
        this.lightType = lightType;
    }

    public static Light onLight() {
        return new Light(LightType.ON);
    }

    public static Light offLight() {
        return new Light(LightType.OFF);
    }

    public String toString() {
        return "This is " + this.lightType + " Object";
    }

    protected Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}

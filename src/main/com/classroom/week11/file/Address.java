package com.classroom.week11.file;

import java.io.Serializable;

public class Address  implements Serializable {
    private String country;
    private int number;

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

}

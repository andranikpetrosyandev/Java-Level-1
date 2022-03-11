package com.homework.week9.donate;

public class SmartPhone extends Product {

    SmartPhone(double price) {
        super();
        setPrice(price);
    }

    @Override
    public double donationAmount() {
        return getPrice() * 5 / 100;
    }

    @Override
    public String toString() {
        return "SmartPhone";
    }
}

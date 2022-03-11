package com.homework.week9.donate;

public class SmartWatch extends Product {

    SmartWatch(double price) {
        super();
        this.setPrice(price);

    }

    @Override
    public double donationAmount() {
        return getPrice() * 5 / 100;
    }

    @Override
    public String toString() {
        return "SmartWatch";
    }
}

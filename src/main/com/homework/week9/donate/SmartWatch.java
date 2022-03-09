package com.homework.week9.donate;

public class SmartWatch extends Product {

    SmartWatch(double price) {
        super();
        this.price = price;
    }

    @Override
    public double donationAmount() {
        return price * 5 / 100;
    }

}

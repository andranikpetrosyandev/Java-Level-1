package com.homework.week9.donate;

public class SmartPhone extends Product {
    private double price;

    SmartPhone(double price){
        super();
        this.price = price;
    }
    @Override
    public double donationAmount() {
        return price * 5 / 100;
    }
}

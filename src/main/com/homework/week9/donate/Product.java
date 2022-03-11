package com.homework.week9.donate;

public abstract class Product implements Donatable {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

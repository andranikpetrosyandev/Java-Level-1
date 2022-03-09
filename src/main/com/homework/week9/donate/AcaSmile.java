package com.homework.week9.donate;

public class AcaSmile<T extends Donatable> {

    private double donateAmount;
    private String[] list = new String[100];
    private int size = 0;

    void buyWithDonation(T t) {
        list[size++] = t.getClass().getSimpleName() + " successfully purchased and donation amount is " + t.donationAmount();
        donateAmount += t.donationAmount();
    }

    public double getDonateAmount() {
        return donateAmount;
    }

    public String[] purchaseList() {
        return this.list;
    }


}

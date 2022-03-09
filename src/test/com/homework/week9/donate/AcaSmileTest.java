package com.homework.week9.donate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AcaSmileTest {
    private AcaSmile<Product> testObject = new AcaSmile<>();


    @Test
    public void testWhenNothingIsBought() {
        Assertions.assertEquals(0.0, testObject.getDonateAmount());
    }

    @Test
    public void testWhenOneSmartphoneIsBought() {
        SmartPhone smartPhone = new SmartPhone(100);
        testObject.buyWithDonation(smartPhone);
        Assertions.assertEquals(5.0, testObject.getDonateAmount());
    }

    @Test
    public void testWhenOneSmartphoneAndOneWatchIsBought() {
        SmartPhone smartPhone = new SmartPhone(100);
        Watch watch = new Watch(200);

        testObject.buyWithDonation(smartPhone);
        testObject.buyWithDonation(watch);
        Assertions.assertEquals(15.0, testObject.getDonateAmount());
    }

    @Test
    public void testWhenOneSmartphoneOneWatchAndOneSmartWatchIsBought() {
        SmartPhone smartPhone = new SmartPhone(100);
        SmartWatch smartWatch = new SmartWatch(200);
        Watch watch = new Watch(1000);
        testObject.buyWithDonation(smartPhone);
        testObject.buyWithDonation(watch);
        testObject.buyWithDonation(smartWatch);
        Assertions.assertEquals(65.0, testObject.getDonateAmount());
    }

    @Test
    public void testEmptyPurchaseList() {
        Assertions.assertEquals(null, testObject.purchaseList()[0]);
    }

    @Test
    public void testPurchaseListHas3DfferentProductsLog() {
        SmartPhone smartPhone = new SmartPhone(100);
        SmartWatch smartWatch = new SmartWatch(200);
        Watch watch = new Watch(1000);

        testObject.buyWithDonation(smartPhone);
        testObject.buyWithDonation(watch);
        testObject.buyWithDonation(smartWatch);

        Assertions.assertEquals("SmartPhone successfully purchased and donation amount is 5.0", testObject.purchaseList()[0]);
        Assertions.assertEquals("Watch successfully purchased and donation amount is 50.0", testObject.purchaseList()[1]);
        Assertions.assertEquals("SmartWatch successfully purchased and donation amount is 10.0", testObject.purchaseList()[2]);


    }
}
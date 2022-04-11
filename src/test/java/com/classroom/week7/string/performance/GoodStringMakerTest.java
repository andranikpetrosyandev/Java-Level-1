package com.classroom.week7.string.performance;

import static org.junit.jupiter.api.Assertions.*;

class GoodStringMakerTest {
    public static void main(String[] args) {
        StringMaker goodStringMaker =  StringMaker.ofGood();
        StringMakerResult result = goodStringMaker.make(1,100000);
        System.out.println(result.getString());
        System.out.println(result.getTime());
    }
}
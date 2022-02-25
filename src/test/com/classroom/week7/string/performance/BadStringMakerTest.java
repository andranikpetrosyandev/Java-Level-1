package com.classroom.week7.string.performance;

import static org.junit.jupiter.api.Assertions.*;

class BadStringMakerTest {

    public static void main(String[] args) {
        StringMaker stringMaker = StringMaker.ofBad();
        StringMakerResult result  = stringMaker.make(1,100000);
        System.out.println(result.getString());
        System.out.println(result.getTime());


        StringMaker[] array = new StringMaker[3];
        array[0] = StringMaker.ofBad();
        array[1] = StringMaker.ofGood();
        array[2] = StringMaker.ofBad();

        for (StringMaker maker : array) {
            if(maker instanceof LowPerformance){
                System.out.println("THe String Maker has low performance");
            }
        }

    }
}
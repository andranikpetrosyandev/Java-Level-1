package com.classroom.week7.string.performance;

public class BadStringMaker implements StringMaker,LowPerformance {

    @Override
    public StringMakerResult make(int start, int end) {
        String numbersSumString ="";
        long startTime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            numbersSumString+=i;
        }
        return new StringMakerResult(numbersSumString,System.currentTimeMillis()-startTime);
    }

}

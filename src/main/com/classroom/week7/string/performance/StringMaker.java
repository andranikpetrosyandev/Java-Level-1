package com.classroom.week7.string.performance;

public interface StringMaker {
    StringMakerResult make(int a, int b);

    static StringMaker ofBad() {
        return new BadStringMaker();
    }

    static StringMaker ofGood() {
        return new GoodStringMaker();
    }
}

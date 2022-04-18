package com.classroom.week7.annotations;

import com.classroom.week7.string.performance.StringMakerResult;

public interface StringMaker {
    StringMakerResult make(int a, int b);

    static StringMaker ofBad() {
        return new BedStringMaker();
    }

    static StringMaker ofGood() {
        return new GoodStringMaker();
    }
}

package com.homework.week9.tuple2;

public class Tuple2<T1, T2> {
    private T1 firstParam;
    private T2 secondParam;

    public Tuple2(T1 t1, T2 t2) {
        this.firstParam = t1;
        this.secondParam = t2;
    }

    public T1 getFirstParam() {
        return firstParam;
    }

    public T2 getSecondParam() {
        return secondParam;
    }
}


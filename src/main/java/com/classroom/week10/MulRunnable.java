package com.classroom.week10;

public class MulRunnable implements Runnable {
    private int a, b;

    public MulRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(a * b);
    }

}

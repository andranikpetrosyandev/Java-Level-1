package com.classroom.week10;

public class SubtractRunnable implements Runnable {
    private int a, b;

    public SubtractRunnable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(a - b);
    }

}

package com.classroom.week7.timer;


class GoodTimerTest {
    public static void main(String[] args) {
        Timer timer = new GoodTimer(new Action() {
            @Override
            public void doAction() {
                System.out.println("hello");
            }
        });
        timer.start();
    }


}
package com.homework.week12.stopwatch;


public class StopWatch {

    TimeFormatStrategy formatTimeStrategy;

    public StopWatch(DisplayType type) {
        formatTimeStrategy = type.formatTime();
    }

    public void start() {
        long milisec = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(10);
                System.out.println(formatTimeStrategy.formatTime(milisec));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}

package com.homework.week12.stopwatch;


public class StopWatch {

    private TimeFormatStrategy formatTimeStrategy;

    public StopWatch(DisplayType type) {
        formatTimeStrategy = type.timeStrategy();
    }

    public void start() {
        long milisec = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(formatTimeStrategy.formatTime(milisec));

        }

    }


}

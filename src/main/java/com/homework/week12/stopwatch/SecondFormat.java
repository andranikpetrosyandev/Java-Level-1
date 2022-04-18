package com.homework.week12.stopwatch;

public class SecondFormat implements TimeFormatStrategy {
    @Override
    public String formatTime(long milliseconds) {
        long seconds = (System.currentTimeMillis() - milliseconds) / 1000;
        String secondsString = seconds <= 9 ? "0" + seconds : Long.toString(seconds);
        return secondsString;
    }
}

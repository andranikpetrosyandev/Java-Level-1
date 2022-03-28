package com.homework.week12.stopwatch;

public class SecondFormat implements TimeFormatStrategy {
    @Override
    public String formatTime(long miliseconds) {
        long elapsedTimeInMillis = System.currentTimeMillis() - miliseconds;
        long seconds = elapsedTimeInMillis / 1000;
        String secondsString = seconds < 10 ? "0" + seconds : Long.toString(seconds);
        return secondsString;
    }
}

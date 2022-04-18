package com.homework.week12.stopwatch;

public class MilisecondsAndSecondFormat implements TimeFormatStrategy {
    @Override
    public String formatTime(long milliseconds) {
        long elapsedTimeInMillis = System.currentTimeMillis() - milliseconds;
        long seconds = elapsedTimeInMillis / 1000;
        long millis = elapsedTimeInMillis - seconds * 1000;
        String secondsString = seconds < 10 ? "0" + seconds : Long.toString(seconds);
        String millisString = millis < 10 ? "00" + millis : millis < 100 ? "0" + millis : Long.toString(millis);
        return secondsString + "." + millisString;
    }
}

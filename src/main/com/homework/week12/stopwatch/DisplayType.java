package com.homework.week12.stopwatch;

public enum DisplayType {
    SECONDS_AND_MILLIS {
        @Override
        public TimeFormatStrategy formatTime() {
            return new MilisecondsAndSecondFormat();
        }
    }, SECONDS {
        @Override
        public TimeFormatStrategy formatTime() {
            return new SecondFormat();
        }
    };


    public abstract TimeFormatStrategy formatTime();
}

package com.homework.week12.stopwatch;

public enum DisplayType {
    SECONDS_AND_MILLIS {
        @Override
        public TimeFormatStrategy timeStrategy() {
            return new MilisecondsAndSecondFormat();
        }
    }, SECONDS {
        @Override
        public TimeFormatStrategy timeStrategy() {
            return new SecondFormat();
        }
    };


    public abstract TimeFormatStrategy timeStrategy();
}

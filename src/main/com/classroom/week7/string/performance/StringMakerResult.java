package com.classroom.week7.string.performance;

public class StringMakerResult {

    private String text;
    private long duration;
    public StringMakerResult(String string,long time){
        this.text = string;
        this.duration = time;
    }

    public String getString() {
        return text;
    }

    public long getTime() {
        return duration;
    }
}

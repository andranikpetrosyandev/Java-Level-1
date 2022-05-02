package com.exam.exam3.service.core;

import org.springframework.util.Assert;

public class PlateNumberCreateParams {
    private String series;
    private int number;

    public PlateNumberCreateParams(String series, int number) {
        Assert.hasText(series, "The series should not be null");
        Assert.notNull(number, "The number should not be null");
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }
}

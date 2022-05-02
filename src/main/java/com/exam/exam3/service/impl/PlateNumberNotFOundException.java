package com.exam.exam3.service.impl;

public class PlateNumberNotFOundException extends RuntimeException {
    public PlateNumberNotFOundException(String series, int number) {
        super(String.format(
                "Plate number having a series - %s  and number - number not found",
                series, number
        ));

    }
}

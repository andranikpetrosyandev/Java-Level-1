package com.exam.exam3.facade;

public class PlateNumberRegistrationResponseDto {
    private String fistName;
    private String secondNumber;
    private String series;
    private int number;

    public PlateNumberRegistrationResponseDto(String fistName, String secondNumber, String series, Integer number) {
        this.fistName = fistName;
        this.secondNumber = secondNumber;
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PlateNumberRegistrationResponseDto{" +
                "fistName='" + fistName + '\'' +
                ", secondNumber='" + secondNumber + '\'' +
                ", series='" + series + '\'' +
                ", number=" + number +
                '}';
    }
}

package com.exam.exam3.facade;

public class PlateNumberRegistrationRequestDto {

    private String passportNumber;
    private String plateNumberSeries;
    private Integer plateNumberNumber;

    public PlateNumberRegistrationRequestDto(String passportNumber, String plateNumberSeries, Integer plateNumberNumber) {
        this.passportNumber = passportNumber;
        this.plateNumberSeries = plateNumberSeries;
        this.plateNumberNumber = plateNumberNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPlateNumberSeries() {
        return plateNumberSeries;
    }

    public Integer getPlateNumberNumber() {
        return plateNumberNumber;
    }
}

package com.exam.exam3.service.core;

import com.exam.exam3.entity.PlateNumber;

public interface PlateNumberService {

    PlateNumber create(PlateNumberCreateParams params);

    PlateNumber getById(Long id);

    PlateNumber getByFullPlateNumber(String series, int number);
}

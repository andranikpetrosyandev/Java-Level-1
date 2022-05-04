package com.exam.exam3.service.impl;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.repository.PlateNumberRepository;
import com.exam.exam3.service.core.PlateNumberCreateParams;
import com.exam.exam3.service.core.PlateNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class PlateNumberServiceImpl implements PlateNumberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    final private PlateNumberRepository plateNumberRepository;

    public PlateNumberServiceImpl(PlateNumberRepository plateNumberRepository) {
        this.plateNumberRepository = plateNumberRepository;
    }

    @Override
    public PlateNumber create(PlateNumberCreateParams params) {
        LOGGER.info("Creating a Plate Number for the provided params - {}", params);
        PlateNumber savedPlateNumber = plateNumberRepository.save(
                new PlateNumber(
                        params.getSeries(),
                        params.getNumber()
                ));
        LOGGER.info("Successfully created a Plate number for the provided params - {}", params);

        return savedPlateNumber;
    }

    @Override
    public PlateNumber getById(Long id) {
        return plateNumberRepository.getById(id);
    }

    @Override
    public PlateNumber getByFullPlateNumber(String series, int number) {
        PlateNumber bySeriesAndNumber = plateNumberRepository.findBySeriesAndNumber(series, number);
        if (bySeriesAndNumber == null){
            throw new PlateNumberNotFOundException(series,number);
        }
        return bySeriesAndNumber;
    }
}

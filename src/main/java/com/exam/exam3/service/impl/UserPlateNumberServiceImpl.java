package com.exam.exam3.service.impl;

import com.exam.exam3.entity.UserPlateNumber;
import com.exam.exam3.repository.UserPlateNumberRepository;
import com.exam.exam3.service.core.PlateNumberService;
import com.exam.exam3.service.core.UserPlateNumberCreateParams;
import com.exam.exam3.service.core.UserPlateNumberService;
import com.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserPlateNumberServiceImpl implements UserPlateNumberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    final private UserPlateNumberRepository userPlateNumberRepository;

    final private UserService userService;
    final private PlateNumberService plateNumberService;

    public UserPlateNumberServiceImpl(UserPlateNumberRepository userPlateNumberRepository, UserService userService, PlateNumberService plateNumberService) {
        this.userPlateNumberRepository = userPlateNumberRepository;
        this.userService = userService;
        this.plateNumberService = plateNumberService;
    }

    @Override
    public UserPlateNumber create(UserPlateNumberCreateParams params) {
        UserPlateNumber save = userPlateNumberRepository.save(
                new UserPlateNumber(
                        plateNumberService.getById(params.getPlateNumberId()),
                        userService.getById(params.getUserId())
                )
        );
        return save;
    }
}

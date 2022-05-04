package com.exam.exam3.service.impl;

import com.exam.exam3.entity.UserPlateNumber;
import com.exam.exam3.repository.UserPlateNumberRepository;
import com.exam.exam3.service.core.PlateNumberService;
import com.exam.exam3.service.core.UserPlateNumberCreateParams;
import com.exam.exam3.service.core.UserPlateNumberService;
import com.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPlateNumberServiceImpl implements UserPlateNumberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserPlateNumberRepository userPlateNumberRepository;

    @Autowired
    private UserService userService;
    @Autowired
    private PlateNumberService plateNumberService;

    public UserPlateNumberServiceImpl() {

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

package com.exam.exam3.facade;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.entity.User;
import com.exam.exam3.entity.UserPlateNumber;
import com.exam.exam3.service.core.PlateNumberService;
import com.exam.exam3.service.core.UserPlateNumberCreateParams;
import com.exam.exam3.service.core.UserPlateNumberService;
import com.exam.exam3.service.core.UserService;

import javax.transaction.Transactional;

public class PlateNumberRegistrationFacadeImpl implements PlateNumberRegistrationFacade {
    private final UserService userService;
    private final PlateNumberService plateNumberService;
    private final UserPlateNumberService userPlateNumberService;

    public PlateNumberRegistrationFacadeImpl(UserService userService, PlateNumberService plateNumberService, UserPlateNumberService userPlateNumberService) {
        this.userService = userService;
        this.plateNumberService = plateNumberService;
        this.userPlateNumberService = userPlateNumberService;
    }

    @Override
    public PlateNumberRegistrationResponseDto registration(PlateNumberRegistrationRequestDto dto) {

        User userByPassportNumber = userService.getByPassportNumber(dto.getPassportNumber());

        PlateNumber plateNumber = plateNumberService.getByFullPlateNumber(dto.getPlateNumberSeries(), dto.getPlateNumberNumber());
        UserPlateNumber userPlateNumber = userPlateNumberService.create(new UserPlateNumberCreateParams(
                userByPassportNumber.getId(), plateNumber.getId()
        ));

        return new PlateNumberRegistrationResponseDto(
                userService.getById(userPlateNumber.getUser().getId()).getFirstName(),
                userService.getById(userPlateNumber.getUser().getId()).getSecondName(),
                userPlateNumber.getPlateNumber().getSeries(),
                userPlateNumber.getPlateNumber().getNumber()
        );

    }
}

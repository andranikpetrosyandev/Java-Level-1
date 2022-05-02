package com.exam.exam3.facade;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.entity.User;
import com.exam.exam3.entity.UserPlateNumber;
import com.exam.exam3.service.core.PlateNumberService;
import com.exam.exam3.service.core.UserPlateNumberCreateParams;
import com.exam.exam3.service.core.UserPlateNumberService;
import com.exam.exam3.service.core.UserService;

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

        System.out.println("asdasdasdasd");
        System.out.println(userService.getById(userPlateNumber.getUser().getId()).getFirstName());
//        System.out.println(userPlateNumber.getUser().getId());
//        System.out.println(userPlateNumber.getPlateNumber().getId());
        return new PlateNumberRegistrationResponseDto(
               "asdas", "adasda",
                "!@",32);

    }
}

package com.homework.week18.website.facade.impl;

import com.homework.week18.website.entity.User;
import com.homework.week18.website.facade.core.UserFacade;
import com.homework.week18.website.facade.core.requestDto.UserSignUpRequestDto;
import com.homework.week18.website.facade.core.responseDto.UserSignUpResponseDto;
import com.homework.week18.website.service.core.UserCreateParams;
import com.homework.week18.website.service.core.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class UserFacadeImplTest {

    @Mock
    UserFacade userFacade;
    @Mock
    UserService userService;


    @Test
    public void testSignUpFirstTime() {
        Mockito.when(userService.create(
                new UserCreateParams("Andranik", "Petrosyan", "andranik_Petrosyan", "password"))
        ).thenReturn(new User());

        UserSignUpResponseDto userSignUpResponseDto = userFacade.signUp(new UserSignUpRequestDto("Andranik", "Petrosyan", "andranik_Petrosyan", "password"));
        System.out.println(userSignUpResponseDto);
    }
}
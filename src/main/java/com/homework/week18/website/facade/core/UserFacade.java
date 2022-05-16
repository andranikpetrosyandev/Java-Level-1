package com.homework.week18.website.facade.core;

import com.homework.week18.website.facade.core.requestDto.UserSignInRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserSignUpRequestDto;
import com.homework.week18.website.facade.core.responseDto.UserSignInResposeDto;
import com.homework.week18.website.facade.core.responseDto.UserSignUpResponseDto;

public interface UserFacade {

    UserSignUpResponseDto signUp(UserSignUpRequestDto dto);

    UserSignInResposeDto signIn(UserSignInRequestDto dto);
}

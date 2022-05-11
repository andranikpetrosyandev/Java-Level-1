package com.homework.week18.website.facade.impl;

import com.homework.week18.website.entity.User;
import com.homework.week18.website.facade.core.*;
import com.homework.week18.website.facade.core.requestDto.UserSignInRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserSignUpRequestDto;
import com.homework.week18.website.facade.core.responseDto.UserSignInResposeDto;
import com.homework.week18.website.facade.core.responseDto.UserSignUpResponseDto;
import com.homework.week18.website.service.core.UserCreateParams;
import com.homework.week18.website.service.core.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private UserService userService;
    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        if (userService.findByUsername(dto.getUsername()).isPresent()) {
            return new UserSignUpResponseDto(
                    List.of(
                            String.format("User with %s username already exist!", dto.getUsername())
                    )
            );
        }
        User user = userService.create(
                new UserCreateParams(
                        dto.getFirstName(),
                        dto.getSecondName(),
                        dto.getUsername(),
                        dto.getPassword()
                )
        );
        return new UserSignUpResponseDto(user.getUsername(), user.getFirstName(), user.getSecondName());
    }

    @Override
    public UserSignInResposeDto signIn(UserSignInRequestDto dto) {
        return new UserSignInResposeDto();
    }
}

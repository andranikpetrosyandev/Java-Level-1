package com.homework.week17.note.facade;

import com.note.entity.User;
import com.note.service.core.CreateUserParams;
import com.note.service.core.UserService;

public class UserFacadeImpl implements UserFacade {
    final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserSignUpResponseDto signUp(UserSignUpRequestDto dto) {
        User savedUser = userService.save(new CreateUserParams(
                dto.getFirstName(),
                dto.getSecondName()
        ));
        return new UserSignUpResponseDto(savedUser.getUsername());

    }
}

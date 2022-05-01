package com.homework.week17.note.facade;

import com.homework.week17.note.entity.User;
import com.homework.week17.note.service.core.CreateUserParams;
import com.homework.week17.note.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class UserFacadeImpl implements UserFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserFacadeImpl.class);

    final UserService userService;

    public UserFacadeImpl(UserService userService) {
        Assert.notNull(userService, "The userService should not be null");
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

package com.exam.exam3.service.core;

import com.exam.exam3.entity.User;

public interface UserService {

    User create(UserCreateParams params);

    User getById(Long id);

    User getByPassportNumber(String passportNumber);
}

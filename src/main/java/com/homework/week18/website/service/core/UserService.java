package com.homework.week18.website.service.core;

import com.homework.week18.website.entity.User;
import com.homework.week18.website.service.impl.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User create(UserCreateParams params);

    User findById(Long id);

    Optional<User> findByUsernameAndPassword(String userName, String password);

    Optional<User> findByUsername(String userName) throws UserNotFoundException;


}

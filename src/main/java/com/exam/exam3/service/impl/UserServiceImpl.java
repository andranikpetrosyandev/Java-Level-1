package com.exam.exam3.service.impl;

import com.exam.exam3.entity.User;
import com.exam.exam3.repository.UserRepository;
import com.exam.exam3.service.core.UserCreateParams;
import com.exam.exam3.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl() {

    }

    @Override
    public User create(UserCreateParams params) {
        Assert.notNull(params, "The create user params should not be null");
        LOGGER.info("Creating a user for the provided params - {}", params);
        User savedUser = userRepository.save(
                new User(
                        params.getFirstName(),
                        params.getSecondName(),
                        params.getPassportNumber()
                )

        );
        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return savedUser;
    }

    @Override
    public User getById(Long id) {
        Assert.notNull(id, "user id  should not be null");
        User userById = userRepository.getById(id);
        if (userById == null) {
            throw new UserNotFoundException(id);
        }
        return userById;
    }

    @Override
    public User getByPassportNumber(String passportNumber) {
        Assert.hasText(passportNumber, "The username should not be null or empty");
        final Optional<User> userOptional = userRepository.findByPassportNumber(passportNumber);

        if (userOptional.isEmpty()) {
            throw new UserNotFoundException(passportNumber);
        }
        final User user = userOptional.get();

        return user;

    }
}

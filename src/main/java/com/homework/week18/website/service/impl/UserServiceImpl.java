package com.homework.week18.website.service.impl;

import com.homework.week18.website.entity.User;
import com.homework.week18.website.repository.UserRepository;
import com.homework.week18.website.service.core.UserCreateParams;
import com.homework.week18.website.service.core.UserService;
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

    @Override
    public User create(UserCreateParams params) {
        Assert.notNull(params, "The create user params should not be null");
        LOGGER.info("Creating a user for the provided params - {}", params);

        User savedUser = userRepository.save(
                new User(
                        params.getFirstName(),
                        params.getSecondName(),
                        params.getUserName(),
                        params.getPassword()
                )
        );
        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return savedUser;
    }

    @Override
    public User findById(Long id) {
        Assert.notNull(id, "id can't be null");
        Optional<User> userOptional = userRepository.findById(id);
        if (!userOptional.isEmpty()) {
            final User user = userOptional.get();
            LOGGER.info(
                    "Successfully retrieved the user for the provided id - {}, result - {}",
                    id,
                    user
            );
        }
        return userOptional.get();
    }

    @Override
    public Optional<User> findByUsername(String userName) {
        Assert.hasText(userName, "The username should not be null or empty");
        LOGGER.info("Retrieving user for the provided username - {}", userName);

        final Optional<User> userOptional = userRepository.findByUsername(userName);

        if (!userOptional.isEmpty()) {
            final User user = userOptional.get();
            LOGGER.info(
                    "Successfully retrieved the user for the provided username - {}, result - {}",
                    userName,
                    user
            );
        }
        return userOptional;
    }

    @Override
    public Optional<User> findByUsernameAndPassword(String userName, String password) {
        Assert.hasText(userName, "The username should not be null or empty");
        LOGGER.info("Retrieving user for the provided username - {}", userName);

        final Optional<User> userOptional = userRepository.findByUsernameAndPassword(userName, password);

        if (userOptional.isEmpty()) {
            throw new UserNotFoundException(userName);
        }

        final User user = userOptional.get();
        LOGGER.info(
                "Successfully retrieved the user for the provided username - {}, result - {}",
                userName,
                user
        );
        return userOptional;
    }


}

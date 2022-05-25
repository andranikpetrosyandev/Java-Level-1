package com.homework.week17.note.service.impl;

import com.homework.week17.note.entity.Note;
import com.homework.week17.note.entity.User;
import com.homework.week17.note.repository.UserRepository;
import com.homework.week17.note.service.core.CreateUserParams;
import com.homework.week17.note.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(CreateUserParams createUserParams) {
        LOGGER.info("Creating a user for the provided params - {}", createUserParams);
        final User user = new User(
                createUserParams.getUsername(),
                createUserParams.getFirstName(),
                createUserParams.getSecondName()
        );

        final User savedUser = userRepository.save(user);
        LOGGER.info("Successfully created a user for the provided params - {}", createUserParams);

        return savedUser;
    }


    @Override
    public User getByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public List<Note> getUserNotes(Long userId) {

        return new ArrayList<>();
    }
}

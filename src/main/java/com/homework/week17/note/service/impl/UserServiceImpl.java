package com.homework.week17.note.service.impl;

import com.note.entity.Note;
import com.note.entity.User;
import com.note.repository.UserRepository;
import com.note.service.core.CreateUserParams;
import com.note.service.core.UserService;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(CreateUserParams createUserParams) {

        final User user = new User(
                createUserParams.getUsername(),
                createUserParams.getFirstName(),
                createUserParams.getSecondName()
        );

        final User savedUser = userRepository.save(user);

        return savedUser;
    }


    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public List<Note> getUserNotes(Long userId) {

        return new ArrayList<>();
    }
}

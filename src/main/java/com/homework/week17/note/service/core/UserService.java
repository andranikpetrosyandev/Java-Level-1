package com.homework.week17.note.service.core;

import com.note.entity.Note;
import com.note.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(CreateUserParams createUserParams);

    User getUserByUsername(String username);

    List<Note> getUserNotes(Long userId);
}

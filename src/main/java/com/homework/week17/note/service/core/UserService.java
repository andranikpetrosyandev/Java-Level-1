package com.homework.week17.note.service.core;

import com.homework.week17.note.entity.Note;
import com.homework.week17.note.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(CreateUserParams createUserParams);

    User getByUsername(String username);

    List<Note> getUserNotes(Long userId);
}

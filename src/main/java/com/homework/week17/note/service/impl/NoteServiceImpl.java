package com.homework.week17.note.service.impl;

import com.homework.week17.note.entity.Note;
import com.homework.week17.note.repository.NoteRepository;
import com.homework.week17.note.service.core.NoteCreateParams;
import com.homework.week17.note.service.core.NoteService;
import com.homework.week17.note.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


public class NoteServiceImpl implements NoteService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoteServiceImpl.class);

    final private NoteRepository noteRepository;
    final private UserService userService;

    public NoteServiceImpl(NoteRepository noteRepository, UserService userService) {
        Assert.notNull(noteRepository, "The noteRepository should not be null");
        Assert.notNull(userService, "The userService should not be null");
        this.noteRepository = noteRepository;
        this.userService = userService;
    }

    @Override
    public Note save(NoteCreateParams params) {
        LOGGER.info("Creating a note for the provided params - {}", params);

        Note savedNote = noteRepository.save(
                new Note(
                        params.getText(),
                        userService.getByUsername(params.getUserName())
                )
        );
        LOGGER.info("Successfully created a note for the provided params - {}", params);

        return savedNote;
    }
}

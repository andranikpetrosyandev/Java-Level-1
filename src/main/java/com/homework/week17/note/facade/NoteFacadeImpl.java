package com.homework.week17.note.facade;

import com.homework.week17.note.entity.Note;
import com.homework.week17.note.service.core.NoteCreateParams;
import com.homework.week17.note.service.core.NoteService;
import com.homework.week17.note.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;


public class NoteFacadeImpl implements NoteFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(NoteFacadeImpl.class);
    private final NoteService noteService;
    private final UserService userService;

    public NoteFacadeImpl(NoteService noteService, UserService userService) {
        Assert.notNull(noteService, "The noteService should not be null");
        Assert.notNull(userService, "The userService should not be null");

        this.noteService = noteService;
        this.userService = userService;
    }

    @Override
    public NoteCreationResponseDto create(NoteCreationRequestDto dto) {

        Note savedNote = noteService.save(new NoteCreateParams(
                dto.getText(),
                dto.getUsername()
        ));

        return new NoteCreationResponseDto(savedNote.getText(), dto.getUsername(), savedNote.getCreatedDate());
    }
}

package com.homework.week17.note.facade;

import com.note.entity.Note;
import com.note.entity.User;
import com.note.service.core.NoteCreateParams;
import com.note.service.core.NoteService;
import com.note.service.core.UserService;

public class NoteFacadeImpl implements NoteFacade {

    private final NoteService noteService;

    private final UserService userService;

    public NoteFacadeImpl(NoteService noteService, UserService userService) {
        this.noteService = noteService;
        this.userService = userService;
    }

    @Override
    public NoteCreationResponseDto create(NoteCreationRequestDto dto) {
        User userByUsername = userService.getUserByUsername(dto.getUsername());
        Note savedNote = noteService.save(new NoteCreateParams(
                dto.getText(),
                userByUsername

        ));
        return new NoteCreationResponseDto(savedNote.getText(), userByUsername.getUsername(), savedNote.getCreatedDate());
    }
}

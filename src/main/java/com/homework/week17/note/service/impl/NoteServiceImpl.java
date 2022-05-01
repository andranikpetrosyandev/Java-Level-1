package com.homework.week17.note.service.impl;

import com.note.entity.Note;
import com.note.repository.NoteRepository;
import com.note.service.core.NoteCreateParams;
import com.note.service.core.NoteService;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    final private NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note save(NoteCreateParams params) {
        return noteRepository.save(new Note(
                params.getText(),
                params.getUser()
        ));
    }
}

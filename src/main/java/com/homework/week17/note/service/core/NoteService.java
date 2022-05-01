package com.homework.week17.note.service.core;

import com.note.entity.Note;

public interface NoteService {
    Note save(NoteCreateParams params);
}

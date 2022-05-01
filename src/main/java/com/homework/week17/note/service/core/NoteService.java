package com.homework.week17.note.service.core;

import com.homework.week17.note.entity.Note;

public interface NoteService {
    Note save(NoteCreateParams params);
}

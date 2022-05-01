package com.homework.week17.note.service.core;

import com.note.entity.User;

public class NoteCreateParams {
    private String text;
    private User user;

    public NoteCreateParams( String text, User user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }
}

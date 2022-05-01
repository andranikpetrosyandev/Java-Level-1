package com.homework.week17.note.facade;

public class NoteCreationRequestDto {
    private final String username;
    private final String text;


    public NoteCreationRequestDto(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }
}

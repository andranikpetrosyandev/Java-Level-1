package com.homework.week17.note.facade;

import java.time.LocalDateTime;

public class NoteCreationResponseDto {
    private final String text;
    private final String username;
    private final LocalDateTime created_at;

    public NoteCreationResponseDto(String text, String username, LocalDateTime created_at) {
        this.text = text;
        this.username = username;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "NoteCreationResponseDto{" +
                "text='" + text + '\'' +
                ", username='" + username + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}

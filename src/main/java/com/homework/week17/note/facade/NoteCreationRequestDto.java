package com.homework.week17.note.facade;

import org.springframework.util.Assert;

public class NoteCreationRequestDto {
    private final String username;
    private final String text;

    public NoteCreationRequestDto(String username, String text) {
        Assert.notNull(username, "The username should not be null");
        Assert.notNull(text, "The text should not be null");
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteCreationRequestDto that = (NoteCreationRequestDto) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}

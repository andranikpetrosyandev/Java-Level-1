package com.homework.week17.note.service.core;

import com.homework.week17.note.entity.User;

public class NoteCreateParams {
    private String text;
    private String userName;

    public NoteCreateParams( String text, String username) {

        this.text = text;
        this.userName = username;
    }
    public String getUserName() {
        return userName;
    }
    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        return "NoteCreateParams{" +
                "text='" + text + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteCreateParams that = (NoteCreateParams) o;

        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        return userName != null ? userName.equals(that.userName) : that.userName == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}

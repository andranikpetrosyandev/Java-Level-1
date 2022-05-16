package com.homework.week18.website.service.core;

import org.springframework.util.Assert;

public class CreatePostParams {
    public CreatePostParams(String title, String text, Long userId) {
        Assert.hasText(title,"title should have a text");
        Assert.hasText(text,"text should have a text");
        Assert.notNull(userId,"userId can't be null");
        this.title = title;
        this.text = text;
        this.userId = userId;
    }

    private final String title;
    private final String text;
    private final Long userId;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "CreatePostParams{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

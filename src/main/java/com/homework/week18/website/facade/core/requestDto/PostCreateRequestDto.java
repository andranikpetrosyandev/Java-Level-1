package com.homework.week18.website.facade.core.requestDto;

import org.springframework.util.Assert;

public class PostCreateRequestDto {
    private String username;
    private String title;
    private String text;

    public PostCreateRequestDto(String username, String title, String text) {
        Assert.hasText(username,"username should have some text");
        Assert.hasText(title,"Title should have some text");
        Assert.hasText(text,"text should have some text");
        this.username = username;
        this.title = title;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

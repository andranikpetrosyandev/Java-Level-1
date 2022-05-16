package com.homework.week18.website.facade.core.responseDto;

import java.util.List;

public class PostCreateResponseDto {
    private String title;
    private String text;
    private String userName;

    private Long postId;

    private List<String> errorList;
    public PostCreateResponseDto(List<String> errorList) {
        this.errorList = errorList;
    }

    public PostCreateResponseDto(long postId, String title, String text, String userName) {
        this.postId = postId;
        this.title = title;
        this.text = text;
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public Long getPostId() {
        return postId;
    }

    public String getText() {
        return text;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getErrorList() {
        return errorList;
    }


    @Override
    public String toString() {
        return "PostCreateResponseDto{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", userName='" + userName + '\'' +
                ", postId=" + postId +
                ", errorList=" + errorList +
                '}';
    }
}

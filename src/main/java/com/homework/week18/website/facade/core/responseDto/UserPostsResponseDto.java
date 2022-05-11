package com.homework.week18.website.facade.core.responseDto;

import com.homework.week18.website.entity.Post;

import java.util.List;

public class UserPostsResponseDto {
    private String username;

    private List<Post> postList;

    private List<String> errorList;

    public UserPostsResponseDto(String username, List<Post> postList) {
        this.username = username;
        this.postList = postList;
    }

    public UserPostsResponseDto(List<String> errorList) {
        this.errorList = errorList;
    }

    @Override
    public String toString() {
        return "UserPostsResponseDto{" +
                "username='" + username + '\'' +
                ", postList=" + postList +
                ", errorList=" + errorList +
                '}';
    }
}

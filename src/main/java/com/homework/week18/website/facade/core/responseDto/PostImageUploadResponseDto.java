package com.homework.week18.website.facade.core.responseDto;

import java.util.List;

public class PostImageUploadResponseDto {

    private Long postId;
    private String blobId;
    private Long id;
    private List<String> errorList;


    public PostImageUploadResponseDto(List<String> errorList) {
        this.errorList = errorList;
    }

    public PostImageUploadResponseDto(Long postId, String blobId, Long id) {
        this.postId = postId;
        this.blobId = blobId;
        this.id = id;
    }

    public List<String> getErrorList() {
        return errorList;
    }

    public Long getPostId() {
        return postId;
    }

    public String getBlobId() {
        return blobId;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PostImageUploadResponseDto{" +
                "postId=" + postId +
                ", blobId='" + blobId + '\'' +
                ", id=" + id +
                ", errorList=" + errorList +
                '}';
    }
}

package com.homework.week18.website.facade.core.requestDto;

public class PostImageUploadRequestDto {
    private Long postId;
    private String blobId;

    public PostImageUploadRequestDto(Long postId, String blobId) {
        this.postId = postId;
        this.blobId = blobId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getBlobId() {
        return blobId;
    }
}

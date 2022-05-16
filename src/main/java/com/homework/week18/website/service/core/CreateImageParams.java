package com.homework.week18.website.service.core;

import org.springframework.util.Assert;

public class CreateImageParams {
    private final String blobId;

    private final Long postId;

    public CreateImageParams(String blobId, Long postId) {
        Assert.notNull(postId, "postId can't be null");
        Assert.hasText(blobId, "firstName should have a text");
        this.postId = postId;
        this.blobId = blobId;
    }

    public String getBlobId() {
        return blobId;
    }

    public Long getPostId() {
        return postId;
    }

    @Override
    public String toString() {
        return "CreateImageParams{" +
                "blobId='" + blobId + '\'' +
                ", postId=" + postId +
                '}';
    }
}

package com.homework.week18.website.service.core;

import com.homework.week18.website.entity.Image;

import java.util.List;

public interface ImageService {

    Image create(CreateImageParams params);

    List<Image> getByPostId(Long postId);
}

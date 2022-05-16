package com.homework.week18.website.service.impl;

import com.homework.week18.website.entity.Image;
import com.homework.week18.website.entity.Post;
import com.homework.week18.website.facade.impl.PostFacadeImpl;
import com.homework.week18.website.repository.ImageRepository;
import com.homework.week18.website.service.core.CreateImageParams;
import com.homework.week18.website.service.core.ImageService;
import com.homework.week18.website.service.core.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostFacadeImpl.class);

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private PostService postService;

    @Override
    public Image create(CreateImageParams params) {
        Assert.notNull(params, "The params should not be null");
        LOGGER.info("Creating a Image for the provided params - {}", params);
        Optional<Post> postById = postService.findById(params.getPostId());

        Image savedImage = imageRepository.save(new Image(
                params.getBlobId(),
                postById.get()
        ));
        LOGGER.info("Successfully created a Image for the provided params - {}", params);
        return savedImage;
    }

    @Override
    public List<Image> getByPostId(Long postId) {
        List<Image> byPostId = imageRepository.getByPostId(postId);
        return byPostId;
    }
}

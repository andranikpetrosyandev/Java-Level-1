package com.homework.week18.website.service.impl;

import com.homework.week18.website.entity.Post;
import com.homework.week18.website.entity.User;
import com.homework.week18.website.facade.impl.PostFacadeImpl;
import com.homework.week18.website.repository.PostRepository;
import com.homework.week18.website.service.core.CreatePostParams;
import com.homework.week18.website.service.core.PostService;
import com.homework.week18.website.service.core.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostFacadeImpl.class);
    @Autowired
    private UserService userService;
    @Autowired
    private PostRepository postRepository;

    @Override
    public Post create(CreatePostParams params) {
        Assert.notNull(params, "The params should not be null");
        LOGGER.info("Creating a post for the provided params - {}", params);

        User userById = userService.findById(params.getUserId());

        Post savedPost = postRepository.save(new Post(
                params.getTitle(),
                params.getText(),
                userById
        ));
        LOGGER.info("Successfully created a Post for the provided params - {}", params);
        return savedPost;

    }

    @Override
    public Optional<Post> findById(Long id) {
        Assert.notNull(id, "The id should not be null");
        Optional<Post> byId = postRepository.findById(id);
        return byId;
    }

    @Override
    public List<Post> findByUserId(Long id) {
        List<Post> byUserId = postRepository.findByUserId(id);
        return byUserId;
    }

}

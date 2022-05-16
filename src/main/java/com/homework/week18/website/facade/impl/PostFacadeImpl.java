package com.homework.week18.website.facade.impl;

import com.homework.week18.website.entity.Image;
import com.homework.week18.website.entity.Post;
import com.homework.week18.website.entity.User;
import com.homework.week18.website.facade.core.PostFacade;
import com.homework.week18.website.facade.core.requestDto.PostCreateRequestDto;
import com.homework.week18.website.facade.core.requestDto.PostImageUploadRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserPostSRequestDto;
import com.homework.week18.website.facade.core.responseDto.PostCreateResponseDto;
import com.homework.week18.website.facade.core.responseDto.PostImageUploadResponseDto;
import com.homework.week18.website.facade.core.responseDto.UserPostsResponseDto;
import com.homework.week18.website.service.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PostFacadeImpl implements PostFacade {

    @Autowired
    PostService postService;
    @Autowired
    UserService userService;
    @Autowired
    ImageService imageService;

    @Override
    public PostCreateResponseDto create(PostCreateRequestDto dto) {
        Optional<User> byUsername = userService.findByUsername(dto.getUsername());
        if (byUsername.isEmpty()) {
            return new PostCreateResponseDto(List.of(String.format("user with $s", dto.getUsername())));
        }
        Post post = postService.create(
                new CreatePostParams(
                        dto.getTitle(),
                        dto.getText(),
                        byUsername.get().getId()
                )
        );
        PostCreateResponseDto postCreateResponseDto = new PostCreateResponseDto(
                post.getId(),
                post.getTitle(),
                post.getText(),
                byUsername.get().getUsername()
        );
        return postCreateResponseDto;
    }

    @Override
    public PostImageUploadResponseDto uploadImage(PostImageUploadRequestDto dto) {
        List<Image> byPostId = imageService.getByPostId(dto.getPostId());
        if (byPostId.size() == 5) {
            return new PostImageUploadResponseDto(List.of(String.format("We can't upload more then 5 image for post")));
        }

        Image image = imageService.create(new CreateImageParams(dto.getBlobId(), dto.getPostId()));

        PostImageUploadResponseDto postImageUploadResponseDto = new PostImageUploadResponseDto(dto.getPostId(), image.getBlobId(), image.getId());
        return postImageUploadResponseDto;

    }

    @Override
    public UserPostsResponseDto getAllUserPosts(UserPostSRequestDto dto) {
        Optional<User> byUsername = userService.findByUsername(dto.getUsername());
        if (byUsername.isEmpty()) {
            return new UserPostsResponseDto(List.of(String.format("user with %s don't exist", dto.getUsername())));
        }
        List<Post> byUserId = postService.findByUserId(byUsername.get().getId());
        return new UserPostsResponseDto(dto.getUsername(), byUserId);
    }
}

package com.homework.week18.website.facade.core;

import com.homework.week18.website.facade.core.requestDto.PostCreateRequestDto;
import com.homework.week18.website.facade.core.requestDto.PostImageUploadRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserPostSRequestDto;
import com.homework.week18.website.facade.core.responseDto.PostCreateResponseDto;
import com.homework.week18.website.facade.core.responseDto.PostImageUploadResponseDto;
import com.homework.week18.website.facade.core.responseDto.UserPostsResponseDto;

public interface PostFacade {
    PostCreateResponseDto create(PostCreateRequestDto dto);

    PostImageUploadResponseDto uploadImage(PostImageUploadRequestDto dto);

    UserPostsResponseDto getAllUserPosts(UserPostSRequestDto dto);
}

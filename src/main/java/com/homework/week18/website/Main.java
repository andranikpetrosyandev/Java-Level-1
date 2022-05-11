package com.homework.week18.website;

import com.homework.week18.website.facade.core.PostFacade;
import com.homework.week18.website.facade.core.UserFacade;
import com.homework.week18.website.facade.core.requestDto.PostCreateRequestDto;
import com.homework.week18.website.facade.core.requestDto.PostImageUploadRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserPostSRequestDto;
import com.homework.week18.website.facade.core.requestDto.UserSignUpRequestDto;
import com.homework.week18.website.facade.core.responseDto.PostCreateResponseDto;
import com.homework.week18.website.facade.core.responseDto.PostImageUploadResponseDto;
import com.homework.week18.website.facade.core.responseDto.UserPostsResponseDto;
import com.homework.week18.website.facade.core.responseDto.UserSignUpResponseDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserFacade userFacade = context.getBean(UserFacade.class);
        PostFacade postFacade = context.getBean(PostFacade.class);


        UserSignUpResponseDto userSignUpResponseDto = userFacade.signUp(
                new UserSignUpRequestDto(
                        "Andranik",
                        "Petrosyan",
                        "Andranik_petrosyan", "password"
                )
        );

        PostCreateResponseDto postCreateResponseDto = postFacade.create(
                new PostCreateRequestDto(
                        userSignUpResponseDto.getUsername(),
                        "title",
                        "Text"
                )
        );

        PostCreateResponseDto postCreateResponseDto2 = postFacade.create(
                new PostCreateRequestDto(
                        userSignUpResponseDto.getUsername(),
                        "title 2",
                        "Text 2"
                )
        );

        PostImageUploadResponseDto image1 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "sadas54"));
        PostImageUploadResponseDto image2 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "saasdas54"));
        PostImageUploadResponseDto image3 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "sadasdas54"));
        PostImageUploadResponseDto image4 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "sadadss54"));
        PostImageUploadResponseDto image5 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "sadaaadss54"));
        PostImageUploadResponseDto image6 = postFacade.uploadImage(new PostImageUploadRequestDto(postCreateResponseDto.getPostId(), "sadaaadss54"));

        UserPostsResponseDto allUserPosts = postFacade.getAllUserPosts(new UserPostSRequestDto(userSignUpResponseDto.getUsername()));


        System.out.println(allUserPosts);
    }
}

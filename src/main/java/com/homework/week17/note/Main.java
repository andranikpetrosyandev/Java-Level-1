package com.homework.week17.note;

import com.note.facade.*;
import com.note.repository.NoteRepository;
import com.note.repository.UserRepository;
import com.note.service.core.NoteService;
import com.note.service.core.UserService;
import com.note.service.impl.NoteServiceImpl;
import com.note.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        final UserRepository userRepository = context.getBean(UserRepository.class);
        final NoteRepository noteRepository = context.getBean(NoteRepository.class);

        final UserService userService = new UserServiceImpl(userRepository);
        final NoteService noteService = new NoteServiceImpl(noteRepository);

        UserFacade userFacade = new UserFacadeImpl(userService);
        NoteFacade noteFacade = new NoteFacadeImpl(noteService, userService);
//
        UserSignUpResponseDto userSignUpResponseDto = userFacade.signUp(new UserSignUpRequestDto("Andranik", "Petrosyan"));

        NoteCreationResponseDto noteCreationResponseDto = noteFacade.create(
                new NoteCreationRequestDto(userSignUpResponseDto.getUsername(), "my first note")
        );


        System.out.println(noteCreationResponseDto);
//


    }
}

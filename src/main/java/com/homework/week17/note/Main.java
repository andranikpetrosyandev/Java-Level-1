package com.homework.week17.note;

import com.homework.week17.note.facade.*;
import com.homework.week17.note.repository.NoteRepository;
import com.homework.week17.note.repository.UserRepository;
import com.homework.week17.note.service.core.NoteService;
import com.homework.week17.note.service.core.UserService;
import com.homework.week17.note.service.impl.NoteServiceImpl;
import com.homework.week17.note.service.impl.UserServiceImpl;
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
        final NoteService noteService = new NoteServiceImpl(noteRepository, userService);

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

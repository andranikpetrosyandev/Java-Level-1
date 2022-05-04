package com.exam.exam3;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.entity.User;
import com.exam.exam3.facade.PlateNumberRegistrationFacade;
import com.exam.exam3.facade.PlateNumberRegistrationFacadeImpl;
import com.exam.exam3.facade.PlateNumberRegistrationRequestDto;
import com.exam.exam3.facade.PlateNumberRegistrationResponseDto;
import com.exam.exam3.repository.PlateNumberRepository;
import com.exam.exam3.repository.UserPlateNumberRepository;
import com.exam.exam3.repository.UserRepository;
import com.exam.exam3.service.core.*;
import com.exam.exam3.service.impl.PlateNumberServiceImpl;
import com.exam.exam3.service.impl.UserPlateNumberServiceImpl;
import com.exam.exam3.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@EnableAutoConfiguration
@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        final UserService userService = context.getBean(UserService.class);
        final PlateNumberService plateNumberService = context.getBean(PlateNumberService.class);
        final PlateNumberRegistrationFacade plateNumberRegistrationFacade = context.getBean(PlateNumberRegistrationFacade.class);

        User user = userService.create(
                new UserCreateParams(
                        "Andranik",
                        "Petrosyan",
                        "AB8488320"
                )
        );

        PlateNumber plateNumber = plateNumberService.create(new PlateNumberCreateParams("AB", 112));

        PlateNumberRegistrationResponseDto registration = plateNumberRegistrationFacade.registration(
                new PlateNumberRegistrationRequestDto("AB8488320", "AB", 112)
        );
        System.out.println(registration);
    }
}

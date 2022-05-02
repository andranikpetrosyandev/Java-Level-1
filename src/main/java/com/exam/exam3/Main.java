package com.exam.exam3;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.entity.User;
import com.exam.exam3.entity.UserPlateNumber;
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
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        final UserRepository userRepository = context.getBean(UserRepository.class);
        final PlateNumberRepository plateNumberRepository = context.getBean(PlateNumberRepository.class);
        final UserPlateNumberRepository userPlateNumberRepository = context.getBean(UserPlateNumberRepository.class);

        UserService userService = new UserServiceImpl(userRepository);

        PlateNumberService plateNumberService = new PlateNumberServiceImpl(plateNumberRepository);

        UserPlateNumberService userPlateNumberService = new UserPlateNumberServiceImpl(userPlateNumberRepository, userService, plateNumberService);

        User user = userService.create(
                new UserCreateParams(
                        "Andranik",
                        "Petrosyan",
                        "AB8488320"
                )
        );



        ExecutorService executorService = Executors.newFixedThreadPool(10);


        //Creating plate Numbers
        PlateNumber plateNumber = plateNumberService.create(new PlateNumberCreateParams("AB", 112));
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 100; i < 999; i++) {
            int finalI = i;
            runnables.add(new Runnable() {
                @Override
                public void run() {
                    plateNumberService.create(new PlateNumberCreateParams("AB", finalI));
                }
            });
        }
        for (Runnable runnable : runnables) {
            executorService.execute(runnable);
        }



        PlateNumberRegistrationFacade plateNumberRegistrationFacade = new PlateNumberRegistrationFacadeImpl(userService, plateNumberService, userPlateNumberService);
        PlateNumberRegistrationResponseDto registration = plateNumberRegistrationFacade.registration(
                new PlateNumberRegistrationRequestDto("AB8488320", "AB", 112)
        );
        executorService.shutdown();
        System.out.println(registration);
    }
}

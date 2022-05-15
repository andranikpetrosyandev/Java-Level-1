package com.classroom.week17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
//        Object animal = context.getBean("animal");
        Animal animal = context.getBean("animal", Animal.class);
        Animal bean = (Animal) context.getBean("animal", "asdas", 12);

    }
}

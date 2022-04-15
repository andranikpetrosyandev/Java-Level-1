package com.classroom.week8.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testWhenUserNameIsNull(){
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute(){
                new User(null,"hello");
            }
        });
        Assertions.assertEquals("Username is null",exception.getMessage());
    }
    @Test
    public void testWhenFirstNameIsNull(){
        RuntimeException exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute(){
                new User("hello",null);
            }
        });
        Assertions.assertEquals("firstName is null",exception.getMessage());
    }
    @Test
    public void testWhenFirstNameAndUsernameIsNull(){
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute(){
                new User(null,null);
            }
        });
    }



}
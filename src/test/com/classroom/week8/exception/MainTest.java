package com.classroom.week8.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void main(){
       Assertions.assertThrows(RuntimeException.class, new Executable() {
           @Override
           public void execute(){
               Main.main(null);
           }
       });
    }
}
package com.classroom.week7.concat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongConcatenatorTest {

    private LongConcatenator longConcatenator;

    @BeforeEach
    public void setUp() {
         longConcatenator = new LongConcatenator();
    }

    @Test
    void test2NUmbers() {
        Assertions.assertEquals("1030" ,longConcatenator.concat(10, 30));
    }

    @Test
    void test3Numbers() {
        Assertions.assertEquals("2030" ,longConcatenator.concat(20, 30));

    }


}
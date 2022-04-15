package com.homework.week9.tuple2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Tuple2Test {
    @Test
    public void testGenericClassWithStringAndInt() {
        Tuple2<String, Integer> tuple2 = new Tuple2<>("text", 45);
        Assertions.assertEquals("text", tuple2.getFirstParam());
        Assertions.assertEquals(45, tuple2.getSecondParam());
    }

    @Test
    public void testGenericClassWithIntAndInt() {
        Tuple2<Integer, Integer> tuple2 = new Tuple2<>(100, 45);
        Assertions.assertEquals(100, tuple2.getFirstParam());
        Assertions.assertEquals(45, tuple2.getSecondParam());
    }
}

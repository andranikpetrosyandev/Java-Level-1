package com.homework.week9.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void testReverseWhenArgumentIsNull(){
        Exception exception = assertThrows(NullPointerException.class, () -> {
            StringUtils.reverse(null);
        });

        Assertions.assertEquals("Argument is a null should be string",exception.getMessage());
    }
    @Test
    public void testReverseWhenLengthIs1(){
        try {
           Assertions.assertEquals("a", StringUtils.reverse("a"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testReverse(){
        try {
            Assertions.assertEquals("fedcba", StringUtils.reverse("abcdef"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
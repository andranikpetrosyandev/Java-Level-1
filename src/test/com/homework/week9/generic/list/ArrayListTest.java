package com.homework.week9.generic.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {


    @Test
    public void testListAddAndGetMethod() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.put(124);
        Assertions.assertEquals(124, stringArrayList.get(1));

        stringArrayList.put("first item");
        Assertions.assertEquals("first item", stringArrayList.get(1));

    }

    @Test
    public void testListGetItemMethodWithNegativeNumber() {
        ArrayList<String> stringArrayList = new ArrayList<>();

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                stringArrayList.get(-1);
            }
        });
        Assertions.assertEquals("List item can't have negative number. you set the -1", exception.getMessage());
    }

    @Test
    public void testListSizeMethod() {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.put("first item");
        stringArrayList.put("second item");
        Assertions.assertEquals(2, stringArrayList.getSize());

    }

}
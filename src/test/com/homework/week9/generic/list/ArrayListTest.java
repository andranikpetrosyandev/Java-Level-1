package com.homework.week9.generic.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {


    @Test
    public void testListAddMethod() {
        ArrayList<String> stringArrayList =new ArrayList<>();
        stringArrayList.put("Hellod");
    }

    @Test
    public void testListGetItemMethod() {
        ArrayList<String> stringArrayList =new ArrayList<>();
        stringArrayList.put("Hellod");
    }
    @Test
    public void testListGetItemMethodWithNegativeNumber() {
        ArrayList<String> stringArrayList =new ArrayList<>();
        stringArrayList.put("Hellod");
        System.out.println(stringArrayList.get(1));
    }

}
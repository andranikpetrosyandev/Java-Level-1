package com.classroom.week10;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(45, 0.57f);
        map.put("Dell", 2000);

        Integer dellPrice = map.get("Dell");

        System.out.println(dellPrice);
    }
}

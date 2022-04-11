package com.classroom.week13.collection;

import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        System.out.println(list.add("asdasdasda"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
    }
}

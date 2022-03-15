package com.classroom.week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(1000);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Iterator<Integer> iterator = list.iterator();
//
//
//        while (iterator.hasNext()) {
//            if (iterator.next() == 4) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);
//
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        Iterator<Integer> iteratorLinked = list.iterator();
//
//
//        while (iteratorLinked.hasNext()) {
//            System.out.println(iteratorLinked.next());
//        }
//        System.out.println(linkedList);

        List<Integer> linkedNewList = new LinkedList<>();
        for (int i = 0; i <= 100000; i++) {
            linkedNewList.add(i);
        }
        printAll(linkedNewList);


    }

    public static void printAll(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println((System.currentTimeMillis() - start));
    }
}

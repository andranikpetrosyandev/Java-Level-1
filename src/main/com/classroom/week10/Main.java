package com.classroom.week10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable sumRunnable = new SumRunnable(1, 2);
        Runnable mulRunnable = new MulRunnable(1, 2);
        Runnable subtractRunnable = new SubtractRunnable(1, 2);

        List<Runnable> list = new ArrayList<>();
        list.add(sumRunnable);
        list.add(mulRunnable);
        list.add(subtractRunnable);


        mutate(list);
        runRunnable(list);
    }


    public static void mutate(List<Runnable> runnableList) {
        runnableList.remove(0);
    }

    public static void runRunnable(List<Runnable> runnables) {
        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }
    public static void printAll(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println((System.currentTimeMillis() - start));
    }
}

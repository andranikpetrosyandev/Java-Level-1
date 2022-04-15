package com.classroom.week12.integerTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {

    public static synchronized void  increment(int[] a){
        a[0]++;
    }
    public static void main(String[] args) throws InterruptedException {

        final int[] a = {0};
        List<Thread> treadList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(new Random().nextInt(10));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    increment(a);
                }
            });
            treadList.add(thread);
//            thread.start();

        }

        treadList.forEach(new Consumer<Thread>() {
            @Override
            public void accept(Thread thread) {
                    thread.start();
            }
        });
//        for (Thread thread : treadList) {
//            thread.start();
//            thread.join();
//        }
        System.out.println(Arrays.toString(a));

    }
}

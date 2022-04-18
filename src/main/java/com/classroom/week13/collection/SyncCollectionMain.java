package com.classroom.week13.collection;

import java.lang.reflect.Executable;
import java.util.*;
import java.util.concurrent.*;

public class SyncCollectionMain {
    public static void main(String[] args) {
//        List<Integer> shareList = new Vector<>();
//        List<Integer> shareList = new CopyOnWriteArrayList<>();
//        List<Integer> shareList = new CopyOnWriteArrayList<>();
        List<Integer> shareList = Collections.synchronizedList(new ArrayList<>());
        List<Future<?>> futureList = new ArrayList<>();

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 150; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 15; j++) {
                        shareList.add(new Random().nextInt());
                    }
                }
            };
            Future<?> future = executor.submit(runnable);
            futureList.add(future);


//            final Thread thread = new Thread(runnable);
//            thread.start();
//            threadList.add(thread);

        }
        executor.shutdown();
//        threadList.forEach(thread -> {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        System.out.println(shareList.size());
    }
}

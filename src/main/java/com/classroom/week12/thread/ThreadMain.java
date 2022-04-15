package com.classroom.week12.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        Executor executor = Executors.newFixedThreadPool(16);
        System.out.println(System.currentTimeMillis());
        int j = 0;
        List<Thread> threadLists = new ArrayList<>();
        while (j < 1600) {
            for (int i = 0; i < 16; i++) {
                Thread newThread = new Thread(new MyRunnable(j));
                threadLists.add(newThread);
                newThread.start();
            }
            for (Thread thread : threadLists) {
                thread.join();
            }
            threadLists.clear();
            j = j + 16;
        }
    }

    private static class MyRunnable implements Runnable {
        private int number;

        public MyRunnable(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < 3000) {
                System.out.println(number);
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}

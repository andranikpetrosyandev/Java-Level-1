package com.classroom.week12.integerTask;

import java.util.Random;

public class Singltone {
    private static Singltone singltone = null;

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    if (new Random().nextInt(17) % 2 == 0) {
                        try {
                            Thread.sleep(new Random().nextInt(17));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Singltone.getInstance().hashCode());

                }
            }).start();
        }
    }

    public static synchronized Singltone getInstance() {
        if (singltone == null) {
            singltone = new Singltone();
        }
        return singltone;
    }
}

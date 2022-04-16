package com.homework.week14.thread.interrupt;

import java.util.List;
import java.util.UUID;

public class InterruptionSensitiveRunnable implements Runnable {
    private final List<String> list;

    public InterruptionSensitiveRunnable(List<String> list) {
        this.list = list;
    }


    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.list.add(UUID.randomUUID().toString());
        }
    }
}

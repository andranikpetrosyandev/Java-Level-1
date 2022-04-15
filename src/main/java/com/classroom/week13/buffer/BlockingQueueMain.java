package com.classroom.week13.buffer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueMain {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        final Integer take  = arrayBlockingQueue.take();
        final Integer poll = arrayBlockingQueue.poll();

        arrayBlockingQueue.put(10);
        arrayBlockingQueue.offer(10);
    }
}

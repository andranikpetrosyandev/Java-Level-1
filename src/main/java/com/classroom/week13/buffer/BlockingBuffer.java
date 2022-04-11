package com.classroom.week13.buffer;

import com.homework.week9.generic.queue.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer<T> implements Buffer<T> {
    private ArrayBlockingQueue<T> queue = new ArrayBlockingQueue<T>(1);

    @Override
    public T get() throws InterruptedException {
        return queue.take();
    }

    @Override
    public void put(T t) throws InterruptedException {
        queue.put(t);
    }
}

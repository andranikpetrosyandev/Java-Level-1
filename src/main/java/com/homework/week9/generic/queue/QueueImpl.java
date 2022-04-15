package com.homework.week9.generic.queue;

public class QueueImpl<T> implements Queue<T> {
    private T[] elements;
    private int size = 0;

    public QueueImpl() {
        elements = (T[]) new Object[10000];
    }

    @Override
    public void produce(T obj) {
        if (obj == null) {
            throw new IllegalArgumentException("We can't add null");
        }
        elements[size++] = obj;
    }

    @Override
    public T consume() {
        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }
        T result = elements[--size];
        elements[size] = null;
        return result;
    }

}

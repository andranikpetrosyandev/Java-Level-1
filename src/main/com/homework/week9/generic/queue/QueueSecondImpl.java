package com.homework.week9.generic.queue;

public class QueueSecondImpl<T> implements Queue<T> {
    private Object[] elements;
    private int size = 0;

    public QueueSecondImpl() {
        elements = new Object[10000];
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
        @SuppressWarnings("unchecked") T result = (T)elements[--size];
        elements[size] = null;
        return result;
    }

}

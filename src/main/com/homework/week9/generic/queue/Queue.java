package com.homework.week9.generic.queue;

public interface Queue<T> {
    void produce(T object);

    T consume();

}

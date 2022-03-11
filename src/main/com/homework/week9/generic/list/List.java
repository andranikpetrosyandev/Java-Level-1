package com.homework.week9.generic.list;

public interface List<T> {
    T get(int index);
    void put(T t);
    int getSize();

}

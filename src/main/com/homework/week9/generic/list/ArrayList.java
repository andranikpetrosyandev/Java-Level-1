package com.homework.week9.generic.list;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    static final int ARRAY_LENGTH = 10000;
    private Object[] items;
    private int size = 0;

    public ArrayList() {
        items = new Object[ARRAY_LENGTH];
    }


    @Override
    public T get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("List item can't have negative number. you set the "+ index);
        }
        return (T) items[(index != 0) ? --index : index];
    }

    @Override
    public void put(T o) {
        if (size == 1000) {
            items = increaseArrayLength();
        }
        items[size++] = o;
    }


    @Override
    public int getSize() {
        return size;
    }


    private Object[] increaseArrayLength() {
        return Arrays.copyOf(items, items.length + ARRAY_LENGTH);

    }
}

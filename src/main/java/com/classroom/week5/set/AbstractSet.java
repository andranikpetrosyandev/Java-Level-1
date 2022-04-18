package com.classroom.week5.set;

public abstract class AbstractSet implements Set{
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}

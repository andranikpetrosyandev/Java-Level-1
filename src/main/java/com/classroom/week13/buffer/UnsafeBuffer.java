package com.classroom.week13.buffer;

public class UnsafeBuffer<T> implements Buffer<T> {
    private T value;

    @Override
    public T get() {
        if (value == null) {
            throw new IllegalArgumentException("the buffer is empty");
        }
        T valueToReturn = value;
        value = null;
        this.notifyAll();
        return valueToReturn;
    }

    @Override
    public void put(T t) throws InterruptedException {
        if (t == null) {
            throw new IllegalArgumentException("Provided value is null");
        }
        if (value != null) {
          this.wait();
//            throw new IllegalStateException("The buffer is full");
        }
        value = t;

    }
}

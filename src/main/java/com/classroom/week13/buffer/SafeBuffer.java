package com.classroom.week13.buffer;

public class SafeBuffer<T> implements Buffer<T> {
    private T value = null;


    @Override
    public synchronized T get() throws InterruptedException {
        while (value == null) {
            System.out.println("can not get a value. Waiting");
            wait();
            System.out.println("after");
        }
        T valueToReturn = value;
        value = null;
        this.notifyAll();
        return valueToReturn;
    }

    @Override
    public synchronized void put(T t) throws InterruptedException {
        while (t == null) {
            throw new IllegalArgumentException("Provided value is null");
        }
        if (value != null) {
            this.wait();
        }
        value = t;
        this.notifyAll();
    }

    public static void main(String[] args) {
        final Buffer<Integer> buffer = new BlockingBuffer<>();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable putRunnable = () -> {
                try {
                    buffer.put(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(putRunnable).start();
        }
        for (int i = 0; i < 1000; i++) {
            Runnable getRunnable = () -> {
                try {
                    System.out.println("Printing:" + buffer.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(getRunnable).start();
        }

    }
}

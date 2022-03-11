package com.classroom.week9;

public class GenericCollection<E> {
    private static final int ARRAY_SIZE = 100;
    private Object[] objects = new Object[ARRAY_SIZE];


    public E get(int index) {
        return (E) objects[index];
    }

    public static void main(String[] args) {
        GenericCollection<Integer> collection = new GenericCollection<>();
        collection.objects[0] = 45L;
        collection.objects[1] = "sdasdass";
    }
}

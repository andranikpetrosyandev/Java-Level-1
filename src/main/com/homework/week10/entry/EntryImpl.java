package com.homework.week10.entry;

public class EntryImpl<K, V> implements Entry<K, V> {
    private K key;
    private V value;


    @Override
    public K key() {
        return key;
    }

    @Override
    public V value() {
        return value;
    }

    public void key(K key) {
        this.key = key;
    }

    public void value(V value) {
        this.value = value;
    }
}

package com.example.cardGuess.java_exersises.my_custom_arraylist;

public class ArrayStorage<T> implements Storage<T> {

    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 20;

    public ArrayStorage(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(T value) {

    }

    @Override
    public void insert(Object value, int index) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private void ensureCapacity() {
        int currentCapacity = array.length;
        if (size >= currentCapacity * 0.9) {
            int newCapacity = currentCapacity * 2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}
package com.example.cardGuess.my_custom_arraylist.box;

public class Pair<T, T1> {
    T valueOne;
    T valueTwo;

    public Pair(T valueOne, T valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public T getValueOne() {
        return valueOne;
    }

    public void setValueOne(T valueOne) {
        this.valueOne = valueOne;
    }

    public T getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(T valueTwo) {
        this.valueTwo = valueTwo;
    }

    public boolean getFirst() {
        return valueOne != null;
    }

    public boolean getSecond() {
        return valueTwo != null;
    }
}

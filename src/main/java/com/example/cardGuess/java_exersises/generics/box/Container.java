package com.example.cardGuess.java_exersises.generics.box;

public class Container<T, U> {
    private T value;
    private U numericDigit;

    public Container(T value, U numericDigit) {
        this.value = value;
        this.numericDigit = numericDigit;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public U getNumericDigit() {
        return numericDigit;
    }

    public void setNumericDigit(U numericDigit) {
        this.numericDigit = numericDigit;
    }
}

package com.example.cardGuess.java_exersises.generics.box;
//Create a Generic Class Pair<T, U>:
//
//It should store two values: one of type T (first) and one of type U (second).
//Include a constructor to initialize both values.
//Provide getter methods for both values.
//
//Implement a Method to Swap the Pair:
//
//Write a method swap() that returns a new Pair<U, T> with the values swapped.
//
//Test Your Implementation:
//
//In a main method, create an instance of Pair (for example, <Integer, String>).
//Print the original pair.
//Swap the pair and print the swapped values.

public class PairMyImplementations<T, U> {
    private T first;
    private U second;

    public PairMyImplementations(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
//method to print "hello world"

}
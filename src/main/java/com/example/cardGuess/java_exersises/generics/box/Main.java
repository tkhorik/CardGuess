package com.example.cardGuess.java_exersises.generics.box;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Привет");
        Box<Integer> intBox = new Box<>(42);

        System.out.println(stringBox.getValue()); // Выведет: Привет
        System.out.println(intBox.getValue());   // Выведет: 42}

        String[] strings = {"А", "Б", "В"};
        Integer[] numbers = {1, 2, 3};

        printArray(strings); // Выведет: А Б В
        printArray(numbers); // Выведет: 1 2 3

        Pair<? extends Serializable, Object> pair = new Pair<>(1, "a");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Container<Integer, String> container = new Container<>(11, "String");
        Container<String, String> container2 = new Container<>("eleven", "String");

        System.out.println(container.getValue());
        System.out.println(container2.getValue());
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
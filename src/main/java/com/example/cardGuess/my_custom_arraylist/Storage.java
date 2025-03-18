package com.example.cardGuess.my_custom_arraylist;

public interface Storage<T> {

    T get(int index);

    void add(T value);

    void insert(T value, int index);

    T remove(int index);

    int size();

    boolean isEmpty();
}
//1. ArrayStorage
//
//Создать класс ArrayStorage, который реализует интерфейс Storage.
//Хранение данных в ArrayStorage- массив.
//Первоначальный размер массива = 20.
//Как только свободное место в массиве <= 10%, массив увеличивается в два раза.
//Т.е. при росте количества элементов в Storage, размер внутреннего массива увеличивается.
//Но при уменьшении количества элементов в Storage, размер внутреннего массива не уменьшается.
//
//НЕ ИСПОЛЬЗОВАТЬ ArrayList или любые другие коллекции в ArrayStorage, использовать только обычные массивы.
//
//Поведение ArrayStorage при указанных операциях должно быть точно таким же, как у ArrayList.

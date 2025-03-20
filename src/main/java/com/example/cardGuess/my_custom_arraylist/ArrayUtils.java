package com.example.cardGuess.my_custom_arraylist;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        swap(numbers, 0, 2);
        for (int num : numbers) {
            System.out.print(num + " "); // Выведет: 3 2 1
        }
    }
}

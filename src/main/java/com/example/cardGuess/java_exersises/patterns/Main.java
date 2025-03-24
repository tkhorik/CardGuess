package com.example.cardGuess.java_exersises.patterns;

// Использование фабрики
public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.speak(); // Вывод: Woof!

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.speak(); // Вывод: Meow!
    }
}
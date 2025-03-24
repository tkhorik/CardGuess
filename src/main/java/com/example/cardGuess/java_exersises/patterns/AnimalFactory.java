package com.example.cardGuess.java_exersises.patterns;

// Фабрика для создания объектов
public class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}


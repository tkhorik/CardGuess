package com.example.cardGuess.cardgame;

public enum Color {
    RED("#FF0000"), BLUE("#0000FF");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

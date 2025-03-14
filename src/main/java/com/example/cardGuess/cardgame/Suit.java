package com.example.cardGuess.cardgame;

public enum Suit {
    HEARTS("♥️"), DIAMONDS("♦️"), CLUBS("♣️"), SPADES("♠️");

    private final String s;

    public String getSuitImage() {
        return s;
    }

    Suit(String s) {
        this.s = s;
    }
}
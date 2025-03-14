package com.example.cardGuess.cardgame;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }
    public String getSuitImage() { return suit.getSuitImage(); }
    public String getRankImage() { return rank.getRankImage(); }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
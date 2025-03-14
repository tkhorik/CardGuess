package com.example.cardGuess.cardgame;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        initializeDeck();
    }

    // Initialize the deck with 52 cards
    private void initializeDeck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deal the top card from the deck
    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty!");
        }
        return cards.remove(0); // Remove from the top
    }

    public int remainingCards() {
        return cards.size();
    }
}
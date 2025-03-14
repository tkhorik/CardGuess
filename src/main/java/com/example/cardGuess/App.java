package com.example.cardGuess;

import com.example.cardGuess.cardgame.Card;
import com.example.cardGuess.cardgame.Deck;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            Card card = deck.dealCard();
            System.out.println("Dealt: " + card);
            System.out.println("Suit: " + card.getSuit());
            System.out.println("Rank: " + card.getRank());
            System.out.println(card.getRankImage()+ card.getSuitImage());
        }

        System.out.println("Remaining cards: " + deck.remainingCards());
    }
}
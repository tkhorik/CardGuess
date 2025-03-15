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
            System.out.println(card.getRankImage() + card.getSuitImage());
        }

//        todo: some more logic
//        create game dialog to select renderer, color or symbol
//                create game logic which checks if the card is the same as the one in the deck
        // game only for red/black chooses
        // create game counter for the number of correct guesses
        // create logic whitch contoled your guesses and who will be the winner (if your fail guesses are
        // more than the correct guesses, you lose)

        System.out.println("Remaining cards: " + deck.remainingCards());
    }
}
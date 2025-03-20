package com.example.cardGuess;

import com.example.cardGuess.cardgame.Card;
import com.example.cardGuess.cardgame.Deck;
import com.example.cardGuess.dialogs.Dialog;
import com.example.cardGuess.dialogs.IntegerDialog;
import com.example.cardGuess.dialogs.StringSelectDialog;
import com.example.cardGuess.renderer.CardRenderer;
import com.example.cardGuess.renderer.TextRenderer;

import java.util.Arrays;

public class Game {

    private static final String KEY_BLACK = "b";
    private static final String KEY_RED = "r";
    private final Deck deck;
    private final CardRenderer cardRenderer;

    public Game(Deck deck, CardRenderer renderer) {
        this.deck = deck;
        this.cardRenderer = renderer;
    }

    public void startGame() {
        System.out.println("CARD GUESS GAME");
        Deck deck = new Deck();
        String[] keys = {KEY_BLACK, KEY_RED};
        String title = String.format("\nУгадай карту черная %s - красная %s", keys[0], keys[1]);
        String error = "Ошибка ввода! Необходимо ввести одно из значений: " + Arrays.toString(keys);
        Dialog<String> dialog = new StringSelectDialog(title, error, keys);

//        Dialog<Integer> bet = new IntegerDialog(titleBet,error, betmin,betmax);
        BetController betController = new BetController();

        deck.shuffle();
        CardRenderer textRenderer = new TextRenderer();
        textRenderer.render(deck.dealCard());
        betController.startBetting();
        while (deck.remainingCards() > 0) {
            Card card = deck.dealCard();
            String betquastion = dialog.input();
            String userInput = dialog.input();

            if (isCorrect(card, userInput)) {
                System.out.println("Correct guess!");
                System.out.println(card.getRankImage() + " " + card.getSuitImage());
                System.out.println("Remaining cards: " + deck.remainingCards());

                // give bonus
            } else {
                System.out.println("Incorrect guess!");
                System.out.println(card.getRankImage() + " " + card.getSuitImage());
                System.out.println("Remaining cards: " + deck.remainingCards());
                // give penalty
            }
            textRenderer.render(card);
        }
    }

    private boolean isCorrect(Card card, String key) {
        return card.isRed() && key.equals(KEY_RED) || !card.isRed() && key.equals(KEY_BLACK);
    }
}

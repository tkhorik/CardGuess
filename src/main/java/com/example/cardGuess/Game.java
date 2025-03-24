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
        Deck deck = new Deck();
        deck.shuffle();
        BetController betController = new BetController();
        CardRenderer textRenderer = new TextRenderer();

        String[] keyCardColor = {KEY_BLACK, KEY_RED};
        String error = "Ошибка ввода! Необходимо ввести одно из значений: " + Arrays.toString(keyCardColor);

        System.out.println("========== GUESS THE CARD GAME ==========");
        String title = String.format("\nУгадай карту черная %s - красная %s", keyCardColor[0], keyCardColor[1]);

        Dialog<String> dialog = new StringSelectDialog(title, error, keyCardColor);


        int betmin = betController.scoreCounter.getMinScore();
        int betmax = betController.scoreCounter.getMaxScore();

        Dialog<Integer> betDialog = new IntegerDialog("ВВедите вашу ставку (целое число)", error, betmin, betmax);

        textRenderer.render(deck.dealCard());

        while (deck.remainingCards() > 0) {

//            betController.startBetting();
            Card card = deck.dealCard();
            int askBetAmount = betDialog.input();
            String userInput = dialog.input();

            if (isCorrect(card, userInput)) {
                System.out.println("Correct guess!");
                System.out.println(card.getRankImage() + " " + card.getSuitImage());
                betController.scoreCounter.add(askBetAmount);
                System.out.println("Your bet is win!\uD83D\uDE0A✨ You balance is " + betController.scoreCounter.getScore());
                System.out.println("Remaining cards: " + deck.remainingCards());
            } else {
                System.out.println("Incorrect guess!");
                System.out.println(card.getRankImage() + " " + card.getSuitImage());
                betController.scoreCounter.sub(askBetAmount);
                System.out.println("Your bet is loose!\uD83D\uDC99 You balance is " + betController.scoreCounter.getScore());
                System.out.println("Remaining cards: " + deck.remainingCards());
            }
            textRenderer.render(card);
        }
    }

    private boolean isCorrect(Card card, String key) {
        return card.isRed() && key.equals(KEY_RED) || !card.isRed() && key.equals(KEY_BLACK);
    }
}
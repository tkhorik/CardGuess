package com.example.cardGuess;

import com.example.cardGuess.cardgame.Deck;
import com.example.cardGuess.renderer.TextRenderer;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        TextRenderer renderer = new TextRenderer();

        Game game = new Game(deck, renderer);
        game.startGame();
    }
}
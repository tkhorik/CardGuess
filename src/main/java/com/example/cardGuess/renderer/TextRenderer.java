package com.example.cardGuess.renderer;

import com.example.cardGuess.cardgame.Card;

public class TextRenderer implements CardRenderer {
    @Override
    public void render(Card card) {
        // render card as text
        System.out.println("Rendering card as text: " + card);
    }
}

package com.example.cardGuess.renderer;

import com.example.cardGuess.cardgame.Card;

public class ImageRenderer implements CardRenderer {
    @Override
    public void render(Card card) {
        System.out.println("Rendering card as image: " + card);
    }
}

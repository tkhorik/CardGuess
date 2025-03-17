package com.example.cardGuess.renderer;

import com.example.cardGuess.cardgame.Card;

public class TextRenderer implements CardRenderer {
    @Override
    public void render(Card card) {
        String suit = card.getSuitImage();
        String rank = card.getRankImage();
//        System.out.println("Rendering card as text: " + rank + " of " + suit);
    }
}
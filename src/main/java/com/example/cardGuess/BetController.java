package com.example.cardGuess;

import com.example.cardGuess.dialogs.Dialog;
import com.example.cardGuess.dialogs.IntegerDialog;
import com.example.cardGuess.score_counter.ScoreCounter;


public class BetController {
    String error = "Error не верно введена величина ставки, введите целое число в пределах диапазона";
    ScoreCounter scoreCounter = new ScoreCounter(10, 30000, 1000);
    Dialog<Integer> pinaltyDialog = new IntegerDialog("Введите пенальти: ", error, 0, Integer.MAX_VALUE);
    Dialog<Integer> bonuseDialog = new IntegerDialog("Введите бонус: ", error, 0, Integer.MAX_VALUE);

    public void startBetting() {
        while (!scoreCounter.isMin() && !scoreCounter.isMax()){

            {
                System.out.println("Your score is: " + scoreCounter.getScore());
                int bonus = bonuseDialog.input();
                scoreCounter.add(bonus);
                if (scoreCounter.isMax()) {
                    break;
                }
                System.out.println("Your score now is: " + scoreCounter.getScore());
                int pinalty = pinaltyDialog.input();
                scoreCounter.sub(pinalty);
                if (scoreCounter.isMin()) {
                    break;
                }
            }
        }
    }
}
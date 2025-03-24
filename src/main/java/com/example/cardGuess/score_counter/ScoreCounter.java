package com.example.cardGuess.score_counter;

public class ScoreCounter {

    private int score;
    private final int minScore;
    private final int maxScore;

    public ScoreCounter(int minScore, int maxScore, int score) {
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void add(int value) {
        score += value;
//        if (score > maxScore) {
//            score = maxScore;
//        }
    }

    public void sub(int value) {
        score -= value;
//        if (score < minScore) {
//            score = minScore;
//        }
    }
    public void addWithLimit(int value) {
        score += value;
        if (score > maxScore) {
            score = maxScore;
        }
    }

    public void subWitLimit(int value) {
        score -= value;
        if (score < minScore) {
            score = minScore;
        }
    }


    public boolean isMin() {
        return score <= minScore;
    }

    public boolean isMax() {
        return score >= maxScore;
    }
}
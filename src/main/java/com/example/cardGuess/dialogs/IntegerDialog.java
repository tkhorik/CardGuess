package com.example.cardGuess.dialogs;

import java.util.function.Predicate;

public class IntegerDialog extends AbstractDialog<Integer> {

    public IntegerDialog(String title, String errorMessage, int min, int max) {
        super(title,
                errorMessage,
                Integer::parseInt,
                new minMacrealizator(min, max));
        //тут же его реализовали при помощи анонимного класса
//                n -> n >= min && n <= max);
    }

    // Здесь мы создали новый класс minMacrealizator, который реализует интерфейс Predicate<Integer>.
    private static class minMacrealizator implements Predicate<Integer> {
        private final int min;
        private final int max;

        public minMacrealizator(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean test(Integer n) {
            return n >= min && n <= max;
        }
    }
}
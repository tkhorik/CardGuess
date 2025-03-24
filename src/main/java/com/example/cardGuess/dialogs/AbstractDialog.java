package com.example.cardGuess.dialogs;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractDialog<T> implements Dialog<T> {
    protected final String title;
    protected final String errorMessage;
    protected final Function<String, T> mapper;
    protected final Predicate<T> validator;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String errorMessage, Function<String, T> mapper, Predicate<T> validator) {
        this.title = title;
        this.errorMessage = errorMessage;
        this.mapper = mapper;
        this.validator = validator;
    }

    public T input() {
        while (true) {
            showTitle(this.title);
            String input = scanner.nextLine();
            try {
                T result = mapper.apply(input);
                if (validator.test(result)) {
                    return result;
                }
            } catch (IllegalArgumentException ignored) {
            }
            showError();
        }
    }

    protected void showTitle(String title) {
        System.out.println(title);
    }

    protected void showError() {
        System.out.println(errorMessage);
    }
}
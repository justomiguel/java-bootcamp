package com.firstExercise.tdd;

public class NumberTooBigException extends Exception {
    public NumberTooBigException() {
            super();
    }
    public NumberTooBigException(String message) {
            super(message);
    }
}

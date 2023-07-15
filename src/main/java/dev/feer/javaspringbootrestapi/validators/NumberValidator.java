package dev.feer.javaspringbootrestapi.validators;

import dev.feer.javaspringbootrestapi.converters.NumberConverter;

public abstract class NumberValidator {
    public static void validate(String a) {
        if (!NumberConverter.isNumeric(a)) {
            throwException();
        }
    }

    public static void validate(String a, String b) {
        if (!NumberConverter.isNumeric(a) || !NumberConverter.isNumeric(b)) {
            throwException();
        }
    }

    private static void throwException() {
        throw new RuntimeException("Please set a numeric value!");
    }
}

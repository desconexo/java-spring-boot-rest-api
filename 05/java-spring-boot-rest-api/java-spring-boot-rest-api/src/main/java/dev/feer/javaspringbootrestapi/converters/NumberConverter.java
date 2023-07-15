package dev.feer.javaspringbootrestapi.converters;

public abstract class NumberConverter {
    public static boolean isNumeric(String a) {
        if (a == null) {
            return false;
        }
        String number = a.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}

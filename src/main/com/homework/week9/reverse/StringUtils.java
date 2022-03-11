package com.homework.week9.reverse;

public class StringUtils {

    public static String reverse(String string) {
        if (string == null) {
            throw new NullPointerException("Argument is a null should be string");
        } else if (string.length() == 1) {
            return string;
        }

        StringBuilder reversedString = new StringBuilder();
        for (int i = (string.length() - 1); i >= 0; i--) {
            reversedString.append(string.charAt(i));
        }

        return reversedString.toString();
    }

}

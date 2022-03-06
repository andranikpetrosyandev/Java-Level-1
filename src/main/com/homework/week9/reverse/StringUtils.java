package com.homework.week9.reverse;

public class StringUtils {

    public static String reverse(String string) throws Exception {
        if (string == null) {
            throw new NullPointerException("Argument is a null should be string");
        } else if (string.length() == 1) {
            return string;
        }

        StringBuilder reversedString = new StringBuilder();

        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            reversedString.insert(0, string.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        try {
            reverse(null);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

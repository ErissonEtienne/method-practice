package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String nonFòmate = formatName("Bob", "Smith");
        System.out.println(nonFòmate);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}



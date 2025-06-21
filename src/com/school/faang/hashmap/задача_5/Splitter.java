package com.school.faang.hashmap.задача_5;

import java.util.*;

public class Splitter {

    private final static Set<Character> SEPARATORS = new HashSet<>();

    static {
        SEPARATORS.add(',');
        SEPARATORS.add('.');
        SEPARATORS.add(':');
        SEPARATORS.add('!');
        SEPARATORS.add('?');
        SEPARATORS.add(' ');
        SEPARATORS.add('\'');
        SEPARATORS.add('-');
        SEPARATORS.add('\r');
        SEPARATORS.add('\n');
        SEPARATORS.add('“');
        SEPARATORS.add('”');
    }

    private static String cleanLine(String line) {
        line += ' ';
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c : line.toLowerCase().toCharArray()) {
            if (SEPARATORS.contains(c)) {
                if (!word.isEmpty()) {
                    if (!result.isEmpty()) {
                        result.append(' ');
                    }
                    result.append(word);
                    word = new StringBuilder();
                }
            }
            else {
                word.append(c);
            }
        }
        return result.toString();
    }

    public static String[] parseWords(String line) {
        line = cleanLine(line);
        return line.split(" ");
    }
}

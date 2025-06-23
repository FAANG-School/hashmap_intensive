package com.school.faang.hashmap.задача_5;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        String text = "Пользователи Pikabu активно обсуждают разные темы. " +
                "Иногда обсуждают новости, иногда — технологии. " +
                "Иногда пользователи просто делятся мыслями. " +
                "Иногда важно понять, какие слова чаще всего встречаются в этих обсуждениях. " +
                "Слова могут иногда повторяться снова и снова. " +
                "Иногда обсуждают новости, новости, новости.";

        String cleaned = text
                .toLowerCase() // в нижний регистр
                .replaceAll("[^a-zа-яё0-9 ]", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Слова, которые встречаются больше 5 раз:\n");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println("Слово '" + entry.getKey() + "' — " + entry.getValue() + " раз(а)");
            }
        }
    }
}

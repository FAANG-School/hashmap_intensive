package com.school.faang.hashmap.task_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TextConverter {

    private final Map<String, Integer> countWords = new HashMap<>();

    public void convert(String text) {
        String smallWords = convertToLowerCase(text);
        String deleteSymbol = removeNonAlphanumericCharacters(smallWords);

        ArrayList<String> words = wordsToList(deleteSymbol);

        splitTextIntoWords(words);
        showWordsWithMoreThanFive();
    }

    public String convertToLowerCase(String text) {
        return text.toLowerCase();
    }

    public String removeNonAlphanumericCharacters(String text) {
        return text.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public ArrayList<String> wordsToList(String text) {
        ArrayList<String> words = new ArrayList<>();

        String[] parts = text.split("\\s+");
        Collections.addAll(words, parts);

        return words;
    }

    public void splitTextIntoWords(ArrayList<String> words) {
        for (String word : words) {
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
    }

    public void showWordsWithMoreThanFive() {
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            if (entry.getValue() > 5) {
                System.out.println("Word: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}

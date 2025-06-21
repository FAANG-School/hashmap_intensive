package com.school.faang.hashmap.задача_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String text = "Pikabu - это место, где люди делятся историями. " +
                "Истории бывают смешные, грустные, странные. " +
                "Но самые популярные истории всегда получают больше лайков. " +
                "Лайки, лайки, лайки - все хотят лайки! " +
                "Pikabu без лайков - это как день без солнца. " +
                "Хотя... кто-то может может может может может может и не согласиться с этим утверждением.";

        String processedText = text.toLowerCase()
                .replaceAll("[^a-zа-яё\\s]", ""); // Удаляем всё, кроме букв и пробелов


        String[] words = processedText.split("\\s+");


        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (word.length() > 0) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }


        List<Map.Entry<String, Integer>> trendingWords = wordFrequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 5)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());


        System.out.println("Трендовые слова (встречаются >5 раз):");
        for (Map.Entry<String, Integer> entry : trendingWords) {
            System.out.printf("%-15s: %d раз", entry.getKey(), entry.getValue());
        }


        if (trendingWords.isEmpty()) {
            System.out.println("Нет слов, встречающихся чаще 5 раз");
        }
    }
}

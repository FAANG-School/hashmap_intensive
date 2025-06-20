package com.school.faang.hashmap.задача_5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        String text = "Pikabu — это популярная платформа для обмена контентом. " +
                "Пользователи Pikabu делятся постами, картинками, историями. " +
                "Каждый день на Pikabu публикуются тысячи новых постов. " +
                "Анализ трендов Pikabu помогает понять, что интересует аудиторию. " +
                "Pikabu, pikabu, ПИКАБУ! Все говорят о Pikabu. " +
                "Но Pikabu — это не просто платформа, а целое сообщество. " +
                "Сообщество Pikabu активно обсуждает посты и тренды.";

        String lowerCaseText = text.toLowerCase();

        String cleanedText = lowerCaseText.replaceAll("[^a-zа-яё\\s]", "");

        String[] words = cleanedText.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Трендовые слова (встречаются более 5 раз):");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            if (count > 5) {
                System.out.println(word + " : " + count);
            }
        }

        System.out.println("\nОбщая статистика:");
        System.out.println("Всего слов: " + words.length);
        System.out.println("Уникальных слов: " + wordFrequency.size());

    }
}

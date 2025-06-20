package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<Tweet> tweets = Arrays.asList(
                new Tweet("@anna", "#java", "#programming"),
                new Tweet("@ivan", "#java"),
                new Tweet("@anna", "#java", "#twitter"),
                new Tweet("@elon", "#space", "#tesla"),
                new Tweet("@maria", "#programming", "#java"),
                new Tweet("@elon", "#tesla", "#innovation"),
                new Tweet("@ivan", "#java", "#programming"),
                new Tweet("@anna", "#java", "#programming", "#twitter")
        );

        Map<String, String> topAuthors = findTopAuthors(tweets);

        System.out.println("Лидеры мнений по хэштегам:");
        System.out.println("============================");

        for (Map.Entry<String, String> entry : topAuthors.entrySet()) {

            System.out.printf("Хэштег: %-12s Топ-автор: %s%n",
                    entry.getKey(), entry.getValue());

        }

        System.out.println("\nПодробная статистика:");

        printDetailedStats(tweets);

    }

    public static Map<String, String> findTopAuthors(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> hashtagStats = new HashMap<>();

        for (Tweet tweet : tweets) {

            String author = tweet.getAuthor();

            for (String hashtag : tweet.getHashtags()) {
                Map<String, Integer> authorCounts = hashtagStats.computeIfAbsent(
                        hashtag,
                        k -> new HashMap<>()
                );

                authorCounts.merge(author, 1, Integer::sum);
            }

        }

        Map<String, String> topAuthors = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> hashtagEntry : hashtagStats.entrySet()) {

            String hashtag = hashtagEntry.getKey();
            Map<String, Integer> authorCounts = hashtagEntry.getValue();

            String topAuthor = findTopAuthor(authorCounts);
            topAuthors.put(hashtag, topAuthor);

        }

        return topAuthors;
    }

    private static String findTopAuthor(Map<String, Integer> authorCounts) {
        String topAuthor = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : authorCounts.entrySet()) {

            if (entry.getValue() > maxCount) {

                maxCount = entry.getValue();
                topAuthor = entry.getKey();

            }

        }

        return topAuthor;
    }

    private static void printDetailedStats(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> stats = new HashMap<>();

        for (Tweet tweet : tweets) {

            for (String hashtag : tweet.getHashtags()) {

                stats.computeIfAbsent(hashtag, k -> new HashMap<>())
                        .merge(tweet.getAuthor(), 1, Integer::sum);

            }

        }

        for (Map.Entry<String, Map<String, Integer>> entry : stats.entrySet()) {

            System.out.println("\nХэштег: " + entry.getKey());
            System.out.println("Статистика по авторам:");

            entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(e -> System.out.printf("  %s: %d твитов%n", e.getKey(), e.getValue()));
        }
    }

}

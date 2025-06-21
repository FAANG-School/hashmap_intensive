package com.school.faang.hashmap.задача_6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        List<Tweet> tweets = List.of(new Tweet("@anna", List.of("#java", "#programming")),
                new Tweet("@ivan", List.of("#java")),
                new Tweet("@anna", List.of("#java")),
                new Tweet("@oleg", List.of("#java", "#ai")),
                new Tweet("@ivan", List.of("#ai")),
                new Tweet("@anna", List.of("#ai")),
                new Tweet("@oleg", List.of("#programming", "#java")));

        Map<String, String> result = findTopAuthors(tweets);

        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println("Хэштег: " + entry.getKey() + " лидер: " + entry.getValue());
        }
    }

    public static Map<String, String> findTopAuthors(List<Tweet> tweets) {
        HashMap<String, Map<String, Integer>> hashtagStats = new HashMap<>();

        for (Tweet tweet : tweets) {
            String author = tweet.getAuthor();
            for (String hashtag : tweet.getHashtags()) {
                Map<String, Integer> authorMap = hashtagStats.computeIfAbsent(hashtag, k -> new HashMap<>());
                authorMap.put(author, authorMap.getOrDefault(author, 0) + 1);
            }
        }

        Map<String, String> topAuthors = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : hashtagStats.entrySet()) {
            String hashtag = entry.getKey();
            Map<String, Integer> authorMap = entry.getValue();

            String topAuthor = "";
            Integer maxCount = 0;

            for (Map.Entry<String, Integer> authorEntry : authorMap.entrySet()) {
                if (authorEntry.getValue() > maxCount) {
                    maxCount = authorEntry.getValue();
                    topAuthor = authorEntry.getKey();
                }
            }
            topAuthors.put(hashtag, topAuthor);
        }
        return topAuthors;
    }
}

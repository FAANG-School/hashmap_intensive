package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        List<Tweet> tweets = new ArrayList<>();
        tweets.add(new Tweet("@anna", Arrays.asList("#java", "#programming")));
        tweets.add(new Tweet("@ivan", Arrays.asList("#java")));
        tweets.add(new Tweet("@anna", Arrays.asList("#java")));
        tweets.add(new Tweet("@olga", Arrays.asList("#python", "#datascience")));
        tweets.add(new Tweet("@ivan", Arrays.asList("#datascience")));
        tweets.add(new Tweet("@olga", Arrays.asList("#java", "#python")));
        tweets.add(new Tweet("@ivan", Arrays.asList("#java")));
        tweets.add(new Tweet("@anna", Arrays.asList("#python")));

        map = findTopAuthors(tweets);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String author = entry.getKey();
            String value = entry.getValue();
            System.out.println(author + " " + value);
        }

    }

    public static Map<String, String> findTopAuthors(List<Tweet> tweets){
        Map<String, Map<String, Integer>> hashtagStats = new HashMap<>();

        for (Tweet tweet : tweets) {
            String author = tweet.getAuthor();
            for (String hashtag : tweet.getHashtags()) {
                hashtagStats.putIfAbsent(hashtag, new HashMap<>());
                Map<String, Integer> authorMap = hashtagStats.get(hashtag);
                authorMap.put(author, authorMap.getOrDefault(author, 0) + 1);
            }
        }

        Map<String, String> topAuthors = new HashMap<>();

        for (String hashtag : hashtagStats.keySet()) {
            Map<String, Integer> authorMap = hashtagStats.get(hashtag);

            String topAuthor = null;
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : authorMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    topAuthor = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            topAuthors.put(hashtag, topAuthor);
        }

        return topAuthors;
    }
}

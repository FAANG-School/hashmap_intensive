package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Statistics {


    private Map<String, String> topAuthors;

    private final Map<String, Map<String, Integer>> countHashtags;

    public Statistics() {
        countHashtags = new HashMap<>();
    }

    public void addHashtag(String hashTag, String author) {
        var authorsCount = countHashtags.getOrDefault(hashTag, new HashMap<>());
        authorsCount.put(author, authorsCount.getOrDefault(author, 0) + 1);
        countHashtags.put(hashTag, authorsCount);
    }

    public void addTweet(Tweet tweet) {
        String author = tweet.getAuthor();
        for (String hashtag : tweet.getHashtags()) {
            addHashtag(hashtag, author);
        }
    }

    public void convert() {
        topAuthors = new HashMap<>();
        for (var entry : countHashtags.entrySet()) {
            String bestAuthor = "";
            var hashtag = entry.getKey();
            var authorsCount = entry.getValue();
            for (var cnt : authorsCount.entrySet()) {
                if (cnt.getValue() > authorsCount.getOrDefault(bestAuthor, 0)) {
                    bestAuthor = cnt.getKey();
                }
            }
            topAuthors.put(hashtag, bestAuthor);
        }
    }

    public List<Map.Entry<String, String>> getStatistic() {
        return new ArrayList<>(topAuthors.entrySet());
    }
}

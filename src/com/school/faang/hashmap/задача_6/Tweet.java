package com.school.faang.hashmap.задача_6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tweet {
    private String author;
    private List<String> hashtags;

    public Tweet(String author, List<String> hashtags) {
        this.author = author;
        this.hashtags = hashtags;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public static void findTopAuthors(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> intermediateTopAuthors = new HashMap<>();

        tweets.stream().forEach(tweet -> {
            tweet.getHashtags().stream().forEach(hashtag -> {
                intermediateTopAuthors.putIfAbsent(hashtag, new HashMap<>());
                Map<String, Integer> currentHashtag = intermediateTopAuthors.get(hashtag);
                currentHashtag.put(tweet.getAuthor(), currentHashtag
                        .getOrDefault(tweet.getAuthor(), 0) + 1);
            });
        });

        Map<String, String> topAuthors = new HashMap<>();
        intermediateTopAuthors.entrySet().stream().forEach(entry -> {
            String hashtag = entry.getKey();
            Map<String, Integer> authors = entry.getValue();

            authors.entrySet().stream().forEach(stringIntegerEntry -> {
                if (topAuthors.containsKey(hashtag)) {
                    if (authors.get(topAuthors.get(hashtag)) < stringIntegerEntry.getValue()) {
                        topAuthors.replace(hashtag, stringIntegerEntry.getKey());
                        return;
                    }
                }
                else {
                    topAuthors.put(hashtag, stringIntegerEntry.getKey());
                }
            });
        });

        for (Map.Entry<String, String> entry : topAuthors.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

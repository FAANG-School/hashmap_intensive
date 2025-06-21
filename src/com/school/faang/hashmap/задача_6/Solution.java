package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Solution {
    static class Tweet {
        private String author;
        private List<String> hashtags;

        public Tweet(String author, List<String> hashtags) {
            this.author = author;
            this.hashtags = new ArrayList<>(hashtags);
        }

        public String getAuthor() {
            return author;
        }

        public List<String> getHashtags() {
            return hashtags;
        }
    }
    public static void main(String[] args) {
        Tweet firstTweet = new Tweet("Gelliwar", new ArrayList<>(Arrays.asList("python", "automatization")));
        Tweet secondTweet = new Tweet("elonmusk", new ArrayList<>(Arrays.asList("newcar","tesla")));
        Tweet thirdTweet = new Tweet("elonmusk", new ArrayList<>(Arrays.asList("automatization", "messages")));

        List<Tweet> tweets = new ArrayList<>();
        tweets.add(firstTweet);
        tweets.add(secondTweet);
        tweets.add(thirdTweet);

        Map<String, Map<String, Integer>> statictics = new HashMap<>();

        for (Tweet tweet : tweets) {
            for (String hashtag : tweet.getHashtags()) {
                if (!statictics.containsKey(hashtag)) {
                    statictics.put(hashtag, new HashMap<>(tweet.getAuthor(), 1));
                }
                else {
                    statictics.put(hashtag, new HashMap<>(tweet.getAuthor(), statictics.get(hashtag).get(tweet.getAuthor()) + 1));
                }
             }
        }
    }
}

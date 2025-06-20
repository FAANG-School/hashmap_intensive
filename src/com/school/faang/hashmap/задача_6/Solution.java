package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        TweetService tweetService = new TweetService();
        tweetService.createOrPutTweet("Alice", "java", "spring");
        tweetService.createOrPutTweet("Bob", "java", "docker");
        tweetService.createOrPutTweet("Alice", "java", "spring");
        tweetService.createOrPutTweet("Charlie", "docker");

        Map<String, String> topAuthors = tweetService.findTopAuthors();
        System.out.println(topAuthors);

    }
}

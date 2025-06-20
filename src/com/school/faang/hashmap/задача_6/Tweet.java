package com.school.faang.hashmap.задача_6;

import java.util.Arrays;
import java.util.List;

public class Tweet {

    String author;
    List<String> hashtags;

    public Tweet(String author, String... hashtags) {
        this.author = author;
        this.hashtags = Arrays.asList(hashtags);
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getHashtags() {
        return hashtags;
    }
}

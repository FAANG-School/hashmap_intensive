package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Tweet {

    private final String author;

    private final List<String> hashtags;

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
}

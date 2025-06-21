package com.school.faang.hashmap.task_6;

import java.util.List;

public class Tweet {
    private String author;
    private List<String> hashtags;

    // Конструктор
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

    @Override
    public String toString() {
        return "Tweet{author='" + author + "', hashtags=" + hashtags + '}';
    }
}

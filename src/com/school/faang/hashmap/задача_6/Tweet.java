package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tweet {
    String author;
    List<String> hashtags;

    public Tweet(String author, String hashtag) {
        this.author = author;
        this.hashtags = new ArrayList<>();
        this.hashtags.add(hashtag);
    }


    public Tweet(String author, String ...hashtag) {
        this.author = author;
        this.hashtags = new ArrayList<>();
        addHashtags(hashtag);
    }



    public Tweet(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public void addHashTag(String hashtag) {
        this.hashtags.add(hashtag);
    }

    public void addHashtags(String... hashtags) {
        if (hashtags != null) {
            this.hashtags.addAll(
                List.of(hashtags).stream()  // Создаем временный List
                    .filter(Objects::nonNull)
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList()
            );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return Objects.equals(author, tweet.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }
}

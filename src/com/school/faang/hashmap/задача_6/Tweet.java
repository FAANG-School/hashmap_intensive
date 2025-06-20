package com.school.faang.hashmap.задача_6;

import java.util.ArrayList;
import java.util.List;

public class Tweet {

    private String author;
    private List<String> hashtags;

    public Tweet () {
        hashtags = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

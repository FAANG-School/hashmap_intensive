package com.school.faang.hashmap.задача_6;
import java.util.*;
public class Tweet {
    String author;
    List<String> hastegs = new ArrayList();

    Tweet(String author, List<String> hastegs) {
        this.author = author;
        this.hastegs = hastegs;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getHashtags() {
        return hastegs;
    }
}

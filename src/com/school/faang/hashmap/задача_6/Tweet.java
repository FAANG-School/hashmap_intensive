package com.school.faang.hashmap.задача_6;
import java.util.*;
public class Tweet {
    String author;
    List <String> hashtags;
    public Tweet (String author,  List <String> hashtags) {
this.author = author;
this.hashtags = hashtags;
    }
    @Override public String toString() {
              return this.author + " пишет твит с хэштегами " + String.join(" и ",this.hashtags ) + "\n";
    }

}

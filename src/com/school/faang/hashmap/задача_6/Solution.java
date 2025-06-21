package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<Tweet> tweets = new ArrayList<>();
        tweets.add(new Tweet("@anna", List.of("#java", "#programming")));
        tweets.add(new Tweet("@ivan", List.of("#java")));
        tweets.add(new Tweet("@anna", List.of("#java", "#SQL")));
        tweets.add(new Tweet("@ivan", List.of("#SQL", "#DB")));
        tweets.add(new Tweet("@ivan", List.of("#SQL")));
        Statistics statistics = new Statistics();
        for (Tweet tweet : tweets) {
            statistics.addTweet(tweet);
        }
        statistics.convert();
        for (var entry : statistics.getStatistic()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

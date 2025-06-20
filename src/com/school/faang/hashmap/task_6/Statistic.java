package com.school.faang.hashmap.task_6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistic {

    private final Map<String, Map<String, Integer>> statistic = new HashMap<>();

    public void collectStats(List<Tweet> tweets) {
        for (Tweet tweet : tweets) {
            String author = tweet.author();
            for (String hashtag : tweet.hashtags()) {

                if (!statistic.containsKey(hashtag)) {
                    statistic.put(hashtag, new HashMap<>());
                }

                Map<String, Integer> userCounts = statistic.get(hashtag);

                if (!userCounts.containsKey(author)) {
                    userCounts.put(author, 1);
                } else {
                    userCounts.put(author, userCounts.get(author) + 1);
                }
            }
        }
    }

    public Map<String, String> findTopAuthors() {
        Map<String, String> topUsers = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : statistic.entrySet()) {
            String hashtag = entry.getKey();
            Map<String, Integer> userMap = entry.getValue();

            String topUser = null;
            int maxCount = 0;

            for (Map.Entry<String, Integer> userEntry : userMap.entrySet()) {
                if (userEntry.getValue() > maxCount) {
                    maxCount = userEntry.getValue();
                    topUser = userEntry.getKey();
                }
            }

            if (topUser != null) {
                topUsers.put(hashtag, topUser + " (" + maxCount + " times)");
            }
        }

        return topUsers;
    }

    public void printTopAuthors(List<Tweet> tweets) {
        collectStats(tweets);
        Map<String, String> topAuthors = findTopAuthors();

        for (Map.Entry<String, String> entry : topAuthors.entrySet()) {
            System.out.println(entry.getKey() + "  → Top user: " + entry.getValue());
        }
    }
}

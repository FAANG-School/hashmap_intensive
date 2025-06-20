package com.school.faang.hashmap.задача_6;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Tweet>tweets = new ArrayList<>();
        tweets.add(new Tweet("@anna", Arrays.asList("#java", "#programming")));
        tweets.add(new Tweet("@ivan", Arrays.asList("#java")));
        tweets.add(new Tweet("@anna", Arrays.asList("#java", "#algorithm")));
        tweets.add(new Tweet("@maria", Arrays.asList("#programming", "#python")));
        tweets.add(new Tweet("@alex", Arrays.asList("#python", "#datascience")));
        tweets.add(new Tweet("@alex", Arrays.asList("#python", "#algorithm")));
        tweets.add(new Tweet("@anna", Arrays.asList("#go", "#algorithm")));

        Map<String, String> topAuthors = solution.findTopAuthors(tweets);

        topAuthors.forEach((key, value) -> System.out.println(key + " " + value));
    }
    public Map<String, String> findTopAuthors(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> hashtagStat = new HashMap<>();

        for(Tweet tweet: tweets) {
            String author = tweet.getAuthor();
            for(String hashtag: tweet.getHashtags()) {
                Map<String, Integer> authorStat  = hashtagStat.getOrDefault(hashtag, new HashMap<>());
                authorStat.put(author, authorStat.getOrDefault(author, 0) + 1);
                hashtagStat.put(hashtag, authorStat);
            }
        }

        Map<String, String> topAuthors = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry:hashtagStat.entrySet()) {
            String hashtag = entry.getKey();

            int maxCount = 0;
            String author = null;
            for (Map.Entry<String, Integer> authEntry: entry.getValue().entrySet()) {
                if (authEntry.getValue() > maxCount) {
                    maxCount = authEntry.getValue();
                    author = authEntry.getKey();
                }
            }
            topAuthors.put(hashtag, author);
        }
        return topAuthors;
    }
}

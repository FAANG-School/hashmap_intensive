package com.school.faang.hashmap.task_6;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class TwitterAnalyzer {

    public Map<String, String> findTopAuthors(List<Tweet> tweets){

        Map<String, Map<String, Integer>> hashtagAuthorCounts = new HashMap<>();

        for (Tweet tweet: tweets){
            String currentAuthor = tweet.getAuthor();
            List<String> tweetHashtags = tweet.getHashtags();

            for (String hashtag: tweetHashtags){
                if (hashtag == null || hashtag.trim().isEmpty()){
                    continue;
                }
                String cleanedHashtag = hashtag.trim();

                if (!hashtagAuthorCounts.containsKey(cleanedHashtag)){
                    hashtagAuthorCounts.put(cleanedHashtag, new HashMap<>());
                }
                Map<String, Integer> authorCountsForHashtag = hashtagAuthorCounts.get(cleanedHashtag);
                authorCountsForHashtag.put(currentAuthor, authorCountsForHashtag.getOrDefault(currentAuthor, 0) + 1);
            }
        }

        Map<String, String> topAuthors = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : hashtagAuthorCounts.entrySet()) {
            String hashtag = entry.getKey();
            Map<String, Integer> authorsAndCounts = entry.getValue();

            String topAuthor = null;
            int maxTweets = 0;

            for (Map.Entry<String, Integer> authorEntry : authorsAndCounts.entrySet()) {
                String author = authorEntry.getKey();
                int tweetCount = authorEntry.getValue();

                if (tweetCount > maxTweets) {
                    maxTweets = tweetCount;
                    topAuthor = author;
                }
            }

            if (topAuthor != null) {
                topAuthors.put(hashtag, topAuthor);
            }
        }

        return topAuthors;
    }


    public static void main(String[] args) {
        System.out.println("TwitterAnalyzer");

        List<Tweet> tweets = new ArrayList<>();

        tweets.add(new Tweet("@anna", List.of("#java", "#programming", "#dev")));
        tweets.add(new Tweet("@ivan", List.of("#java", "#backend")));
        tweets.add(new Tweet("@anna", List.of("#java", "#ai")));
        tweets.add(new Tweet("@maria", List.of("#ai", "#ml")));
        tweets.add(new Tweet("@ivan", List.of("#backend", "#spring")));
        tweets.add(new Tweet("@anna", List.of("#programming", "#clean_code")));
        tweets.add(new Tweet("@petr", List.of("#java", "#frontend")));
        tweets.add(new Tweet("@maria", List.of("#ml", "#data_science")));
        tweets.add(new Tweet("@ivan", List.of("#java")));

        System.out.println("\nA stream of tweets");
        for (Tweet tweet : tweets) {
            System.out.println(tweet);
        }

        TwitterAnalyzer analyzer = new TwitterAnalyzer();

        Map<String, String> topAuthorsByHashtag = analyzer.findTopAuthors(tweets);

        System.out.println("\nHashtag Leaders");
        if (topAuthorsByHashtag.isEmpty()) {
            System.out.println("There is no data for analysis or no leaders have been found.");
        } else {
            for (Map.Entry<String, String> entry : topAuthorsByHashtag.entrySet()) {
                System.out.println("Hashtag: '" + entry.getKey() + "' -> Leader: '" + entry.getValue() + "'");
            }
        }
    }
}
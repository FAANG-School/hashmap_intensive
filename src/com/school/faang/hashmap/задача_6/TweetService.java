package com.school.faang.hashmap.задача_6;

import java.util.*;
import java.util.stream.Collectors;

public class TweetService {

    private List<Tweet> tweets;

    public TweetService() {
        this.tweets = new ArrayList<>();
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void createOrPutTweet(String author,String... hashtags) {
        Optional<Tweet>  existsTweet = tweets.stream()
            .filter(
            tweet -> tweet.getAuthor().equals(author)
            )
            .findFirst();
        if(existsTweet.isPresent()) {
            existsTweet.get().addHashtags(hashtags);
            return;
        }
        tweets.add(new Tweet(author,hashtags));
    }

    Map<String, String> findTopAuthors() {
        Map<String, Map<String, Integer>> hashtagsWithAuthorAndCounts = new HashMap<>(); // вообще для X надо было использовать Long, но я делаю не для него так, что Integer
        for(Tweet tweet : tweets) {
            String author = tweet.getAuthor();
            for(String hashTag : tweet.getHashtags()) {
                hashtagsWithAuthorAndCounts
                    .computeIfAbsent(hashTag, tags -> new HashMap<>())
                    .merge(author,1, Integer::sum);
            }
        }
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : hashtagsWithAuthorAndCounts.entrySet()) {
            String hashtag = entry.getKey();
            Map<String, Integer> authorsAndCount = entry.getValue();

            String leaderAuthor = authorsAndCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
            if(leaderAuthor != null) {
                result.put(hashtag, leaderAuthor);
            }
        }
        return result;
    }


}

package com.school.faang.hashmap.задача_6;

public class Solution {
    public static void main(String[] args) {
        Tweet tweetOne = new Tweet("@anna", List.of("#java", "#programming"));
        Tweet tweetTwo = new Tweet("@ivan", List.of("#java"));
        Tweet tweetThree = new Tweet("@ivan", List.of("#java"));
        Tweet tweetFour = new Tweet("@ivan", List.of("#java"));
        Tweet tweetFive = new Tweet("@ivan", List.of("#java"));

        List<Tweet> tweets = List.of(tweetOne, tweetTwo, tweetThree, tweetFour, tweetFive);

        for (Map.Entry<String, String> entry : findTopAuthors(tweets).entrySet()) {
            System.out.println("Хештег: " + entry.getKey() + " → Топ автор: " + entry.getValue());
        }
    }

    private static Map<String, String> findTopAuthors(List<Tweet> tweets) {
        Map<String, Map<String, Integer>> hashtagStats = new HashMap<>();

        for (Tweet tweet : tweets) {
            String author = tweet.author();

            for (String hashtag : tweet.hashtags()) {
                hashtagStats
                        .computeIfAbsent(hashtag, _ -> new HashMap<>())
                        .merge(author, 1, Integer::sum);
            }
        }

        Map<String, String> topAuthors = new HashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : hashtagStats.entrySet()) {
            String hashtag = entry.getKey();
            Map<String, Integer> authorStats = entry.getValue();

            String topAuthor = null;
            int maxCount = 0;

            for (Map.Entry<String, Integer> authorEntry : authorStats.entrySet()) {
                if (topAuthor == null || authorEntry.getValue() > maxCount) {
                    topAuthor = authorEntry.getKey();
                    maxCount = authorEntry.getValue();
                }
            }

            topAuthors.put(hashtag, topAuthor);
        }

        return topAuthors;
    }

    public record Tweet(String author, List<String> hashtags) {

        @Override
        public String toString() {
            return "Tweet{" +
                    "author='" + author + '\'' +
                    ", hashtags=" + hashtags +
                    '}';
        }
    }

}

package com.school.faang.hashset.задача_6;

public class Solution {
    public static void main(String[] args) {
        RecommendationEngine engine = new RecommendationEngine();

        engine.addVideo("Channel 1", "Title 1");
        engine.addVideo("Channel 1", "Title 2");
        engine.addVideo("Channel 3", "Title 3");
        engine.addVideo("Channel 3", "Title 4");
        engine.addVideo("Channel 4", "Title 5");
        engine.addVideo("Channel 5", "Title 6");

        Set<String> subscriptions = new HashSet<>(Arrays.asList("Channel 1", "Channel 3"));
        Set<String> watchHistory = new HashSet<>(Collections.singletonList("Title 1"));

        List<String> feed = engine.generateFeed(subscriptions, watchHistory);
        System.out.println("Рекомендации для пользователя: ");
        for (String video : feed) {
            System.out.println(video);
        }

        System.out.println("\nПовторный запуск: ");
        feed = engine.generateFeed(subscriptions, watchHistory);

        for (String video : feed) {
            System.out.println(video);
        }
    }

    private static class RecommendationEngine {
        private final Map<String, HashSet<String>> videosByChannel = new HashMap<>();

        public void addVideo(String channelName, String videoTitle) {
            videosByChannel.computeIfAbsent(channelName, _ -> new HashSet<>()).add(videoTitle);
        }

        public List<String> generateFeed(Set<String> subscriptions, Set<String> watchHistory) {
            Set<String> recommendations = new HashSet<>();

            for (String channel : subscriptions) {
                Set<String> videos = videosByChannel.get(channel);

                if (videos != null) {
                    recommendations.addAll(videos);
                }
            }

            recommendations.removeAll(watchHistory);
            ArrayList<String> finalFeed = new ArrayList<>(recommendations);
            Collections.shuffle(finalFeed);

            return finalFeed;
        }
    }
}

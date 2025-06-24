package com.school.faang.hashset.задача_6;

import java.util.*;

public class Solution {
    static class RecommendationEngine {
        private HashMap<String, HashSet<String>> videosByChannel;

        public RecommendationEngine(HashMap<String, HashSet<String>> videosByChannel) {
            this.videosByChannel = videosByChannel;
        }

        void addVideo(String channelName, String videoTitle) {
            if (videosByChannel.containsKey(channelName)) {
                videosByChannel.get(channelName).add(videoTitle);
            }
            else {
                videosByChannel.put(channelName, new HashSet<>(List.of(videoTitle)));
            }
        }

        HashSet<String> getVideos(String channelName) {
            return videosByChannel.get(channelName);
        }
    }

    public List<String> generateFeed(HashSet<String> subscriptions, HashSet<String> watchHistory, RecommendationEngine engine) {

        HashSet<String> recommendations = new HashSet<>();

        for (String channel : subscriptions) {
            recommendations.addAll(engine.getVideos(channel));
        }

        recommendations.removeAll(watchHistory);

        ArrayList<String> finalSeed = new ArrayList<>(recommendations);
        Collections.shuffle(finalSeed);

        return finalSeed;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        RecommendationEngine engine = new RecommendationEngine(new HashMap<>());
        engine.addVideo("MrBeast","100 людей в кругу");
        engine.addVideo("Собака","Один день из моей жизни");
        engine.addVideo("MrBeast", "7 дней на плоту");
        engine.addVideo("FAANG School", "HashMap в Java");
        engine.addVideo("FAANG School", "HashSet в Java");

        System.out.println(solution.generateFeed(new HashSet<>(engine.videosByChannel.keySet()), new HashSet<>(List.of("HashMap в Java")), engine));
    }
}

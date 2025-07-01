package com.school.faang.hashset.задача_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        RecommendationEngine recommendationEngine = new RecommendationEngine();

        recommendationEngine.addVideo("A4", "100 km in mile");
        recommendationEngine.addVideo("Mr.Beast", "Super Strong");
        recommendationEngine.addVideo("A4", "Who run faster");
        recommendationEngine.addVideo("A4", "Best boll");
        recommendationEngine.addVideo("Cook together", "100 best resepiece");
        recommendationEngine.addVideo("Mr.Beast", "Who broke first");

        Set<String> subscriptions = Set.of("Mr.Beast", "A4", "Cook together");
        Set<String> watchHistory = Set.of("100 km in mile", "Super Strong", "Who run faster");

        System.out.println(recommendationEngine.generateFeed(subscriptions, watchHistory));
    }
}

class RecommendationEngine {
    private Map<String, Set<String>> videosByChannel;

    public RecommendationEngine() {
        this.videosByChannel = new HashMap<>();
    }

    public void addVideo(String channelName, String videoTitle) {
        if (videosByChannel.containsKey(channelName)) {
            videosByChannel.get(channelName).add(videoTitle);
        }else {
            Set<String> newset = new HashSet<>();
            newset.add(videoTitle);

            videosByChannel.put(channelName, newset);
        }
    }

    public List<String> generateFeed(Set<String> subscriptions, Set<String> watchHistory) {
        Set<String> recommendations = new HashSet<>();

        for (String channel : subscriptions) {
            recommendations.addAll(videosByChannel.get(channel));
        }

        recommendations.removeAll(watchHistory);

        return new ArrayList<>(recommendations);
    }
}

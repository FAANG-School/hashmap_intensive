package com.school.faang.hashset.задача_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RecommendationEngine {
    private final Map<String, Set<String>> videosByChannel;

    public RecommendationEngine() {
        this.videosByChannel = new HashMap<>();
    }

    public void addVideo(String channelName, String videoTitle) {
        videosByChannel.putIfAbsent(channelName, new HashSet<>());
        videosByChannel.get(channelName).add(videoTitle);
    }

    public List<String> generateFeed(Set<String> subscriptions, Set<String> watchHistory) {
        Set<String> recommendations = new HashSet<>();

        recommendations.addAll(videosByChannel.entrySet().stream()
                .filter(e -> subscriptions.contains(e.getKey()))
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toSet()));

        recommendations.removeAll(watchHistory);
        List<String> finalFeed = new ArrayList<>(recommendations);
        Collections.shuffle(finalFeed);
        return finalFeed;
    }
}

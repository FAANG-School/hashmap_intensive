package com.school.faang.hashset.задача_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {
    private HashMap<String, HashSet<String>> videosByChannel;

    public RecommendationEngine(HashMap<String, HashSet<String>> videosByChannel) {
        this.videosByChannel = videosByChannel;
    }

    public void addVideo(String channelName, String videoTitle) {
        if (!videosByChannel.containsKey(channelName)) {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(videoTitle);
            videosByChannel.putIfAbsent(channelName, hashSet);
        } else {
            videosByChannel.get(channelName).add(videoTitle);
        }
    }

    public List<String> generateFeed(HashSet<String> subscriptions, HashSet<String> watchHistory) {
        Set<String> recommendations = new HashSet<>();
        videosByChannel
                .values()
                .stream()
                .forEach(setVideo -> recommendations.addAll(setVideo));
        recommendations.removeAll(watchHistory);
        List<String> finalField = new ArrayList<>(recommendations);
        Collections.shuffle(finalField);
        return finalField;
    }
}

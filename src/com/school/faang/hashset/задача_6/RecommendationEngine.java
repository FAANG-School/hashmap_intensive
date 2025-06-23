package com.school.faang.hashset.задача_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RecommendationEngine {

    private final Map<String, HashSet<String>> videosByChannel;

    public RecommendationEngine() {
        this.videosByChannel = new HashMap<>();
    }

    public void addVideo(String channelName, String videoTitle) {
        if (channelName == null || channelName.trim().isEmpty()) {
            throw new IllegalArgumentException("Название канала не может быть пустым");
        }
        if (videoTitle == null || videoTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Название видео не может быть пустым");
        }

        HashSet<String> channelVideos = videosByChannel.getOrDefault(channelName, new HashSet<>());
        channelVideos.add(videoTitle);
        videosByChannel.put(channelName, channelVideos);
    }

    public List<String> generateFeed(Set<String> subscriptions, Set<String> watchHistory) {

        if (subscriptions == null) {
            subscriptions = new HashSet<>();
        }
        if (watchHistory == null) {
            watchHistory = new HashSet<>();
        }

        Set<String> allVideos = new HashSet<>();
        for (String channel : subscriptions) {
            if (videosByChannel.containsKey(channel)) {
                allVideos.addAll(videosByChannel.get(channel));
            }
        }

        allVideos.removeAll(watchHistory);

        List<String> finalFeed = new ArrayList<>(allVideos);
        Collections.shuffle(finalFeed);

        return finalFeed;
    }
}
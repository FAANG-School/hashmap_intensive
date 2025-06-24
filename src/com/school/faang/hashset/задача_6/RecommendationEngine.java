package com.school.faang.hashset.задача_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class RecommendationEngine {

    private HashMap<String, HashSet<String>> videosByChannel = new HashMap<>();

    private HashSet<String> videos = new HashSet<>();

    public void addVideo(String channelName, String videoTitle) {

        if (videosByChannel.containsKey(channelName)) {
            videosByChannel.get(channelName).add(videoTitle);
            videos.add(videoTitle);
        } else {
            videosByChannel.put(channelName, new HashSet<>());
            videosByChannel.get(channelName).add(videoTitle);
            videos.add(videoTitle);
        }

    }

    public List<String> generateFeed(HashSet<String> subscriptions, HashSet<String> watchHistory) {
        HashSet<String> recommendations = new HashSet<>();
        recommendations.addAll(subscriptions);
        recommendations.removeAll(watchHistory);
        List<String> finalFeed = new ArrayList<>(recommendations);
        Collections.shuffle(finalFeed);
        return finalFeed;

    }

    public HashSet<String> getVideos() {

        return videos;

    }
}

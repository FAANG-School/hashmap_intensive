package com.school.faang.hashset.задача_6;

import java.util.*;

public class RecommendationEngine {

    private HashMap<String, HashSet<String>> videosByChannel;

    public RecommendationEngine() {

        videosByChannel = new HashMap<>();

    }

    public void addVideo(String channelName, String videoTitle) {

        videosByChannel.computeIfAbsent(channelName, k -> new HashSet<>()).add(videoTitle);

    }

    public List<String> generateFeed(Set<String> subscriptions, Set<String> watchHistory) {

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

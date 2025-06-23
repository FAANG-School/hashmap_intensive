package com.school.faang.hashset.задача_6;

import java.util.*;

public class RecommendationEngine {
     Map<String, Set<String>> videosByChannel;


    public RecommendationEngine() {
        videosByChannel = new HashMap<>();
    }

    void addVideo(String channelName, String videoTitle) {
        if (!videosByChannel.containsKey(channelName)) {
            Set<String> videos = new HashSet<>();
            videos.add(videoTitle);
            videosByChannel.put(channelName, videos);
        } else {
            videosByChannel.get(channelName).add(videoTitle);

        }
    }

    List<String> generateFeed(HashSet<String> subscriptions, HashSet<String> watchHistory) {
        Set<String> recommendations = new HashSet<>();

        for(Map.Entry<String, Set<String>> entry: videosByChannel.entrySet()) {
            recommendations.addAll(entry.getValue());
        }
        recommendations.removeAll(watchHistory);
        List<String> songsList = new ArrayList<>(recommendations);
        Collections.shuffle(songsList);
        return songsList;
    }

}

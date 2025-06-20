package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class VideoLikes {
    private Map<String, Integer> videoLikesMap;

    public VideoLikes() {
        this.videoLikesMap  = new HashMap<>();
    }

    public  void  likeVideo(String videoId) {
        if(videoLikesMap.containsKey(videoId)) {
            videoLikesMap.compute(videoId, (k, currentLikes) -> currentLikes + 1);
            return;
        }
        videoLikesMap.put(videoId, 1);

    }

    public  Integer getLike(String videoId) {
        if(videoLikesMap.containsKey(videoId)) {
            return videoLikesMap.get(videoId);
        }
        return 0;
    }

    public Map<String, Integer> getVideoLikesMap() {
        return videoLikesMap;
    }
}

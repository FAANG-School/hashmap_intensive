package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Youtube {
    private Map<String, Integer> videos = new HashMap<>();

    public Map<String, Integer> getVideos() {
        return videos;
    }

    public void likeVideo(String videoId){
        if(!videos.containsKey(videoId)){
            videos.put(videoId, 1);
            return;
        }
        videos.replace(videoId, videos.get(videoId) + 1);
    }

    public int getLikes(String videoId){
        if(!videos.containsKey(videoId)){
            return 0;
        }
        return videos.get(videoId);
    }
}

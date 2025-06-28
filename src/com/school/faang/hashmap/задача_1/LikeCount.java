package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class LikeCount {
    private HashMap<String, Integer> likeCount = new HashMap<>();

    void putVideo(String videoId) {
        likeCount.put(videoId, 0);
    }
    void likeVideo(String videoId) {
        if(!likeCount.containsKey(videoId)){
            likeCount.put(videoId, 1);
        } else {
            likeCount.put(videoId, likeCount.get(videoId) + 1);
        }
    }

    public void printAllLikes() {
        for(Map.Entry<String, Integer> entry : likeCount.entrySet()) {
            String id = entry.getKey();
            Integer count = entry.getValue();
            System.out.println(id + " : " + count);
        }
    }

    public void getLikes(String videoId) {
        System.out.println("Количество лайков " + videoId + ": " + likeCount.get(videoId));
    }
}

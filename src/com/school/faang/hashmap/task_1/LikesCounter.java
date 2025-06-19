package com.school.faang.hashmap.task_1;

import java.util.HashMap;
import java.util.Map;

public class LikesCounter {
    private final Map<String, Integer> likesByVideoId = new HashMap<>();

    public void likeVideo(String videoId) {
        if (likesByVideoId.containsKey(videoId)) {
            likesByVideoId.put(videoId, likesByVideoId.get(videoId) + 1);
        } else {
            likesByVideoId.put(videoId, 1);
        }
    }

    public int getLikes(String videoId) {
        return likesByVideoId.getOrDefault(videoId, 0);
    }
}

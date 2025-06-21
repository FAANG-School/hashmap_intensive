package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> videoLikes = new HashMap<>();
        videoLikes.put("dbltj1", null);
        videoLikes.put("dbltj2", null);
        videoLikes.put("dbltj3", null);

        likeVideo("dbltj1", videoLikes);
        likeVideo("dbltj1", videoLikes);
        likeVideo("dbltj1", videoLikes);
        likeVideo("dbltj1", videoLikes);
        likeVideo("dbltj5", videoLikes);
        System.out.println(getLikes("dbltj1", videoLikes));
        System.out.println(getLikes("dbltj5", videoLikes));
    }

    static void likeVideo(String videoId, Map<String, Integer> videoLikes){
        if (!videoLikes.containsKey(videoId)) {
            videoLikes.put(videoId, 1);
        }else {
            Integer currentLikes = videoLikes.get(videoId);
            if (currentLikes == null) {
                videoLikes.put(videoId, 1);
            } else {
                videoLikes.put(videoId, currentLikes + 1);
            }
        }
    }

    static int getLikes(String videoId, Map<String, Integer> videoLikes){
        if (videoLikes.get(videoId) == null) {
            return 0;
        }else {
            return videoLikes.get(videoId);
        }
    }
}

package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<String, Integer> videoLikes = new HashMap<>();

    public static void likeVideo(String videoId) {
        Integer currentLikes = videoLikes.get(videoId);
        if (currentLikes == null) {
            videoLikes.put(videoId, 1);
        } else {
            videoLikes.put(videoId, currentLikes + 1);
        }
    }

    public static int getLikes(String videoId) {
        return videoLikes.getOrDefault(videoId, 0);
    }

    public static void main(String[] args) {

        videoLikes.put("dQw4w9WgXcQ", 0);
        videoLikes.put("abc123", 0);
        videoLikes.put("xyz789", 0);

        likeVideo("dQw4w9WgXcQ");
        likeVideo("dQw4w9WgXcQ");
        likeVideo("abc123");
        likeVideo("xyz789");
        likeVideo("abc123");
        likeVideo("dQw4w9WgXcQ");

        System.out.println("Likes for dQw4w9WgXcQ: " + getLikes("dQw4w9WgXcQ"));
        System.out.println("Likes for abc123: " + getLikes("abc123"));
        System.out.println("Likes for xyz789: " + getLikes("xyz789"));
        System.out.println("Likes for unknownId: " + getLikes("unknownId"));
    }
}
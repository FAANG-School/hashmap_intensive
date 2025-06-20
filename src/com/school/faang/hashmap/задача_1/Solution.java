package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, Integer> videoLikes = new HashMap<>();

    public static void main(String[] args) {
        likeVideo("1");
        likeVideo("2");
        likeVideo("2");
        likeVideo("3");
        likeVideo("4");
        likeVideo("3");
        likeVideo("3");
        likeVideo("2");
        likeVideo("3");
        likeVideo("1");

        for (Map.Entry<String, Integer> entry : videoLikes.entrySet()) {
            System.out.println("Id видео: " + entry.getKey() + " ; Количество лайков: " + getLikes(entry.getKey()));
        }
    }

    public static void  likeVideo(String videoId) {
        videoLikes.merge(videoId, 1, Integer::sum);
    }

    public static int getLikes(String videoId) {
        return videoLikes.getOrDefault(videoId, 0);
    }
}

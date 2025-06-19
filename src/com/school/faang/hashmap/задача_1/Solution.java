package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    static Map<String, Integer> likedVideos = new HashMap<>();

    static {
        likedVideos.put("video1", 3);
        likedVideos.put("video2", 5);
        likedVideos.put("video3", 7);
        likedVideos.put("video4", 0);
    }

    public static void main(String[] args) {
        System.out.println(likedVideos);

        likeVideo("video1");
        likeVideo("video1");
        likeVideo("video1");
        likeVideo("video2");
        likeVideo("video3");
        likeVideo("video3");
        likeVideo("video3");
        likeVideo("video3");
        likeVideo("video4");
        likeVideo("video5");
        likeVideo("video6");


        for (Map.Entry<String, Integer> pair : likedVideos.entrySet()) {
            System.out.print(pair.getKey() + "=" + getLikes(pair.getKey()) + " "); // для демонстрации getLikes()
        }

    }

    public static void likeVideo(String videoId) {
        Set<String> keys = new HashSet<>(likedVideos.keySet());
        for (String currentKey : keys) { // итерируемся по ключам, чтобы сразу добавлять новые элементы в мапу
            if (currentKey.equals(videoId))
                likedVideos.replace(videoId, likedVideos.get(videoId), likedVideos.get(videoId) + 1);
            if (!keys.contains(videoId))
                likedVideos.put(videoId, 1);
        }

    }

    public static int getLikes(String videoId) {

        return likedVideos.get(videoId);
    }
}

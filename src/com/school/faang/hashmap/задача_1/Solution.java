package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        likeVideo("dQw4w9WgXcQ");
        likeVideo("dQw4w9WgXcQ");
        likeVideo("abc123");
        likeVideo("xyz789");


        System.out.println("Видео dQw4w9WgXcQ: " + getLikes("dQw4w9WgXcQ") + " лайка");
        System.out.println("Видео abc123: " + getLikes("abc123") + " лайк");
        System.out.println("Видео xyz789: " + getLikes("xyz789") + " лайк");
        System.out.println("Видео unknown: " + getLikes("unknown") + " лайков");
    }

    static HashMap<String, Integer> likesMap = new HashMap<>();

    static void likeVideo(String videoId) {
        Integer currentLikes = likesMap.get(videoId);
        {

            if (currentLikes == null) {
                likesMap.put(videoId, 1);

            } else {
                likesMap.put(videoId, currentLikes + 1);
            }

        }
    }

    static int getLikes(String videoId) {

        if (likesMap.containsKey(videoId)) {

            return likesMap.get(videoId);

        } else {

            return 0;
        }

    }
}
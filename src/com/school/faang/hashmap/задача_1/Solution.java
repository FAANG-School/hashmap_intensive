package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Integer> videoLikes = new HashMap<>();

        String video1 = "dQw4w9WgXcQ";
        String video2 = "AbCdEfGhIjK";
        String video3 = "ZyXwVu12345";
        String unlikedVideo = "NoLikeVideo";

        likeVideo(videoLikes, video1);
        likeVideo(videoLikes, video1);
        likeVideo(videoLikes, video1);

        likeVideo(videoLikes, video2);
        likeVideo(videoLikes, video2);

        likeVideo(videoLikes, video3);

        System.out.println(getLikes(videoLikes, video1));
        System.out.println(getLikes(videoLikes, video2));
        System.out.println(getLikes(videoLikes, video3));
        System.out.println(getLikes(videoLikes, unlikedVideo));
    }

    static void likeVideo(HashMap<String, Integer> videoLikes, String videoId) {

        Integer currentLikes = videoLikes.get(videoId);

        if (currentLikes == null) {
            videoLikes.put(videoId, 1);
        } else {
            videoLikes.put(videoId, currentLikes + 1);
        }
    }

     static int getLikes(HashMap<String, Integer> videoLikes, String videoId) {

        Integer likes  = videoLikes.get(videoId);

        if (likes  == null) {
            return 0;
        }

        return likes;
    }
}
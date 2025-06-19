package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<String, Integer> video = new HashMap<>();
    public static void main(String[] args) {

        likeVideo("video1");
        likeVideo("video1");
        likeVideo("video1");

        likeVideo("video2");

        int likes1 = getLikes("video1");
        int likes2 = getLikes("video2");

        System.out.println("Кол-во лайков video1: " + likes1);
        System.out.println("Кол-во лайков video2: " + likes2);
    }

    static void likeVideo(String videoId) {
        Integer likes = video.get(videoId);

         if (likes!= null) {
            video.put(videoId,likes+1);
        } else {
            video.put(videoId,1);
        }
    }
    static int getLikes(String videoId) {
        Integer likes = video.get(videoId);
        if (likes == null) {
            return 0;
        }
        return likes;
    }
}

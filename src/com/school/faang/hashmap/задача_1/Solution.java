package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, Integer> videos = new HashMap<>();

    public static void  likeVideo(String videoID) {
        if(!videos.containsKey(videoID)) {
            videos.put(videoID, 0);
        }

        videos.replace(videoID, videos.get(videoID) + 1);
    }

    public static int getLikes(String videoId) {
        if(!videos.containsKey(videoId)) {
            return 0;
        }
        return videos.get(videoId);
    }



    public static void main(String[] args) {
        videos.put("ABCD1", 30);
        videos.put("ABCD2", 12);
        videos.put("ABCD3", 24);
        videos.put("ABCD4", 54);
        videos.put("ABCD5", 123);

        for(int i=0; i< 25; i++) {
            likeVideo("ABCD1");
        }

        for(int i=0; i< 120; i++) {
            likeVideo("ABCD5");
        }


        likeVideo("ABCD10");
        likeVideo("ABCD10");


        System.out.println(getLikes("ABCD2"));
        System.out.println(getLikes("ABCD5"));
        System.out.println(getLikes("ABCD10"));






    }
}

package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<String, Integer> counter = new HashMap<>();
    public static void main(String[] args) {

        String video = "video";
        String video2 = "video2";
        String video3 = "video3";
        String video4 = "video4";

        likeVideo(video);
        likeVideo(video2);
        likeVideo(video3);
        likeVideo(video3);

        System.out.println(getLikes(video3));
        System.out.println(getLikes(video2));
        System.out.println(getLikes(video4));
    }

    static void likeVideo(String videoId){
        if(!counter.containsKey(videoId)){
            counter.put(videoId, 1);
        }else {
            counter.put(videoId, counter.get(videoId) + 1);
        }
    }

    static int getLikes(String videoId){
        if(counter.containsKey(videoId)){
            return counter.get(videoId);
        }
        return 0;
    }

}

//class Video{
//    String videoId;
//    int likes;
//    public Video(String videoId) {
//        this.videoId = videoId;
//        this.likes = 0;
//    }
//}

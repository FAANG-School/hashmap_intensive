package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        VideosLike videosLike = new VideosLike();
        videosLike.likeVideo("qweqweq");
        videosLike.likeVideo("123");
        videosLike.likeVideo("1111");
        videosLike.likeVideo("1111");
        videosLike.likeVideo("2222");
        videosLike.likeVideo("2");
        videosLike.likeVideo("qweqweq");
        videosLike.likeVideo("qwwwq112");
        videosLike.likeVideo("1111");

        System.out.println(videosLike.getLikes("123"));
        System.out.println(videosLike.getLikes("1111"));
        System.out.println(videosLike.getLikes("qweqweq"));
        System.out.println(videosLike.getLikes("2222"));
        System.out.println(videosLike.getLikes("2"));
        System.out.println(videosLike.getLikes("qwwwq112"));


    }
}
class VideosLike{
    HashMap<String, Integer> videosLike = new HashMap<>();
    void likeVideo(String videoID){
        if (videosLike.containsKey(videoID) == true){
            videosLike.put(videoID, videosLike.get(videoID) + 1);
        }
        else{
            videosLike.put(videoID, 1);
        }
    }

    int getLikes(String videoId){
        if (videosLike.containsKey(videoId)){
            return videosLike.get(videoId);
        } else{
            return 0;
        }
    }

}


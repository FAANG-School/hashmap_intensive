package com.school.faang.hashmap.задача_1;


public class Solution {
    public static void main(String[] args) {
        VideoLikes videoLikes = new VideoLikes();
        videoLikes.likeVideo("test");
        videoLikes.likeVideo("test1");
        videoLikes.likeVideo("test");
        videoLikes.likeVideo("test2");
        videoLikes.likeVideo("test3");
        videoLikes.likeVideo("test2");
        videoLikes.likeVideo("test");

        for(String videoId : videoLikes.getVideoLikesMap().keySet()) {
            System.out.printf("Видео: %s, Количество лайков: %s%n", videoId, videoLikes.getLike(videoId));
        }

    }

}

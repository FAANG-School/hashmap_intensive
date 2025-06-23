package com.school.faang;

import java.util.HashMap;
import java.util.Map;

public class YouTube_Likes {
    private Map<String, Integer> videoLikes = new HashMap<>();

    public void likeVideo(String videoId) {
        if (videoLikes.containsKey(videoId)) {
            int currentLikes = videoLikes.get(videoId);
            currentLikes++;
            videoLikes.put(videoId, currentLikes);
        } else {
            videoLikes.put(videoId, 1);
        }
        System.out.println("The video " + videoId + " is liked!");
    }

    public int getLikes(String videoId){
        if (videoLikes.containsKey(videoId)){
            return videoLikes.get(videoId);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        YouTube_Likes counter = new YouTube_Likes();

        //test_1
        counter.likeVideo("xyfJTIO06_c");

        //test_2
        counter.likeVideo("s5f5yBAShI8");
        counter.likeVideo("s5f5yBAShI8");

        //test_3
        counter.likeVideo("0sliQFhuxys");
        counter.likeVideo("0sliQFhuxys");
        counter.likeVideo("0sliQFhuxys");

        System.out.println("\nResults:");
        System.out.println("Likes for 'xyfJTIO06_c': " + counter.getLikes("xyfJTIO06_c"));
        System.out.println("Likes for 's5f5yBAShI8': " + counter.getLikes("s5f5yBAShI8"));
        System.out.println("Likes for '0sliQFhuxys': " + counter.getLikes("0sliQFhuxys"));
        System.out.println("Likes for a non-existent video 'noVideo': " + counter.getLikes("noVideo"));
    }

}
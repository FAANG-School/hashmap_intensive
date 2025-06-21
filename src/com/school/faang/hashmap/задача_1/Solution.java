package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<String, Integer> likes = new HashMap<>();

    public void likeVideo(String videoId){
        if (likes.containsKey(videoId)){
            likes.put(videoId, likes.get(videoId) + 1);
        } else {
            likes.put(videoId, 1);
        }

    }

    public int getLikes(String videoId){
        if(likes.containsKey(videoId)){
            return likes.get(videoId);
        } else {
            return 0;
        }

    }


    public static void main(String[] args) {
    Solution counter = new Solution();

    counter.likeVideo("dkfjdkjf78sj");
    counter.likeVideo("dkfjdkjf78sj");
    counter.likeVideo("jsdhkah2k22");

        System.out.println(counter.getLikes("dkfjdkjf78sj"));
        System.out.println(counter.getLikes("jsdhkah2k22"));


    }
}

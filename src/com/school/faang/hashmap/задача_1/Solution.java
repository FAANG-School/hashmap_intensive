package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();


        String video1 = "4234";
        String video2 = "934824";
        String video3 = "939873";

        solution.likeVideo(video1);
        solution.likeVideo(video2);
        solution.likeVideo(video3);
        solution.likeVideo(video1);
        solution.likeVideo(video1);

        System.out.println(solution.getLikes(video1));
        System.out.println(solution.getLikes(video2));
        System.out.println(solution.getLikes(video3));

    }

    Map<String, Integer> likeMap = new HashMap<String, Integer>();

    public void likeVideo(String videoId){

        if(likeMap.containsKey(videoId)){
            likeMap.put(videoId, likeMap.get(videoId)+1);
        } else{
            likeMap.put(videoId, 1);
        }
    }

    public int getLikes(String videoId){
        return likeMap.getOrDefault(videoId, 0);
    }
}

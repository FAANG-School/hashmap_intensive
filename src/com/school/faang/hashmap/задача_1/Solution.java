package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final Map<String, Integer> videos = new HashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.likeVideo("dfhdj833");
        solution.likeVideo("dfhdj833");
        solution.likeVideo("dfhdj833");
        solution.likeVideo("wueui892");

        System.out.println(solution.getLikes("dfhdj833"));
        System.out.println(solution.getLikes("wueui892"));
    }

    public void likeVideo(String videoId) {
       if(!videos.containsKey(videoId))
           videos.put(videoId, 1);
       else
           videos.computeIfPresent(videoId, (k,v) -> v+1);
    }

    public int getLikes(String videoId) {
        return videos.getOrDefault(videoId, 0);
    }

}

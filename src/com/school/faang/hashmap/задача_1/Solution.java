package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<String, Integer> map = new HashMap<>();

    public void likeVideo(String videoId){

        if (map.containsKey(videoId)){
            map.put(videoId, map.get(videoId) + 1);
        } else {
            map.put(videoId, 1);
        }
    }

    public int getLikes(String videoId){
        return map.getOrDefault(videoId, 0);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("ukylkyil");
        solution.likeVideo("drgjktiho");
        solution.likeVideo("dQw4w9WgXcQ");

        System.out.println(solution.getLikes("ukylkyil"));

    }
}

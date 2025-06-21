package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<String, Integer> map = new HashMap<>();
    public void likeVideo(String videoid){
        map.put(videoid, map.getOrDefault(videoid, 0) + 1);
    }
    
    public int getLikes(String videoid){
        return map.getOrDefault(videoid, 0);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("xvFZjo5PgG0");
        solution.likeVideo("xvFZjo5PgG0");
        solution.likeVideo("iik25wqIuFo");

        System.out.println("Likes for video dQw4w9WgXcQ: " + solution.getLikes("dQw4w9WgXcQ"));
        System.out.println("Likes for video xvFZjo5PgG0: " + solution.getLikes("xvFZjo5PgG0"));
        System.out.println("Likes for video iik25wqIuFo: " + solution.getLikes("iik25wqIuFo"));
        System.out.println("Likes for non-existent video: " + solution.getLikes("abc123"));


    }
}

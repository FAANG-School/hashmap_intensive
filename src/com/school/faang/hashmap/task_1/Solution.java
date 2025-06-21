package com.school.faang.hashmap.task_1;

import java.util.HashMap;
import java.util.Map;

class LikesTrekker{
    Map<String, Integer> map = new HashMap<>();
    void likeVideo(String videoId){
        map.put(videoId, map.getOrDefault(videoId, 0)+1);
    }
    int getLikes(String videoId){
        return  map.getOrDefault(videoId, 0);
    }
}
public class Solution {

    public static void main(String[] args) {
        LikesTrekker lt = new LikesTrekker();
        lt.likeVideo("dQw4w9WgXcQ");
        lt.likeVideo("dQw4w9WgXcQ");
        lt.likeVideo("dQw4w9WgXcQ");
        System.out.println(lt.getLikes("dQw4w9WgXcQ"));

    }
}

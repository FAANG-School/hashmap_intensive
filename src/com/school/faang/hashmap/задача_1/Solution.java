package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> map;

    public Solution() {
        map = new HashMap<>();
    }

    public void likeVideo(String videoId) {
        if (map.containsKey(videoId)) {
            map.put(videoId, map.get(videoId) + 1);
        } else {
            map.put(videoId, 1);
        }
    }

    public int getLikes(String videoId) {
        if (map.containsKey(videoId)) {
            return map.get(videoId);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        sol.likeVideo("vid-1");
        sol.likeVideo("vid-1");
        sol.likeVideo("vid-2");
        sol.likeVideo("vid-3");
        sol.likeVideo("vid-3");
        sol.likeVideo("vid-3");
        sol.likeVideo("vid-4");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-5");
        sol.likeVideo("vid-6");

        System.out.println(sol.getLikes("vid-1"));
        System.out.println(sol.getLikes("vid-2"));
        System.out.println(sol.getLikes("vid-3"));
        System.out.println(sol.getLikes("vid-4"));
        System.out.println(sol.getLikes("vid-5"));
        System.out.println(sol.getLikes("vid-6"));

    }
}

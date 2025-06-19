package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {
    private HashMap<String, Integer> likesMap;

    public Solution() {
        likesMap = new HashMap<>();
    }

    public void likeVideo(String videoId) {
        if (!likesMap.containsKey(videoId)) {
            likesMap.put(videoId, 1);
        }
        else {
            likesMap.put(videoId, likesMap.get(videoId) + 1);
        }
    }

    public int getLikes(String videoId) {
        if (likesMap.containsKey(videoId)) {
            return likesMap.get(videoId);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("dQw4w9WgXcQ");
        solution.likeVideo("asd32adS");
        System.out.println(solution.getLikes("dQw4w9WgXcQ"));
        System.out.println(solution.getLikes("asd32adS"));
        System.out.println(solution.getLikes("daqeqw2sa3AS"));
    }
}

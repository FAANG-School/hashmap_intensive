package com.school.faang.hashmap.задача_1;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.videoLike.put("id_1", 4);
        int like = solution.getLikes("id_1");
        System.out.println("Result after getLikes: " + like);
        solution.likeVideo("id_1");
        System.out.println("Result after like: "+ solution.videoLike.get("id_1"));
        System.out.println("Get unexist video-like: " + solution.getLikes("id2"));
        solution.likeVideo("id3");
        System.out.println("Like unexist video-like: " + solution.videoLike.get("id3"));
    }

    private HashMap<String, Integer> videoLike = new HashMap<>();

    private int getLikes(String videoId) {
        return videoLike.getOrDefault(videoId, 0);
    }

    private void likeVideo(String videoId) {
        if (!videoLike.containsKey(videoId)) {
            videoLike.put(videoId, 1);
        }
        else {
            videoLike.put(videoId, videoLike.get(videoId) + 1);
        }

    }

}

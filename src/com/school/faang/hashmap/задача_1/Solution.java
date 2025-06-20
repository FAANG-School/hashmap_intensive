package com.school.faang.hashmap.задача_1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String videoID1 = "imwbpodBWTE";
        String videoID2 = "Gpnd7f7L4xE";
        String videoID3 = "sPSlRTkFXao";
        LikeCounter likeCounter = new LikeCounter();
        likeCounter.setLike(videoID1);
        likeCounter.setLike(videoID2);
        likeCounter.setLike(videoID3);
        likeCounter.setLike(videoID2);
        likeCounter.setLike(videoID3);
        likeCounter.setLike(videoID3);
        for (String videoID : likeCounter.getVideosId()) {
            System.out.println(videoID + " " + likeCounter.getLikes(videoID));
        }
    }
}

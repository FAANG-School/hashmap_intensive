package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Video{
    Map<String, Integer> listOfVideo= new HashMap<>();
    void likeVideo(String videoId){
        if(!listOfVideo.containsKey(videoId)){
            listOfVideo.put(videoId, 1);
        }
        else{
            int value = listOfVideo.get(videoId);
            value++;
            listOfVideo.put(videoId, value);

        }
    }
    int getLikes(String videoId){
        Integer likes = listOfVideo.get(videoId);
        if (likes!=null){
            return likes;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(listOfVideo, video.listOfVideo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfVideo);
    }
}

public class Solution {
    public static void main(String[] args) {
        Video video = new Video();
        video.likeVideo("Hbdh2K3");
        video.likeVideo("Hbdh2K3");
        video.likeVideo("Hbdh2K3");
        video.likeVideo("Hbdh2K3");
        video.likeVideo("Hbdh2K3");
        video.likeVideo("Hbdh2K3");
        video.likeVideo("BJ2N1L2");
        System.out.println(video.getLikes("Hbdh2K3"));
        System.out.println(video.getLikes("BJ2N1L2"));
        System.out.println(video.getLikes("hjdf7sdh"));

    }
}

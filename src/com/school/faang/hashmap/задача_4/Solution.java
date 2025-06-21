package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static Map<String, List<Music>> filteredMusic = new HashMap<>();

    public static Map<String, List<Music>> makePlaylist(List<Music> musicList) {
//        Map<String, List<String>> filteredMusic = new HashMap<>();

        for(int i =0; i<musicList.size(); i++) {
            if(!filteredMusic.containsKey(musicList.get(i).getGenre())) {
                List<Music> list = new ArrayList<>();

                filteredMusic.put(musicList.get(i).getGenre(), list);
            } else {
                filteredMusic.get(musicList.get(i).getGenre()).add(musicList.get(i));
            }
        }


        return filteredMusic;
    }



    public static void main(String[] args) {
        Music music1 = new Music("Bohemian Rhapsody", "Rock");
        Music music2 = new Music("Smells Like Teen Spirit", "Rock");
        Music music3 = new Music("Shape of You", "Pop");
        Music music4 = new Music("Blinding Lights", "Pop");
        Music music5 = new Music("Lose Yourself", "Hip-Hop");


        List<Music> musicList = new ArrayList<>();
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        musicList.add(music4);
        musicList.add(music5);

        makePlaylist(musicList);
//
//        for(Map.Entry<String, List<String>> entry : filteredMusic.entrySet()) {
//            System.out.println(entry.getValue());
//        }

        List<Music> listy = filteredMusic.get("Rock");

        for(Music music : listy) {
            System.out.println(music.getName());
        }




    }
}



class Music {
    private String name;
    private String genre;
    public Music(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
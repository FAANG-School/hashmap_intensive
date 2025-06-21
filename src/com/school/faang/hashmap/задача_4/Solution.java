package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final Map<String, List<String>> categories = new HashMap<>();
    private static final List<String> playList = new ArrayList<>();

    public static void main(String[] args) {
        initListMusic();
        System.out.println(groupSongs(playList));
    }

    private static void initListMusic() {
        playList.add("Bohemian Rhapsody - Rock");
        playList.add("Smells Like Teen Spirit - Rock");
        playList.add("Shape of You - Pop");
        playList.add("Blinding Lights - Pop");
        playList.add("Lose Yourself - Hip-Hop");
    }

    public static Map<String, List<String>> groupSongs(List<String> soundList) {
        for (String music : soundList) {
            String[] part = music.split(" - ", 2);
            String title = part[0];
            String genre = part[1];
            if (!categories.containsKey(part[1])) {
                List<String> songs = new ArrayList<>();
                songs.add(title);
                categories.put(genre, songs);
            } else {
                List<String> songs = categories.get(genre);
                songs.add(title);
            }
        }
        return categories;
    }
}

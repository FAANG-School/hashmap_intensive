package com.school.faang.hashmap.задача_4;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();

        songs.add("Bohemian Rhapsody - Рок");
        songs.add("Smells Like Teen Spirit - Рок");
        songs.add("Shape of You - Поп");
        songs.add("Bad Guy - Поп");
        songs.add("SICKO MODE - Хип-хоп");
        songs.add("God's Plan - Хип-хоп");
        songs.add("Starboy - Электроника");
        songs.add("Animals - Электроника");
        songs.add("Blinding Lights - Поп");
        songs.add("Thunderstruck - Рок");

        Map<String, List<String>> grouped = groupSongs(songs);

        for (Map.Entry<String, List<String>> entry: grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, List<String>> groupSongs(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();

        for (String song: list) {
            String songName = song.split(" - ")[0];
            String songGenre = song.split(" - ")[1];

            if (!map.containsKey(songGenre)) {
                map.put(songGenre, new ArrayList<String>());
            } else {
                map.get(songGenre).add(songName);
            }
        }

        return map;
    }
}

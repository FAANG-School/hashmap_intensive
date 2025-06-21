package com.school.faang.hashmap.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class YandexMusicGenres {
    public Map<String, List<String>> groupSongsByGenre(List<String> songs) {
        Map<String, List<String>> genreMap = new HashMap<>();

        for (String songEntry: songs){
            if (!songEntry.contains(" - ")){
                System.err.println("String format error: " + songEntry + ". Skip it.");
                continue;
            }
            String[] parts = songEntry.split(" - ", 2);
            String songTitle = parts[0].trim();
            String genre = parts[1].trim();

            if (!genreMap.containsKey(genre)){
                List<String> songsInGenre = new ArrayList<>();
                songsInGenre.add(songTitle);
                genreMap.put(genre, songsInGenre);
            } else {
                List<String> songsInGenre = genreMap.get(genre);
                songsInGenre.add(songTitle);
            }
        }
        return genreMap;
    }

    public static void main(String[] args) {
        System.out.println("Grouping songs by genre for Yandex.Music");

        List<String> allSongs = new ArrayList<>();
        allSongs.add("Bohemian Rhapsody - Rock");
        allSongs.add("Smells Like Teen Spirit - Rock");
        allSongs.add("Shape of You - Pop");
        allSongs.add("Blinding Lights - Pop");
        allSongs.add("Lose Yourself - Hip-Hop");
        allSongs.add("Stairway to Heaven - Rock");
        allSongs.add("Billie Jean - Pop");

        YandexMusicGenres musicGrouper = new YandexMusicGenres();

        Map<String, List<String>> groupedSongs = musicGrouper.groupSongsByGenre(allSongs);

        System.out.println("\nGrouped songs");
        for (Map.Entry<String, List<String>> entry : groupedSongs.entrySet()) {
            String genre = entry.getKey();
            List<String> songsInGenre = entry.getValue();
            System.out.println("Genre: " + genre);
            System.out.println("Songs: " + songsInGenre);
        }
    }
}

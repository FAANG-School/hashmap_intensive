package com.school.faang.hashmap.задача_4;

public class Solution {
    public static void main(String[] args) {
        String[] tokens = {"Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop"};
        GenreMapper genreMapper = new GenreMapper();
        for (String unparsedSong : tokens) {
            genreMapper.addSong(Song.getSong(unparsedSong));
        }
        for (var entry : genreMapper.getAllSongByGenres()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

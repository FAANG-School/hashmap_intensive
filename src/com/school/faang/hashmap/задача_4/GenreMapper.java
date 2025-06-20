package com.school.faang.hashmap.задача_4;

import java.util.*;

public class GenreMapper {

    private final Map<String, List<String>> mapper;

    public GenreMapper() {
        mapper = new HashMap<>();
    }

    public void addSong(Song song) {
        var list = mapper.getOrDefault(song.getGenre(), new ArrayList<>());
        list.add(song.getName());
        mapper.put(song.getGenre(), list);
    }

    public List<Map.Entry<String, List<String>>> getAllSongByGenres() {
        return new ArrayList<>(mapper.entrySet());
    }
}

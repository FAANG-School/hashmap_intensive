package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {

    private final Map<String, List<String>> songs = new HashMap<>();
    //Не использую containsKey() и прочий перебор, так как это долгие операции O(n)
    // тащу напрямую искомый ключ и смотрю есть ли там объект операция O(1)
    public Map<String, List<String>> getMap(List<String> songsList) {
        for(String song: songsList) {
            String[] massive = song.split(" - ",2);
            String name = massive[0];
            String genre = massive[1];
            List<String> newList = songs.get(genre);
            if (newList == null) {
                newList = new ArrayList<>();
                newList.add(name);
                songs.put(genre, newList);
            } else {
                newList.add(name);
                songs.put(genre, newList);
            }
        }
        return songs;
    }
}

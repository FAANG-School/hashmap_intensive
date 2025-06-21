package com.school.faang.hashmap.задача_4;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bohemian Rhapsody - Rock");
        list.add("Smells Like Teen Spirit - Rock");
        list.add("Shape of You - Pop");
        list.add("Blinding Lights - Pop");
        list.add("Lose Yourself - Hip-Hop");
        Map<String, List<String>> map = sorting(list);
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    public static Map<String, List<String>> sorting(List<String> list) {
        Map<String, List<String>> map = new HashMap<>();
        String ganr;
        String song;
        for (String s : list) {
            song = s.substring(0, s.indexOf("-")).trim();
            ganr = s.substring(s.indexOf("-") + 2).trim();
            if (map.containsKey(ganr)) {
                map.get(ganr).add(song);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(song);
                map.put(ganr, temp);
            }
        }

        return map;
    }
}

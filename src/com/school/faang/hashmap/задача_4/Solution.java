package com.school.faang.hashmap.задача_4;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<String> list = List.of("Bohemian Rhapsody - Rock",
                "Smells Like Teen Spirit - Rock",
                "Shape of You - Pop",
                "Blinding Lights - Pop",
                "Lose Yourself - Hip-Hop");

        Map<String, List<String>> map = separateByType(list);
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static  Map<String, List<String>> separateByType(List<String> list){
       Map<String, List<String>> map = new HashMap<>();

       for(String i:list){
           String[] parts = i.split(" - ");
           String value = parts[0].trim();
           String type = parts[1].trim();

           if(!map.containsKey(type)){
               map.put(type, new ArrayList<>());
               map.get(type).add(value);
           }else{
               map.get(type).add(value);
           }
       }
        return map;
     }
}

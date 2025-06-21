package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InputData{
    Map<String, List<String>> sounds=new HashMap<>();
    public Map<String, List<String>> spisok(List<String> listSounds){
        for (String list: listSounds) {
            String[] part = list.split(" - ",2);
            if(!sounds.containsKey(part[1])){
                List<String> category = new ArrayList<>();
                category.add(part[0]);
                sounds.put(part[1],category);
            }
            else{
                List<String> category = sounds.get(part[1]);
                category.add(part[0]);
            }
        }
        return sounds;
    }
    public  void print(){
        for (Map.Entry<String,List<String>> printMap: sounds.entrySet()) {
            String title = printMap.getKey();
            List<String> checkList = printMap.getValue();
            System.out.println("Жанр: "+ title+"\nСписок песен в данном жанре: "+checkList);
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        List<String> listSounds=new ArrayList<>(List.of("Bohemian Rhapsody - Rock", "Smells Like Teen Spirit - Rock", "Shape of You - Pop", "Blinding Lights - Pop", "Lose Yourself - Hip-Hop"));
        InputData inputData = new InputData();
        Map<String, List<String>> result = inputData.spisok(listSounds);
        System.out.println(result+"\n------------------------------------------------------------------------------------");
        inputData.print();
    }
}

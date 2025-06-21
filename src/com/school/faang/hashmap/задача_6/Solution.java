package com.school.faang.hashmap.задача_6;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List <Tweet> o = new ArrayList <> ();
        o.add(new Tweet("@anna", new ArrayList<> (Arrays.asList("#java","#programms"))));
        o.add(new Tweet("@ivan", new ArrayList<> (Arrays.asList("#java"))));
        o.add(new Tweet("@anna", new ArrayList<> (Arrays.asList("#java"))));
        o.add(new Tweet("@alex", new ArrayList<> (Arrays.asList("#programms"))));
        o.add(new Tweet("@alex", new ArrayList<> (Arrays.asList("#programms"))));
        String word = o.toString();
        word = word.replace(",", "");
        word = word.replace("[", "");
        word = word.replace("]", "");
        System.out.println(word);
        String text = findTopAuthors(o).toString();
        text = text.replace("," , "");
        text = text.replace("{", "");
        text = text.replace("}", "");
        text = text.replace("=", " ");
         System.out.println(text);
    }
    public static Map<String, String>  findTopAuthors(List<Tweet> tweets) {
       Map <String, Map<String , Integer>> statistika = new HashMap <> ();
       for (Tweet t : tweets) {

           for (String t1 : t.hashtags) {
               Integer sum = 1;
               for (Tweet t11 : tweets) {
                   for (String t12 : t11.hashtags) {
                       if (t != t11) {
                           if (t.author.equals(t11.author) && t1 == t12) {
                               sum++;

                           }
                       }
                   }
               }
               if (!statistika.containsKey(t1)) {
                   Integer sum1 = sum;
                   statistika
                           .computeIfAbsent(t1, k -> new HashMap<>())
                           .computeIfAbsent(t.author, k -> sum1);
               } else if (!statistika.get(t1).containsKey(t.author))   {
                   Integer sum1 = sum;
                   statistika
                           .computeIfAbsent(t1, k -> new HashMap<>())
                           .computeIfAbsent(t.author, k -> sum1);
               }
           }

       }
       Integer max = 0;
       Map <String,String> topAuthors = new HashMap<> ();
       for (Map.Entry<String, Map<String , Integer>> entry : statistika.entrySet()) {
           for (Map.Entry <String, Integer> entry1 : statistika.get(entry.getKey()).entrySet()) {
               if (entry1.getValue() > max) {
                   max = entry1.getValue();
               }
           }
           for (Map.Entry <String, Integer> entry2 : statistika.get(entry.getKey()).entrySet()) {
                        if (entry2.getValue() == max) {
                            topAuthors.put("по теме " + entry.getKey(), String.format("лидером будет " + entry2.getKey() + " (%s твита)", max) + "\n");
                        }
           }
       }
       return topAuthors;
    }
}

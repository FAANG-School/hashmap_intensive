package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;




public class Solution {
    Map<String,User> map = new HashMap<>();
    
    public void addUser(String string,User user){
        map.put(string, user);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addUser("@john_doe", new User(1L, "John Doe", "2024-01-15"));
        solution.addUser("@jane_smith", new User(2L, "Jane Smith", "2024-02-20"));
        solution.addUser("@bob_wilson", new User(3L, "Bob Wilson", "2024-03-10"));

        for (Map.Entry<String, User> entry : solution.map.entrySet()) {
            System.out.println("Пользователь " + entry.getKey() + ", полное имя: " + entry.getValue().fullName);
        }

    }
}

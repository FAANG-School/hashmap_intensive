package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.addUsers("first", new User(100, "Alfredo","02/22/2020"));
        solution.addUsers("second", new User(200, "Diego", "11/01/2003"));
        solution.addUsers("therst", new User(300, "Victoria", "30/03/2007"));

        for (Map.Entry<String,User> entry : users.entrySet()){
            String userId = entry.getKey();
            User user = entry.getValue();
            System.out.println("Пользователь " + userId + " полное имя: " + user.getFullName());
        }
    }
    private static Map<String,User> users = new HashMap<>();

    private void addUsers(String username, User user){
        if (!users.containsKey(username)){
            users.put(username, user);
        }
    }
}

class User {
    private long userId;
    private String fullName;
    private String registrationDate;

    public User (long userId, String fullName, String registrationDate){
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public String getFullName(){
        return fullName;
    }
}

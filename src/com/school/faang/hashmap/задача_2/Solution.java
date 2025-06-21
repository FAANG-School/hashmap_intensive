package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

class User {
    private long userId;
    private String fullName;
    private String registrationDate;

    public User(long userId, String fullName, String registrationDate) {
        this.userId = userId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
    }

    public long getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }
}

public class Solution {
    public static void main(String[] args) {
        HashMap<String, User> userDatabase = new HashMap<>();

        addUser(userDatabase, "@alice", new User(1L, "Alice Johnson", "2021-01-15"));
        addUser(userDatabase, "@bob", new User(2L, "Bob Smith", "2020-07-23"));
        addUser(userDatabase, "@charlie", new User(3L, "Charlie Brown", "2022-03-10"));
        addUser(userDatabase, "@diana", new User(4L, "Diana Prince", "2023-12-01"));


        for (Map.Entry<String, User> entry : userDatabase.entrySet()) {
            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println("Пользователь " + username + ", полное имя: " + user.getFullName());
        }
    }

    public static void addUser(HashMap<String, User> db, String username, User user) {
        db.put(username, user);
    }
}
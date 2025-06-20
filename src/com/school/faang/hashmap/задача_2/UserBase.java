package com.school.faang.hashmap.задача_2;


import java.util.*;

public class UserBase {

    private final Map<String, User> users;

    public UserBase() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(String.valueOf(user.getUserID()), user);
    }

    public User getUser(String username) {
        return users.getOrDefault(username, null);
    }

    public List<Map.Entry<String, User>> getAllUsers() {
        return new ArrayList<>(users.entrySet());
    }
}

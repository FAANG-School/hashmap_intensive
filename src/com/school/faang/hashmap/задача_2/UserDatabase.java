package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private Map<String, User> myDataBase = new HashMap<>();

    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("Где информация о пользователе?");
        }
        if (myDataBase.containsKey(user.getFullName())) {
            throw new IllegalArgumentException("Пользователь с именем '" +
                    user.getFullName() + "' уже есть в базе данных");
        } else {
            myDataBase.put(user.getFullName(), user);
        }
    }

    // "Пользователь @username, полное имя: Full Name"
    public void printAllUsersFormatted() {
        for (Map.Entry<String, User> entry : myDataBase.entrySet()) {
            String username = "@" + entry.getKey().toLowerCase().replace(" ", "_");
            System.out.println("Пользователь " + username + ", полное имя: " + entry.getKey());
        }
    }
}
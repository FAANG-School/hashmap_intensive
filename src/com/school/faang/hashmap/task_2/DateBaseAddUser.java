package com.school.faang.hashmap.task_2;

import java.util.HashMap;
import java.util.Map;

public class DateBaseAddUser {
    private final Map<String, User> users = new HashMap<>();

    public void add(String userName, User user) {
        users.put(userName, user);
    }

    public void showAllUsers() {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("User name: " + entry.getKey() + ", Full name: " + entry.getValue().getFullName());
        }
    }
}

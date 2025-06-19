package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final HashMap<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addUser("ivan123", new User(1L, "Иван Петров", "2024-01-10"));
        solution.addUser("olga_s", new User(2L, "Ольга Смирнова", "2024-03-15"));
        solution.addUser("maxK", new User(3L, "Максим Кузнецов", "2024-04-01"));
        solution.addUser("katya22", new User(4L, "Екатерина Орлова", "2024-05-05"));

        solution.printUsers();
    }

    public void addUser(String username, User user) {
        users.put(username, user);
    }

    public void printUsers() {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println(" Пользователь @" + username + ", полное имя: " + user);
        }
    }
}

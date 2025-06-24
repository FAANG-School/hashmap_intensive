package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.addUser("@Harry", new User(1, "Гарри Поттер", "31.07.2025"));
        solution.addUser("@Hermione", new User(2, "Гермиона Грейнджер", "19.09.2025"));
        solution.addUser("@Ron", new User(3, "Рон Уизли", "01.03.2025"));
        solution.addUser("@Ron", new User(4, "Рон Уизли", "01.03.2025"));

        for (Map.Entry<String, User> entry : users.entrySet()) {
            String userName = entry.getKey();
            String fullName = entry.getValue().getFullName();
            System.out.printf("Пользователь %s, полное имя: %s.%n", userName, fullName);
        }
    }

    public void addUser(String username, User user) {
        if (users.containsKey(username) && users.containsValue(user)) {
            System.out.println("Пользователь уже существует.");
        } else {
            users.put(username, user);
        }
    }
}

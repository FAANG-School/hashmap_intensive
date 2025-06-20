package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String, User> userDataBase = new HashMap<>();
        userDataBase.put("@Alex", new User(36456464, "Alex", "2025"));
        userDataBase.put("@Petter", new User(7832572, "Petter", "2023"));
        userDataBase.put("@Silvia", new User(545443525, "Silvia", "2020"));
        userDataBase.put("@Sergey", new User(67568568, "Sergey", "2024"));
        for (Map.Entry<String, User> entry : userDataBase.entrySet()) {
            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println("Никнейм:" + username +  " " + user.getFullName());

        }
    }

}

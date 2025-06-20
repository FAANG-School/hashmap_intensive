package com.school.faang.hashmap.задача_2;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static class User {
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

    private HashMap<String, User> usMap;

    public Solution() {
        usMap = new HashMap<>();
    }

    public void newUser(String username, User user) {
        usMap.put(username, user);
    }

    public void displayUsers() {
        for (Map.Entry<String, User> entry : usMap.entrySet()) {
            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println("Пользователь @" + username + ", полное имя: " + user.getFullName());
        }
    }

    public static void main(String[] args) {
        Solution userData = new Solution();

        userData.newUser("sigma_ultra_killer", new User(1,"Василий Пупкин", "2022-05-25"));
        userData.newUser("skibidi_toilet", new User(2,"Александр Коваленко", "2022-06-07"));
        userData.newUser("the_best_president", new User(3,"Илон Маск", "2023-03-14"));
        userData.newUser("heisenberg", new User(1,"Уолтер Хартвелл Уайт", "2023-12-30"));

        userData.displayUsers();
    }
}

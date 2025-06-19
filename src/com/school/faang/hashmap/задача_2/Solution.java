package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {
        User user1 = new User(1L, "John Doe One","2000-02-01");
        User user2 = new User(2L, "John Doe Two","2000-02-02");
        User user3 = new User(3L, "John Doe Three","2000-02-02");
        UserManager usersManager = new UserManager();
        usersManager.setUser("user1",user1);
        usersManager.setUser("user2",user2);
        usersManager.setUser("user3",user3);


        for (String userId : usersManager.getUserBd().keySet()) {
            System.out.printf("Пользователь %s, полное имя %s%n", userId, usersManager.getUserName(userId));
        }
    }
}

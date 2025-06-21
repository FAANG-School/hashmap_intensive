package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public static Map<String, User> users = new HashMap<>();

    public static void addUser(String username, User user) {
        users.put(username, user);
    }


    public static void main(String[] args) {

        User user1 = new User(1,"Dima", LocalDate.now().toString());
        User user2 = new User(2,"Pasha", LocalDate.now().toString());
        User user3 = new User(3,"Bob", LocalDate.now().toString());
        User user4 = new User(4,"Jack", LocalDate.now().toString());

        addUser("dima2222", user1);
        addUser("pasha333",user2 );
        addUser("bob1212", user3);
        addUser("jack1212", user4);


        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("Пользователь @" + entry.getKey() + ", полное имя " + entry.getValue().getFullName());
        }

    }
}




class User{
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

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                '}';
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }


}
package com.school.faang.hashmap.task_2;

import java.util.HashMap;
import java.util.Map;

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

    public String getFullName() {
        return fullName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}

class UsersStorage{
    private Map<String, User> map = new HashMap<>();

    public void addUser(String username, long userId, String fullName, String registrationDate){
        map.put(username, new User(userId,fullName, registrationDate));
    }
    public void printUsers(){
        for(Map.Entry<String,User> entry : map.entrySet()){
            User user;
            user = entry.getValue();
            System.out.println("Пользователь @" + entry.getKey() + ", полное имя: " + user.getFullName());

        }
    }
}
public class Solution {
    public static void main(String[] args) {
        UsersStorage us = new UsersStorage();
        us.addUser("Tim", 1, "Timmy", "10/05/2025" );
        us.addUser("Nik", 2, "Nikki", "10/05/2025" );
        us.addUser("Sofa", 3, "Sofia", "10/05/2025" );
        us.printUsers();
    }
}

package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //"Пользователь @username, полное имя: Full Name".

    private  static Map<String, User> usersTelegram = new HashMap();

    public static void addUser(String userName, User user){
        usersTelegram.put(userName, user);
    }

    public static void main(String[] args) {
        User user1 = new User(231321,"Ivan", "21/04/2014");
        User user2 = new User(981092,"Maria", "20/06/2017");
        User user3 = new User(23141,"Anna","02/12/2022");

        addUser("Ivan14", user1);
        addUser("Maria17", user2);
        addUser("Anna22", user3);

        for(Map.Entry<String, User> entry : usersTelegram.entrySet()){
            System.out.println("Пользователь @" + entry.getKey() + ", полное имя: " + entry.getValue().fullName);
        }

    }
}

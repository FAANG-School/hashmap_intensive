package com.school.faang.hashmap.задача_2;

import java.util.*;

public class Solution {
    Map<String, User> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addDB(User user){
        System.out.println("Please enter nickname: ");
        String nickname = scanner.next();
        if(!map.containsKey(nickname)){
            map.put(nickname, user);
            System.out.println("added");
        }else{
            System.out.println("This nickname is not available");
        }
    }

    public void view(){
        for (Map.Entry<String, User> entry : map.entrySet()) {

            String username = entry.getKey();

            User user = entry.getValue();

            System.out.println("Пользователь @" + username + ", полное имя: " + user.getFullName());
        }
    }

    public static void main(String[] args) {
        User bakosh = new User(158, "Bakdaulet Omirzak","24.01.2007");
        User alpa = new User(111, "Alpamyz Naukhan", "24.01.2007");
        User tikosh = new User(112, "Tileuzhan Sayranbek", "24.01.2007");

        Solution solution = new Solution();
        solution.addDB(bakosh);
        solution.addDB(alpa);
        solution.addDB(tikosh);
        solution.view();

    }
}
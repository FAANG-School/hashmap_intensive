package com.school.faang.hashset.задача_4;



public class Solution {

    public static void main(String[] args) {
ChannelManager users = new ChannelManager();
        users.addUser("id123", "админ")  ;
     users.addUser("id456", "модератор")  ;
     users.addUser("id789", "участник") ;
        users.addUser("id123", "админ")  ;
     System.out.println(users.hasUser("id123"));
        System.out.println(users.getRole("id123"));
        users.removeUser("id789");
        System.out.println(users.getRole("id789"));
    }
}

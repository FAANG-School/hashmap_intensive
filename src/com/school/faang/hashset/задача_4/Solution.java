package com.school.faang.hashset.задача_4;

public class Solution {
    public static void main(String[] args) {
        ChannnelManager channnelManager = new ChannnelManager();
        channnelManager.addUser(new User("id123", "ADMIN"));
        channnelManager.addUser(new User("id456", "MODERATOR"));
        channnelManager.addUser(new User("id789", "PARTICIPANT"));
        System.out.println(channnelManager.hasUser("id789"));
        System.out.println(channnelManager.getRole("id456"));
        channnelManager.removeUser("id789");
        System.out.println(channnelManager.hasUser("id789"));
    }
}

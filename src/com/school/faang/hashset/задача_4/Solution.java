package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        printInfo();
    }

    private static void printInfo() {
        HashMap<String, String> memberRoles = new HashMap<>();

        HashSet<String> members = new HashSet<>();

        ChannelManager manager = new ChannelManager(members, memberRoles);

        manager.addUser("1", "админ");
        manager.addUser("2", "модератор");
        manager.addUser("3", "участник");
        manager.addUser("4", "участник");
        manager.addUser("5", "модератор");
        manager.addUser("6", "участник");
        manager.addUser("7", "участник");

        System.out.println(manager.hasUser("3"));
        System.out.println(manager.hasUser("7"));
        System.out.println(manager.hasUser("9"));

        System.out.println(manager.getRole("1"));
        System.out.println(manager.getRole("9"));

        manager.removeUser("5");
        System.out.println(manager.hasUser("5"));
        System.out.println(manager.getRole("5"));
    }
}

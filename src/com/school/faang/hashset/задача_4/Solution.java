package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ChannelManager manager = new ChannelManager(new HashSet<>(), new HashMap<>());

        manager.addUser("id123", "админ");
        manager.addUser("id456", "модератор");
        manager.addUser("id789", "участник");

        System.out.println(manager.hasUser("id123"));
        System.out.println(manager.getRole("id456"));

        System.out.println(manager.getRole("id789"));
        manager.removeUser("id789");

        System.out.println(manager.hasUser("id789"));
        System.out.println(manager.getRole("id789"));
    }
}

class ChannelManager {
    private HashSet<String> members;
    private HashMap<String, String> memberRoles;

    public ChannelManager(HashSet<String> members, HashMap<String, String> memberRoles) {
        this.members = new HashSet<>();
        this.memberRoles = new HashMap<>();
    }

    void addUser(String userId, String role) {
        if (members.add(userId)){
            memberRoles.put(userId, role);
        }else {
            System.out.println("Такой пользователь уже существует");
        }
    }

    void removeUser(String userId) {
        if (members.remove(userId)){
            memberRoles.remove(userId);
        }
    }

    String getRole(String userId) {
        if (memberRoles.containsKey(userId)) {
            return memberRoles.get(userId);
        }else {
            return "Не является участником";
        }
    }

    boolean hasUser(String userId) {
        return members.contains(userId);
    }
}

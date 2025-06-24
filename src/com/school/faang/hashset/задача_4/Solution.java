package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ChannelManager {
    private Set<String> members = new HashSet<>();
    private Map<String, String> memberRoles = new HashMap<>();

    public ChannelManager(Set<String> members, Map<String, String> memberRoles) {
        this.members = members;
        this.memberRoles = memberRoles;
    }

    public void addUser(String userId, String role) {
        if (!members.contains(userId) || !memberRoles.containsKey(userId)) {
            members.add(userId);
            memberRoles.put(userId, role);
            System.out.println("Пользователь с id" + userId + " и ролью " + role + " добавлен");
        } else {
            System.out.println("Пользователь " + userId + " уже есть");
        }
    }

    public void removeUser(String userId) {
        if (!members.contains(userId) || !memberRoles.containsKey(userId)) {
            System.out.println("Такого пользователя нет");
        } else {
            members.remove(userId);
            memberRoles.remove(userId);
            System.out.println("Пользователь с id " + userId + " удален");
        }
    }

    public String getRole(String userId) {
        if (!memberRoles.containsKey(userId)) {
            return "Не является участником";
        } else {
            return memberRoles.get(userId);
        }
    }

    public boolean hasUser(String userId) {
        return members.contains(userId);
    }

}

public class Solution {
    public static void main(String[] args) {
        ChannelManager channelManager = new ChannelManager(new HashSet<>(), new HashMap<>());
        channelManager.addUser("id123", "админ");
        channelManager.addUser("id456", "модератор");
        channelManager.addUser("id789", "участник");
        System.out.println(channelManager.hasUser("id123"));
        System.out.println("Роль пользователя с id id456 = " + channelManager.getRole("id456"));
        channelManager.removeUser("id789");
        System.out.println(channelManager.hasUser("id789"));
        System.out.println("Роль пользователя с id id789 = " + channelManager.getRole("id789"));
    }
}

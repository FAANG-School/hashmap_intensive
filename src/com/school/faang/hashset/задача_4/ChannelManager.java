package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChannelManager {
    private final Set<String> members;
    private final Map<String, String> memberRoles;

    public ChannelManager() {
        this.members = new HashSet<>();
        this.memberRoles = new HashMap<>();
    }

    public void addUser(String userId, String role) {
        members.add(userId);
        memberRoles.put(userId, role);
        System.out.println("Добавление участника с id: " + userId + ", роль: " + role);
    }

    public void removeUser(String userId) {
        members.remove(userId);
        memberRoles.remove(userId);
        System.out.println("Удаление участника с id: " + userId);
    }

    public String getRole(String userId) {
        return memberRoles.getOrDefault(userId, "Не является участником");
    }

    public boolean hasUser(String userId) {
        return members.contains(userId);
    }
}
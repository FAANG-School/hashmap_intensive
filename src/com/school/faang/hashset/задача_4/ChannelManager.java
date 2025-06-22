package com.school.faang.hashset.задача_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ChannelManager {

    private HashSet<String> members = new HashSet<>();
    private HashMap<String, String> memberRoles = new HashMap<>();
    private static final Set<String> VALID_ROLES = Set.of(
            "админ",
            "модератор",
            "участник");

    public ChannelManager() {
        this.members = new HashSet<>();
        this.memberRoles = new HashMap<>();
    }

    public void addUser(String userId, String role) {
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID пользователя не может быть пустым");
        }

        if (role == null || !VALID_ROLES.contains(role)) {
            throw new IllegalArgumentException("Недопустимая роль: " + role +
                    ". Допустимые роли: " + VALID_ROLES);
        }

        if (members.contains(userId)) {
            throw new IllegalArgumentException("Пользователь " + userId + " уже существует в канале");
        }

        members.add(userId);
        memberRoles.put(userId, role);
    }

    public void removeUser(String userId) {
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID пользователя не может быть пустым");
        }

        if (!members.contains(userId)) {
            throw new IllegalArgumentException("Пользователь " + userId + " не найден в канале");
        }

        members.remove(userId);
        memberRoles.remove(userId);
    }

    public String getRole(String userId) {

        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID пользователя не может быть пустым");
        }

        return memberRoles.getOrDefault(userId, "Не является участником");
    }

    public boolean hasUser(String userId) {

        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("ID пользователя не может быть пустым");
        }

        return members.contains(userId);
    }
}

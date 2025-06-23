package com.school.faang.hashset.задача_2;

import java.util.HashSet;
import java.util.Set;

public class UserBlacklist {
    private final Set<String> blockedUsers = new HashSet<>();

    public void blockUser(String username) {
        System.out.println("Добавление пользователя " + username
                + ": " + blockedUsers.add(username));
    }

    public void unblockUser(String username) {
        System.out.println("Удаление пользователя " + username
                + ": " + blockedUsers.remove(username));
    }

    public boolean isUserBlocked(String username) {
        return blockedUsers.contains(username);
    }
}

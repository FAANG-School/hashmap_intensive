package com.school.faang.hashset.задача_2;

import java.util.HashSet;
import java.util.Set;

public class UserBlacklist {

    private final Set<String> blockedUsers = new HashSet<>();

    public void blockUser(String username) {
        blockedUsers.add(username);
        System.out.println("Пользователь " + username + " заблокирован.");
    }

    public void unblockUser(String username) {
        blockedUsers.remove(username);
        System.out.println("Пользователь " + username + " разблокирован.");
    }

    public boolean isUserBlocked(String username) {
        return blockedUsers.contains(username);
    }
}

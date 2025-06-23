package com.school.faang.hashset.задача_2;

import java.util.HashSet;
import java.util.Set;

public class UserBlackList {
    private Set<String> blockedUsers = new HashSet<>();

    public void blockUser(String username) {
        blockedUsers.add(username);
    }

    public void unblockUser(String username) {
        blockedUsers.remove(username);
    }

    public boolean isBlocked(String username) {
        return blockedUsers.contains(username);
    }

    public void printBlockedUsers(){
        blockedUsers.stream().forEach(value -> System.out.print(value + " "));
    }
}

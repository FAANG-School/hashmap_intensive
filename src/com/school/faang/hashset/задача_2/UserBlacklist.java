package com.school.faang.hashset.задача_2;

import java.util.HashSet;

public class UserBlacklist {

    private HashSet<String> blockedUsers = new HashSet<>();


    public HashSet<String> getBlockedUsers() {
        return blockedUsers;
    }

    public void blockUser(String userName) {
        if (blockedUsers.add(userName)) {
            System.out.println("Пользователь " + userName + " успешно заблокирован.");
        } else {
            System.out.println("Пользователь " + userName + " уже находится в черном списке.");
        }
    }

    public void unblockUser(String userName) {
        if (blockedUsers.remove(userName)) {
            System.out.println("Пользователь " + userName + " успешно разблокирован.");
        } else {
            System.out.println("Пользователь " + userName + " не найден в черном списке.");
        }
    }

    public boolean isUserBlocked(String userName) {
        return blockedUsers.contains(userName);
    }


}

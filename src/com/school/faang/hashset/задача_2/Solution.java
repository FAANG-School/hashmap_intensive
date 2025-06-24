package com.school.faang.hashset.задача_2;

import java.util.HashSet;

class UserBlacklist {
    private HashSet<String> blockedUser = new HashSet<>();

    public void blockUser(String username) {
        if (!blockedUser.contains(username)) {
            blockedUser.add(username);
            System.out.println("Пользователь " + username + " добавлен в чёрный список");
        } else {
            System.out.println("Данный пользователь " + username + " уже есть в чёрном списке");
        }
    }

    public void unblockUser(String username) {
        if (!blockedUser.contains(username)) {
            System.out.println("Пользователя нет в чёрном списке");
        } else {
            blockedUser.remove(username);
            System.out.println("Пользователь " + username + " разблокирован");
        }
    }

    public boolean isUserBlocked(String username) {
        if (blockedUser.contains(username)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        UserBlacklist userBlacklist = new UserBlacklist();
        userBlacklist.blockUser("Masha23231");
        userBlacklist.blockUser("Michaasfd");
        userBlacklist.blockUser("MisterKrytoi23");

        userBlacklist.blockUser("Michaasfd");

        userBlacklist.unblockUser("MisterKrytoi23");
        System.out.println(userBlacklist.isUserBlocked("MisterKrytoi23"));
        System.out.println(userBlacklist.isUserBlocked("Masha23231"));
        userBlacklist.blockUser(null);
        System.out.println(userBlacklist.isUserBlocked(null));
        userBlacklist.unblockUser(null);
        System.out.println(userBlacklist.isUserBlocked(null));
    }
}

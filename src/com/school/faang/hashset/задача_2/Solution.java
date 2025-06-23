package com.school.faang.hashset.задача_2;

import java.util.HashSet;
import java.util.List;

public class Solution {
    static class UserBlacklist {
        private HashSet<String> blockedUsers;

        public UserBlacklist() {
            this.blockedUsers = new HashSet<>();
        }

        public void blockUser(String username) {
            blockedUsers.add(username);
        }

        public void unblockUser(String username) {
            blockedUsers.remove(username);
        }

        public boolean isUserBlocked(String username) {
            return blockedUsers.contains(username);
        }

        public HashSet<String> getBlockedUsers() {
            return blockedUsers;
        }
    }

    public static void main(String[] args) {
        UserBlacklist telegramBlacklist = new UserBlacklist();
        for (String user : List.of("gelliwar", "hashset", "sobaka", "kot")) {
            telegramBlacklist.blockUser(user);
        }
        // Блокирование нескольких пользователей

        telegramBlacklist.blockUser("sobaka");
        // Попытка заблокировать одного из них повторно

        telegramBlacklist.unblockUser("hashset");
        System.out.println(telegramBlacklist.isUserBlocked("hashset"));
        // Пользователь hashset теперь разблокирован и больше не в списке

        telegramBlacklist.blockUser(null);
        telegramBlacklist.unblockUser(null);
        // Попытка добавить null в блэк-лист

        for (String user : List.of("gelliwar", "hashset", "sobaka", "kot")) {
            System.out.println(telegramBlacklist.isUserBlocked(user));
        }
        // Проверка, заблокированы ли пользователи нашего блэк-листа

        System.out.println(telegramBlacklist.isUserBlocked("homyak"));
        // Проверка, заблокирован ли пользователь, не входящий в блэк-лист
    }
}

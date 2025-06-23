package com.school.faang.hashset.задача_2;

import java.util.HashSet;

public class UserBlacklist {

    private HashSet<String> blacklist = new HashSet<>();

    void blockUser(String username) {
        // Добавляет пользователя в ЧС
        blacklist.add(username);
    }

    void unblockUser(String username) {
        // Удаляет пользователя из ЧС
        blacklist.remove(username);
    }

    boolean isUserBlocked(String username) {
        // Проверяет заблокирован ли пользователь
        return blacklist.contains(username);
    }


    @Override
    public String toString() {
        return "UserBlacklist{" +
                "blacklist=" + blacklist +
                '}';
    }
}

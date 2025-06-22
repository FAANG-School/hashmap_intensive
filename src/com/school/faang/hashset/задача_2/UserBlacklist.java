package com.school.faang.hashset.задача_2;

import java.util.HashSet;
import java.util.Set;

public class UserBlacklist {
    private Set<String> blockedUsers;

    public UserBlacklist() {
        blockedUsers = new HashSet<>();
    }

    void blockUser(String userName) {
        if(blockedUsers.contains(userName)) {
            System.out.println("Пользователь "+userName+ " уже заблокирован");
        }else {
            blockedUsers.add(userName);
            System.out.println("Пользователь " + userName + " добавлен в черный список");
        }
    }
    void unblockUser(String userName) {
        blockedUsers.remove(userName);
        System.out.println("Пользователь "+userName+" удален из черного списка");
    }
    void printStatusUser(String userName) {
        if(blockedUsers.contains(userName)){
            System.out.println("Пользователь "+userName+ " находится в черном списке");
        } else {
            System.out.println("Пользователя "+userName+ " нет в черном списке");
        }
    }
    void printUserCount() {
        System.out.println(blockedUsers.size());
    }

}

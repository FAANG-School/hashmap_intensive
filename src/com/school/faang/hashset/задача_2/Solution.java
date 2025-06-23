package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {

        UserBlacklist userBlacklist = new UserBlacklist();

        System.out.println("Пользователи добавленные в ЧС:");
        userBlacklist.blockUser("user1");
        userBlacklist.blockUser("user2");
        userBlacklist.blockUser("user3");
        userBlacklist.blockUser("superUser");
        System.out.println(userBlacklist + "\n");

        System.out.println("Повторное добавление в ЧС superUser:");
        userBlacklist.blockUser("superUser");
        System.out.println(userBlacklist + "\n");

        System.out.println("Удаление из ЧС superUser:");
        userBlacklist.unblockUser("superUser");
        System.out.println(userBlacklist + "\n");

        System.out.println("Добавление null в ЧС:");
        userBlacklist.blockUser("null");
        System.out.println(userBlacklist + "\n");

        System.out.println("Удаление null из ЧС:");
        userBlacklist.unblockUser("null");
        System.out.println(userBlacklist + "\n");

    }
}
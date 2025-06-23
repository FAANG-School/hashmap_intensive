package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist userBlacklist = new UserBlacklist();
        userBlacklist.blockUser("test1");
        userBlacklist.blockUser("test1");
        userBlacklist.blockUser("test2");
        userBlacklist.blockUser("test3");
        userBlacklist.blockUser(null);
        userBlacklist.blockUser(null);

        System.out.println();

        userBlacklist.unblockUser("test2");
        userBlacklist.unblockUser(null);
        userBlacklist.unblockUser(null);

        System.out.println();

        System.out.println("Статус блокировки пользователя null: "
                + userBlacklist.isUserBlocked(null));

        System.out.println("Статус блокировки пользователя test2: "
                + userBlacklist.isUserBlocked("test2"));


    }
}

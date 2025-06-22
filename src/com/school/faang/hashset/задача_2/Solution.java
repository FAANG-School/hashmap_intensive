package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist blacklist = new UserBlacklist();

        blacklist.blockUser("Иван Мишин");
        blacklist.blockUser("Кракен");
        blacklist.blockUser("Агент_007");

        blacklist.blockUser("Иван Мишин");

        blacklist.unblockUser("Кракен");
        System.out.println("Пользователь Кракен заблокирован: " +
                blacklist.isUserBlocked("Кракен"));

        blacklist.blockUser(null);
        System.out.println("null в черном списке: " + blacklist.isUserBlocked(null));
        blacklist.unblockUser(null);
        System.out.println("null в черном списке после разблокировки: " +
                blacklist.isUserBlocked(null));
    }
}

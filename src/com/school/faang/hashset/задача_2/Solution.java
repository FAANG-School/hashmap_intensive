package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist blacklist = new UserBlacklist();

        try {
            blacklist.blockUser("Иван");
            blacklist.blockUser("Кракен");
            blacklist.blockUser("Агент_007");
            blacklist.blockUser("Иван"); // Это вызовет исключение
            blacklist.unblockUser("Кракен");
            System.out.println("Пользователь Кракен заблокирован: " +
                    blacklist.isUserBlocked("Кракен"));
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Ошибка операции: " + e.getMessage());

            System.out.println("Проверяем текущее состояние:");
            System.out.println("Иван заблокирован: " + blacklist.isUserBlocked("Иван"));
            System.out.println("Кракен заблокирован: " + blacklist.isUserBlocked("Кракен"));
        }
    }
}

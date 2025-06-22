package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist blacklist = new UserBlacklist();
        //Добавляю пользователей в черный список
        blacklist.blockUser("Виталий");
        blacklist.blockUser("Сергей");
        //Добавляю повторно
        blacklist.blockUser("Виталий");
        //Удаляю из списка одного
        blacklist.unblockUser("Виталий");
        //Проверяю есть ли пользователь в списке
        blacklist.printStatusUser("Виталий");
        //Вывожу общее кол-во пользователей в списке
        blacklist.printUserCount();



    }
}

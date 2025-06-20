package com.school.faang.hashmap.задача_2;

public class Solution {
    public static void main(String[] args) {
        TelegramStorage telegramStorage = new TelegramStorage();

        telegramStorage.addUser("yankovich", "Максим Янкович");
        telegramStorage.addUser("fishka", "Дмитрий Фишков");
        telegramStorage.addUser("fishka", "Харитон Фишков");
        telegramStorage.addUser("vorker", "Евгений Ворковский");


        telegramStorage.getUsers();
    }
}

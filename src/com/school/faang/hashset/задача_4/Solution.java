package com.school.faang.hashset.задача_4;

import java.util.HashSet;
import java.util.HashMap;

public class Solution {
    static class ChannelManager {
        private HashSet<String> members; // Список участников канала
        private HashMap<String, String> memberRoles; // Роли участников канала

        public ChannelManager(HashSet<String> members, HashMap<String, String> memberRoles) {
            this.members = new HashSet<>();
            this.memberRoles = new HashMap<>();
        }
        // Конструктор, инициализация коллекций

        void addUser(String userId, String role) {
            members.add(userId);
            memberRoles.put(userId,role);
        }
        // Функция, добавляющая пользователя в коллекции

        void removeUser(String userId) {
            members.remove(userId);
            memberRoles.remove(userId);
        }
        // Функция, удаляющая пользователя из коллекций

        String getRole(String userId) {
            return memberRoles.getOrDefault(userId, "Не является участником");
        }
        // Узнаем роль пользователя по ID

        boolean hasUser(String userId) {
            return members.contains(userId);
        }
        // Проверяем наличие пользователя в канале
    }
    public static void main(String[] args) {
        ChannelManager firstChannelManager = new ChannelManager(new HashSet<>(),  new HashMap<>());
        // Создаем экземпляр класса ChannelManager

        firstChannelManager.addUser("id123", "админ");
        firstChannelManager.addUser("id456", "модератор");
        firstChannelManager.addUser("id789", "участник");
        // Добавляем в экземпляр участников

        System.out.println(firstChannelManager.hasUser("id456"));
        // Проверяем, есть ли в канале пользователь с id "id456"

        System.out.println(firstChannelManager.getRole("id123"));
        // Узнаем роль участника id123

        firstChannelManager.removeUser("id789");
        System.out.println(firstChannelManager.hasUser("id789"));
        System.out.println(firstChannelManager.getRole("id789"));
        // Удаляем участника и проверяем, что он больше не находится в коллекциях
    }
}

/* Ожидаемый вывод программы:
true
админ
false
Не является участником
 */
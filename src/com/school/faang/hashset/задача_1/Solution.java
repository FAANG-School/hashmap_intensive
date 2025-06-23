package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        // Создаём экземпляр системы регистрации
        EventRegistration conference = new EventRegistration();

        // Регистрируем несколько участников
        conference.register("anna@example.com");
        conference.register("ivan@example.com");
        conference.register("bob@example.com");
        conference.register("anna@example.com"); // Повторная регистрация
        conference.register(""); // Некорректный email
        conference.register(null); // Null email

        // Выводим общее количество участников
        System.out.println("Общее количество зарегистрированных участников: " + conference.getParticipantCount());

        // Проверяем статус регистрации
        System.out.println("Статус регистрации anna@example.com: " +
                (conference.isRegistered("anna@example.com") ? "Зарегистрирован" : "Не зарегистрирован"));
        System.out.println("Статус регистрации alice@example.com: " +
                (conference.isRegistered("alice@example.com") ? "Зарегистрирован" : "Не зарегистрирован"));

    }
}

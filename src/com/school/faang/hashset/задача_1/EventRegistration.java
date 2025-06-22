package com.school.faang.hashset.задача_1;

import java.util.HashSet;
import java.util.Set;

public class EventRegistration {
    // Приватное поле для хранения уникальных email участников
    private final Set<String> registeredEmails;

    // Конструктор, инициализирующий HashSet
    public EventRegistration() {
        this.registeredEmails = new HashSet<>();
    }

    // Метод для регистрации участника по email
    public void register(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Ошибка: email не может быть пустым или null.");
            return;
        }
        // Проверяем, добавлен ли email в HashSet
        if (registeredEmails.add(email)) {
            System.out.println("Регистрация для " + email + " прошла успешно!");
        } else {
            System.out.println("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
        }
    }

    // Метод для получения количества зарегистрированных участников
    public int getParticipantCount() {
        return registeredEmails.size();
    }

    // Метод для проверки, зарегистрирован ли email
    public boolean isRegistered(String email) {
        return email != null && registeredEmails.contains(email);
    }
}

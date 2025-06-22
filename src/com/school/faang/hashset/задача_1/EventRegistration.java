package com.school.faang.hashset.задача_1;

import java.util.HashSet;
import java.util.Set;

public class EventRegistration {
    private Set<String> emails = new HashSet<>();

    public void register(String email) {
        if (emails.add(email)) {
            System.out.println("Регистрация для " + email + " прошла успешно!");
        } else {
            throw new IllegalArgumentException("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
        }
    }

    public int getParticipantCount() {
        return emails.size();
    }

    public boolean isRegistered(String email) {
        return email.contains(email);
    }
}
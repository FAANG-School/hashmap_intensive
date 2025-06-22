package com.school.faang.hashset.задача_1;

import java.util.HashSet;
import java.util.Set;

public class EventRegistration {
    private final Set<String> registeredEmails;

    public EventRegistration() {
        registeredEmails = new HashSet<>();
    }

    public void register(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email не должен быть пустым");
        }
        try {
            if (registeredEmails.contains(email)) {
                throw new DuplicateDataException("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
            }
            registeredEmails.add(email);
            System.out.println("Регистрация для " + email + " прошла успешно!");
        } catch (DuplicateDataException e) {
            System.err.println(e.getMessage());
        }
    }
    public int getParticipantCount() {
        return registeredEmails.size();
    }
    public void printStatusEmail(String email) {

        String status = registeredEmails.contains(email) ? "email "+email+" есть в базе" : "email "+email+ " нет в базе";

        System.out.println(status);
    }
}

package com.school.faang.hashset.задача_1;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class EventRegistration {

    private Set<String> registeredEmails = new HashSet<>();
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    public void register(String email) {
        validate(email);
        registeredEmails.add(email);
        System.out.println("Регистрация для " + email + " прошла успешно!");
    }

    public int getParticipantCount() {
        return registeredEmails.size();
    }

    public boolean isRegistered(String email) {
        return registeredEmails.contains(email);
    }

    private void validate(String email) {

        if (email == null) {
            throw new IllegalArgumentException("Email не может быть null");
        }

        if (email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email не может быть пустым");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Неверный формат email: " + email);
        }

        if (registeredEmails.contains(email)) {
            throw new IllegalStateException("Пользователь с email " + email + " уже зарегистрирован");
        }
    }

    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}

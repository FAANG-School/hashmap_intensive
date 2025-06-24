package com.school.faang.hashset.задача_1;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();

        registration.register("@qwerty");
        registration.register("@qwerty");
        registration.register("@solo");
        registration.register("@team");

        System.out.println(registration.getParticipantCount());
        System.out.println(registration.isRegistered("@qwerty"));
    }
}

class EventRegistration {
    private HashSet<String> registeredEmails = new HashSet<>();

    public void register(String email) {
        if (registeredEmails.add(email)) {
            System.out.println("Регистрация для " + email + " прошла успешно!");
        }else {
            System.out.println("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
        }
    }

    public int getParticipantCount() {
        return registeredEmails.size();
    }

    public boolean isRegistered(String email) {
        if (registeredEmails.contains(email)) {
            return true;
        }else {
            return false;
        }
    }
}
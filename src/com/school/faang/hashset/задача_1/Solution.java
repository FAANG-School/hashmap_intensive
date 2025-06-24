package com.school.faang.hashset.задача_1;

import java.util.HashSet;

class EventRegistration {
    private HashSet<String> registeredEmails = new HashSet<>();

    public void register(String email) {
        if (!registeredEmails.contains(email)) {
            registeredEmails.add(email);
            System.out.println("Регистрация для " + email + " прошла успешно!");
        } else {
            System.out.println("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
        }
    }

    public void getParticipantCount() {
        System.out.println("Всего зарегистрировано участников: "+ registeredEmails.size());
    }

    public boolean isRegistered(String email) {
        if (registeredEmails.contains(email)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        EventRegistration eventRegistration = new EventRegistration();
        eventRegistration.register("Petya231@mail.ru");
        eventRegistration.register("masHa123@mail.ru");
        eventRegistration.register("VerONIka@mail.ru");

        eventRegistration.register("masHa123@mail.ru");

        eventRegistration.getParticipantCount();
        System.out.println(eventRegistration.isRegistered("VerONIka@mail.ru"));
        System.out.println(eventRegistration.isRegistered("Natahsha@mail.ru"));
    }
}

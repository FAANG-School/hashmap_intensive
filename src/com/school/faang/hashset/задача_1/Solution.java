package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();

        registration.register("alice@example.com");
        registration.register("bob@example.com");
        registration.register("charlie@example.com");

        registration.register("bob@example.com");

        System.out.println("Итоговое количество участников: " + registration.getParticipantCount());

        String emailToCheck = "alice@example.com";
        System.out.println("Пользователь " + emailToCheck + " зарегистрирован: " +
                registration.isRegistered(emailToCheck));
    }
}

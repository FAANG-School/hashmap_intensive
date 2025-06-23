package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {

        EventRegistration eventRegistration = new EventRegistration();

        eventRegistration.register("user1@mail.ru");
        eventRegistration.register("user2@yandex.ru");
        eventRegistration.register("user3@google.com");

        System.out.println();

        eventRegistration.register("user2@yandex.ru");

        System.out.println("\nКоличество зврегистрированных людей: " + eventRegistration.getParticipantCount());

        String testEmail = "user2@mail.ru";
        System.out.println("\n" + testEmail + " зарегистрирован? " + eventRegistration.isRegistered(testEmail));

        String testEmail1 = "user2@yandex.ru";
        System.out.println("\n" + testEmail1 + " зарегистрирован? " + eventRegistration.isRegistered(testEmail1));

    }
}
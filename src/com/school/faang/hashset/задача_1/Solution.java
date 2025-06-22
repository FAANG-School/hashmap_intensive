package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistration eventRegistration = new EventRegistration();

        eventRegistration.register("cramblCookieZahar@gmail.com");
        eventRegistration.register("crorodiloBombordiro@mail.ru");
        eventRegistration.register("hashset@gmail.com");

        eventRegistration.register("crorodiloBombordiro@mail.ru");

        System.out.println("Зарегистрировано " + eventRegistration.getParticipantCount() + " участника(ов).");

        System.out.println(eventRegistration.isRegistered("hashset@gmail.com"));
    }
}
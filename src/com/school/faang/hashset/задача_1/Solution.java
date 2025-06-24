package com.school.faang.hashset.задача_1;

public class Solution {
    public static void main(String[] args) {
        EventRegistrationManager eventRegistrationManager = new EventRegistrationManager();
        eventRegistrationManager.addRegistration("1223@gmail.com");
        eventRegistrationManager.addRegistration("wow@yandex.ru");
        System.out.println(eventRegistrationManager.isRegistered("1223@gmail.com"));
//        eventRegistrationManager.addRegistration("wow@yandex.ru");
    }
}

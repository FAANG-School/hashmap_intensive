package com.school.faang.hashset.задача_1;

import java.util.HashSet;

public class Solution {
    static class EventRegistration {
        static public HashSet<String> registeredEmails = new HashSet<>(); // HashSet публичный, так как мы будем с ним много работать
    }

    public void register(String email) {
        boolean email_is_registered = EventRegistration.registeredEmails.contains(email);

        EventRegistration.registeredEmails.add(email);

        if (!email_is_registered) {
            System.out.println("Регистрация для " + email + " прошла успешно!");
        } else {
            System.out.println("Ошибка: пользователь с email " + email + " уже зарегистрирован.");
        }
    }

    public int getParticipantCount() {
        return EventRegistration.registeredEmails.size();
    }

    public boolean isRegistered(String email) {
        return EventRegistration.registeredEmails.contains(email);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.register("tony_stark_the_ironman@gmail.com");
        solution.register("walter_white@gmail.com");
        solution.register("barack_obama@gmail.com");
        solution.register("vlad_mishustin@gmail.com");
        solution.register("elon_musk@gmail.com");
        solution.register("elon_musk@gmail.com");
        System.out.println(solution.getParticipantCount());
        System.out.println(solution.isRegistered("walter_white@gmail.com"));
        System.out.println(solution.isRegistered("isaac_newton@gmail.com"));
    }
}

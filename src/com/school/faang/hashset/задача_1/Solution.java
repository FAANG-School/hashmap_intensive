package com.school.faang.hashset.задача_1;


public class Solution {
    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();

        registration.register("test@gmail.com");
        registration.register("test@gmail.com");
        registration.register("volodymyr@gmail.com");
        registration.register("quikkkk@gmail.com");

        System.out.println(registration.getParticipantCount());
        System.out.println(registration.isRegistered("volodymyr@gmail.com"));
    }

    private static class EventRegistration {
        private final Set<String> registeredEmails = new HashSet<>();

        public void register(String email) {
            if (registeredEmails.contains(email)) {
                System.out.println("Ошибка: пользователь с email '" + email + "' уже зарегистрирован.");
                return;
            }

            registeredEmails.add(email);
            System.out.println("Регистрация для '" + email + "' прошла успешно!");
        }

        public int getParticipantCount() {
            return registeredEmails.size();
        }

        public String isRegistered(String email) {
            return registeredEmails.contains(email) ? email + ", зарегистрирован в системе" : "Не существует";
        }

        public Set<String> getRegisteredEmails() {
            return Collections.unmodifiableSet(registeredEmails);
        }

        @Override
        public String toString() {
            return "EventRegistration{" +
                    "registeredEmails=" + registeredEmails +
                    '}';
        }
    }
}

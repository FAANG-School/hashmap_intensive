package com.school.faang.hashset.задача_1;
import java.util.HashSet;
public class EventRegistration {
    private HashSet<String> registeredEmails = new HashSet<>();
    public void register(String email) {

        if (!registeredEmails.contains(email))  {
            registeredEmails.add(email);
            System.out.println(String.format("Регистрация для <%s> прошла успешно!", email));

        } else {
            System.out.println(String.format("Ошибка: пользователь с email <%s> уже зарегистрирован.", email));
        }
    }
    public int getParticipantCount() {
        return registeredEmails.size();
    }
    public boolean isRegistered(String email) {
        if (registeredEmails.contains(email))  {
            return true;

        } else {

            return  false;

        }
    }
}

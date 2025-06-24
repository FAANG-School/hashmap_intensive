package com.school.faang.hashset.задача_1;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class EventRegistrationManager {

    private final Set<String> registeredEmails;

    public EventRegistrationManager() {
        registeredEmails = new HashSet<>();
    }

    public void addRegistration(String email) {
        if (registeredEmails.contains(email)) {
            throw new IllegalArgumentException("The email " + email + " is already registered");
        }
        registeredEmails.add(email);
    }

    public int getParticipantCount() {
        return registeredEmails.size();
    }

    public List<String> getAllRegisteredEmails() {
        return new ArrayList<>(registeredEmails);
    }

    public boolean isRegistered(String email) {
        return registeredEmails.contains(email);
    }
}

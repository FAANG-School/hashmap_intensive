package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class MutualContactsFinder {
    public Set<String> findMutualContacts(Set<String> contacts1, Set<String> contacts2) {
        Set<String> mutuals = new HashSet<>(contacts1);
        mutuals.retainAll(contacts2);
        return mutuals;
    }
}

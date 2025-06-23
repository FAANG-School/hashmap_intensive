package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class MutualContactsFinder {
    public static Set<String> findMutualContacts(HashSet<String> contacts1, HashSet<String> contacts2) {
        Set<String> mutualContacts = (HashSet<String>) contacts1.clone();
        mutualContacts.retainAll(contacts2);
        return mutualContacts;
    }
}

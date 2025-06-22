package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class MutualContactsFinder {

    Set<Contact> findMutualContacts(Set<Contact> contactsUser1, Set<Contact> contactsUser2) {

        Set<Contact> mutualSet = new HashSet<>(contactsUser1);
        mutualSet.retainAll(contactsUser2);
        return mutualSet;
    }
}

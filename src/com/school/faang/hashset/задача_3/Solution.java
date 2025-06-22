package com.school.faang.hashset.задача_3;

import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Contact> contactsUser1 = Set.of(new Contact("Anna","111"), new Contact("Bill","222"));
        Set<Contact> contactsUser2 = Set.of(new Contact("Anna","111"), new Contact("Mark","333"));

        MutualContactsFinder mutual = new MutualContactsFinder();

        Set<Contact> mutualContactsSet = mutual.findMutualContacts(contactsUser1, contactsUser2);

        System.out.println(mutualContactsSet.size());
        System.out.println(mutualContactsSet);

    }
}

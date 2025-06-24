package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;

public class ContactList {

    private final Set<String> contacts;

    public ContactList() {
        contacts = new HashSet<>();
    }

    public ContactList(Set<String> contacts) {
        this.contacts = new HashSet<>(contacts);
    }

    public void addContact(String contact) {
        contacts.add(contact);
    }

    public void removeContact(String contact) {
        contacts.remove(contact);
    }

    public boolean hasContact(String contact) {
        return contacts.contains(contact);
    }

    public static Set<String> findMutualContacts(ContactList contactList1, ContactList contactList2) {
        Set<String> result = new HashSet<>(contactList1.contacts);
        result.retainAll(contactList2.contacts);
        return result;
    }
}

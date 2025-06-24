package com.school.faang.hashset.задача_3;

import java.util.Set;

public class User {

    private final String username;

    private final ContactList contactList;

    public User(String username) {
        this.username = username;
        contactList = new ContactList();
    }

    public User(String username, Set<String> contacts) {
        this.contactList = new ContactList(contacts);
        this.username = username;
    }

    public void addContact(String username) {
        contactList.addContact(username);
    }

    public void addContact(User user) {
        addContact(user.toString());
    }

    public void removeContact(String username) {
        contactList.removeContact(username);
    }

    public void removeContact(User user) {
        removeContact(user.toString());
    }

    public boolean hasContact(String username) {
        return contactList.hasContact(username);
    }

    public boolean hasContact(User user) {
        return hasContact(user.toString());
    }

    public static Set<String> findMutualContacts(User user1, User user2) {
        return ContactList.findMutualContacts(user1.contactList, user2.contactList);
    }

    @Override
    public String toString() {
        return username;
    }
}

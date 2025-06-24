package com.school.faang.hashset.задача_3;

import java.util.Collections;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        User firstUser = new User("first");
        User secondUser = new User("second");
        User thirdUser = new User("third");
        firstUser.addContact(secondUser);
        thirdUser.addContact(secondUser);
        thirdUser.addContact(firstUser);
        firstUser.addContact(thirdUser);
        Set<String> mutualContactsForFirstAndThird = User.findMutualContacts(firstUser, thirdUser);
        System.out.println(mutualContactsForFirstAndThird.size());
        mutualContactsForFirstAndThird.forEach(System.out::println);
    }
}

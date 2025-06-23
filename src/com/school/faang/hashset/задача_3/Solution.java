package com.school.faang.hashset.задача_3;

import java.util.HashSet;
import java.util.Set;
public class Solution {
    public static void main(String[] args) {
HashSet <String> usersFirst = new HashSet <>();
        usersFirst.add("Aleksandr");
        usersFirst.add("Vlad");
        usersFirst.add("Vlad");
        usersFirst.add("Grigoriy");
        usersFirst.add("Sergey");
        usersFirst.add("Egor");
        usersFirst.add("Aleksandr");
        HashSet <String> usersSecond = new HashSet <>();
        usersSecond.add("Aleksandr");
        usersSecond.add("Aleksandr");
        usersSecond.add("Vlad");

        System.out.println(MutualContactsFinder.findMutualContacts(usersFirst, usersSecond));
        System.out.println(MutualContactsFinder.getQuantity());
    }
}

package com.school.faang.hashset.задача_3;

import java.util.HashSet;
public class MutualContactsFinder {
private static HashSet<String> generalUsers  = new HashSet <> () ;
    public static HashSet<String> findMutualContacts(HashSet<String>  contacts1, HashSet<String>  contacts2) {

        MutualContactsFinder.generalUsers = contacts1;
        MutualContactsFinder.generalUsers.retainAll(contacts2);
return MutualContactsFinder.generalUsers;
    }
    public static int getQuantity() {
        return generalUsers.size();
    }

}

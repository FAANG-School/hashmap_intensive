package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist users = new UserBlacklist () ;
        users.blockUser("Vlad_Mishustin");
        users.blockUser("Aleksandr_Chilikin");
        users.blockUser("Vlad_Mishustin");
        users.blockUser(null);
        System.out.println("Статус: " + users.isUserBlocked(null)) ;
        users.unblockUser(null);
        System.out.println("Статус: " + users.isUserBlocked(null)) ;
        users.unblockUser("Vlad_Mishustin");
       System.out.println("Статус: " + users.isUserBlocked("Vlad_Mishustin")) ;
    }
}

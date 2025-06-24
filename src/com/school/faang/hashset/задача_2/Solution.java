package com.school.faang.hashset.задача_2;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        UserBlacklist blacklist = new UserBlacklist();

        blacklist.blockUser("romashka");
        blacklist.blockUser("romashka");
        blacklist.blockUser("pion");
        blacklist.blockUser("gvozdika");
        blacklist.blockUser(null);

        System.out.println(blacklist.isUserBlocked(null));

        blacklist.unblockUser(null);
        System.out.println(blacklist.isUserBlocked(null));
    }
}
 class UserBlacklist {
    private HashSet<String> blockedUsers = new HashSet<>();

     void blockUser(String username) {
         if (blockedUsers.add(username)) {
             System.out.println("Пользователь " + username + " успешно заблокирован.");
         }else {
             System.out.println("Пользователь " + username + " уже в черном списке.");
         }
     }

     void unblockUser(String username) {
         blockedUsers.remove(username);
         System.out.println("Пользователь " + username + " снова ваш друг");
     }

     boolean isUserBlocked(String username) {
         return blockedUsers.contains(username);
     }
 }
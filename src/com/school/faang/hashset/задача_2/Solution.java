package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        printInfo();
    }

    private static void printInfo() {
        UserBlacklist userBlacklist = new UserBlacklist();

        userBlacklist.blockUser("@people1");
        userBlacklist.blockUser("@people2");
        userBlacklist.blockUser("@people3");

        userBlacklist.unblockUser("@people1");
        userBlacklist.unblockUser("@people2");
        userBlacklist.unblockUser("@people3");

        System.out.println(userBlacklist.isUserBlocked("@people1"));
        System.out.println(userBlacklist.isUserBlocked("@people2"));
        System.out.println(userBlacklist.isUserBlocked("@people3"));
    }
}

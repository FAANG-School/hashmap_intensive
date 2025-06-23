package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        UserBlackList userBlackList = new UserBlackList();

        userBlackList.blockUser("Ваня");
        userBlackList.blockUser("Женя");
        userBlackList.blockUser("Коля");
        userBlackList.blockUser("Костя");
        userBlackList.blockUser("Настя");
        userBlackList.blockUser(null);

        userBlackList.blockUser("Женя");

        System.out.println(userBlackList.isBlocked(null));


        userBlackList.printBlockedUsers();
        System.out.println();

        userBlackList.unblockUser(null);

        userBlackList.printBlockedUsers();
    }
}

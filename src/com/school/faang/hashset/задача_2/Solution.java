package com.school.faang.hashset.задача_2;

public class Solution {
    public static void main(String[] args) {
        User firstUser = new User("first");
        User secondUser = new User("second");
        User thirdUser = new User("third");
        firstUser.blockUser(secondUser);
        secondUser.blockUser(thirdUser);
        thirdUser.blockUser((User) null);
        System.out.println(firstUser.amIBlocked());
        System.out.println(thirdUser.amIBlocked());
        System.out.println(firstUser.isUserBlocked(secondUser));
        System.out.println(firstUser.isUserBlocked(thirdUser));
    }
}

package com.school.faang.hashset.задача_2;


public class Solution {
    public static void main(String[] args) {
        UserBlackList blackList = new UserBlackList();

        blackList.blockUser("alice");
        blackList.blockUser("bob");
        blackList.blockUser("alice");

        System.out.println("Is bob blocked? " + blackList.isUserBlocked("bob"));

        blackList.unblockUser("bob");
        System.out.println("Is bob blocked? " + blackList.isUserBlocked("bob"));

        blackList.blockUser(null);
        System.out.println("Is null blocked? " + blackList.isUserBlocked(null));
        blackList.unblockUser(null);

        System.out.println("Is null blocked? " + blackList.isUserBlocked(null));
    }

    private static class UserBlackList {
        private final Set<String> blockedUsers = new HashSet<>();

        public void blockUser(String username) {
            if (blockedUsers.contains(username)) {
                System.out.println("This user is already blocked");
                return;
            }

            blockedUsers.add(username);
            System.out.println("User " + username + " is blocked");
        }

        public void unblockUser(String username) {
            if (!blockedUsers.contains(username)) {
                System.out.println("This user is not blocked");
                return;
            }

            blockedUsers.remove(username);
            System.out.println("User " + username + " is unblocked");
        }

        public boolean isUserBlocked(String username) {
            return blockedUsers.contains(username);
        }

        @Override
        public String toString() {
            return "UserBlackList{" +
                    "blockedUsers=" + blockedUsers +
                    '}';
        }
    }
}

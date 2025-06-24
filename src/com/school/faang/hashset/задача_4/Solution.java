package com.school.faang.hashset.задача_4;

public class Solution {
    public static void main(String[] args) {
        ChannelManager manager = new ChannelManager();

        manager.addUser("id123", "админ");
        manager.addUser("id456", "модератор");
        manager.addUser("id789", "участник");

        System.out.println(manager.hasUser("id123"));
        System.out.println(manager.getRole("id123"));

        manager.removeUser("id123");
        System.out.println(manager.hasUser("id123"));
        System.out.println(manager.getRole("id123"));
    }

    private static class ChannelManager {
        private final Set<String> members = new HashSet<>();
        private final Map<String, String> memberRoles = new HashMap<>();

        public void addUser(String userId, String role) {
            if (userId == null || role == null) return;
            if (members.contains(userId)) return;

            members.add(userId);
            memberRoles.put(userId, role);
        }

        public void removeUser(String userId) {
            members.remove(userId);
            memberRoles.remove(userId);
        }

        public String getRole(String userId) {
            if (!members.contains(userId)) {
                return "Не является участником";
            }

            return memberRoles.get(userId);
        }

        public boolean hasUser(String userId) {
            return members.contains(userId);
        }

        @Override
        public String toString() {
            return "ChannelManager{" +
                    "members=" + members +
                    ", memberRoles=" + memberRoles +
                    '}';
        }
    }
}

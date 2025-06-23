package com.school.faang.hashset.задача_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class UserBlacklist {

    private final Set<String> blockedUsers = new HashSet<>();
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Zа-яА-ЯёЁ0-9_]{3,20}$");
    private static final Set<String> RESERVED_USERNAMES = Set.of(
            "admin",
            "system",
            "support",
            "moderator");

    public Set<String> getBlockedUsers() {
        return Collections.unmodifiableSet(blockedUsers);
    }

    public void blockUser(String userName) {

        validateUsername(userName);

        if (blockedUsers.contains(userName)) {
            throw new IllegalStateException("Пользователь " + userName + " уже находится в черном списке");
        }

        blockedUsers.add(userName);
        System.out.println("Пользователь " + userName + " успешно заблокирован.");
    }

    public void unblockUser(String userName) {
        validateUsername(userName);

        if (!blockedUsers.remove(userName)) {
            throw new IllegalStateException("Пользователь " + userName + " не найден в черном списке");
        }

        System.out.println("Пользователь " + userName + " успешно разблокирован.");
    }

    public boolean isUserBlocked(String userName) {
        validateUsername(userName);
        return blockedUsers.contains(userName);
    }

    private void validateUsername(String userName) {
        if (userName == null) {
            throw new IllegalArgumentException("Имя пользователя не может быть null");
        }

        if (userName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя пользователя не может быть пустым");
        }

        if (!USERNAME_PATTERN.matcher(userName).matches()) {
            throw new IllegalArgumentException("Имя пользователя должно содержать только буквы, цифры и подчеркивание (3-20 символов)");
        }

        if (RESERVED_USERNAMES.contains(userName.toLowerCase())) {
            throw new IllegalArgumentException("Имя пользователя " + userName + " зарезервировано системой");
        }
    }
}

package com.school.faang.hashset.задача_4;

public class User {

    private Role role;

    private final String id;

    public User(String id, Role role) {
        this.role = role;
        this.id = id;
    }

    public User(String id, String role) {
        this.id = id;
        this.role = Role.valueOf(role);
    }

    public String getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

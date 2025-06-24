package com.school.faang.hashset.задача_5;

import java.util.Objects;

public class Player {

    private final String nickname;
    private String status;

    public Player(String nickname) {
        this.nickname = nickname;
        status = "unready";
    }

    public String getNickname() {
        return nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (!(status.equals("ready") || status.equals("unready"))) {
            throw new IllegalArgumentException("Bad status");
        }
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        return this.nickname.equals(((Player) obj).nickname);
    }

    @Override
    public String toString() {
        return nickname;
    }
}

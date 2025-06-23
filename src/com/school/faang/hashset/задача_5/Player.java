package com.school.faang.hashset.задача_5;

import java.util.Objects;

public class Player {
    private String nickName;
    private Status status;

    public Player(String nickName) {
        this.nickName = nickName;
        this.status = Status.NOTREADY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nickName, player.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName);
    }

    public String getNickName() {
        return nickName;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", status=" + status +
                '}';
    }
}

package com.school.faang.hashset.задача_5;

import java.util.Objects;

public class Player {

    private String nickname;
    private String status;

    public Player(String nickname) {

        this.nickname = nickname;
        this.status = "Не готов";

    }

    public String getNickname() {

        return nickname;

    }

    public void setNickname(String nickname) {

        this.nickname = nickname;

    }

    public String getStatus() {

        return status;

    }

    public void setStatus(String status) {

        this.status = status;

    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nickname, player.nickname);

    }

    @Override
    public int hashCode() {

        return Objects.hashCode(nickname);

    }
}

package com.school.faang.hashset.задача_5;

import java.util.Objects;

public class Player extends GameLobby {

    private String nickname;

    private String status = "Не готов";

    public Player (String nickname)  {
        this.nickname = nickname;
    }

    public Player (String nickname,String status)  {
        this.nickname = nickname;
        this.status  = status;
    }

    public String getStatus() {
        return status;
    }

    public String getNickName() {
        return nickname;
    }

    @Override public int hashCode()  {
        return Objects.hash(nickname);
    }

    @Override public boolean equals(Object o)  {

        if (this == o) {

            return true;
        }
        if (o == null ||  getClass() != o.getClass()) {
            return false;
        }

        Player player = (Player) o;

        return nickname.equals(player.nickname);
    }
    @Override public String toString()  {
        return nickname + " " + status;
    }
}

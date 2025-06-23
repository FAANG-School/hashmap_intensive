package com.school.faang.hashset.задача_5;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class GameLobby   {

    private HashSet  <Player> players = new HashSet <> ();

    private List <Player> playerJoinOrder =  new ArrayList<>();


    public void addPlayer(String nickname) {
        if (players.contains(new Player(nickname)) ) {

        } else  {
            players.add(new Player(nickname , "Не готов"));
            playerJoinOrder.add(new Player(nickname, "Не готов"));
        }
    }

    public void removePlayer (String nickname) {
        players.remove(new Player(nickname));
        playerJoinOrder.remove(new Player(nickname));
    }
    public void changeStatusOnParticipantPlayer (String nickname) {
        players.remove(new Player(nickname));
        playerJoinOrder.remove(new Player(nickname));
        players.add(new Player (nickname, "Участник"));
        playerJoinOrder.add(new Player (nickname, "Участник"));
    }

    public void changeStatusOnModeratorPlayer (String nickname) {
        players.remove(new Player(nickname));
        playerJoinOrder.remove(new Player(nickname));
        players.add(new Player (nickname, "Модератор"));
        playerJoinOrder.add(new Player (nickname, "Модератор"));
    }

    public void changeStatusOnAndminPlayer (String nickname) {
        players.remove(new Player(nickname));
        playerJoinOrder.remove(new Player(nickname));
        players.add(new Player (nickname, "Админ"));
        playerJoinOrder.add(new Player (nickname, "Админ"));
    }

    public boolean hasPlayer(String nickname)  {

        if (players.contains(new Player(nickname)))  {
            return true;
        }
        else {
            return false;
        }
    }

    public void displayPlayers() {
        System.out.println(playerJoinOrder);
    }
}

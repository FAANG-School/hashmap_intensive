package com.school.faang.hashset.задача_5;

import java.util.*;

public class GameLobby {
    private Set<Player> players;
    private Set<Player> playerJoinOrder;

    public GameLobby() {
        players = new HashSet<>();
        playerJoinOrder = new LinkedHashSet<>();
    }

    void addPlayer(String nickName) {
        if(!checkPlayer(nickName)) {
            Player player = new Player(nickName);
            players.add(player);
            System.out.println("Игрок "+nickName+ " зарегистрирован на сервере");
            playerJoinOrder.add(player);
        }
    }
    void removePlayer(String nickName) {
        Player player = new Player(nickName);
        players.remove(player);
        playerJoinOrder.remove(player);
    }
    boolean hasPlayer(String nickName) {
        return checkPlayer(nickName);
    }
    void displayPlayers() {
        System.out.println(playerJoinOrder);
    }
    public void changeStatus(String nickName) {
       for (Player player : playerJoinOrder) {
           if (player.getNickName().equals(nickName)) {
               player.setStatus(Status.READY);
           }
       }
    }
    private boolean checkPlayer(String nickName) {
        Player player = new Player(nickName);
       return players.contains(player);
    }
}

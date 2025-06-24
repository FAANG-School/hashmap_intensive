package com.school.faang.hashset.задача_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby(new HashSet<>(), new ArrayList<>());

        gameLobby.addPlayer("Gunner");
        gameLobby.addPlayer("Gunner");
        gameLobby.addPlayer("Sniper003");
        gameLobby.addPlayer("Sniper2000");
        gameLobby.addPlayer("GodKiller");

        gameLobby.displayPlayers();
        System.out.println(gameLobby.hasPlayer("Gunner"));

        gameLobby.removePlayer("Sniper003");

        gameLobby.displayPlayers();
    }
}

class Player {
    private String nickname;
    private String status = "не готов";

    public Player(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Player player = (Player) obj;

        return nickname.equals(player.nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public String getStatus() {
        return status;
    }
}

class GameLobby {
    private Set<Player> players;
    private List<Player> playerJoinOrder;

    public GameLobby(Set<Player> players, List<Player> playerJoinOrder) {
        this.players = new HashSet<>();
        this.playerJoinOrder = new ArrayList<>();
    }

    void addPlayer(String nickname) {
        Player player = new Player(nickname);
        if (players.add(player)){
            playerJoinOrder.add(player);
        }
    }

    void removePlayer(String nickname) {
        Player player = new Player(nickname);
        if (players.remove(player)){
            playerJoinOrder.remove(player);
        }
    }

    boolean hasPlayer(String nickname) {
        Player player = new Player(nickname);
        return playerJoinOrder.contains(player);
    }

    void displayPlayers() {
        for (Player player : playerJoinOrder) {
            System.out.println(player.getNickname() + " "+ player.getStatus());
        }
    }
}
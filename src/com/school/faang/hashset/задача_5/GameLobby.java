package com.school.faang.hashset.задача_5;


import java.util.Set;

public class GameLobby {

    private Set<Player> players;

    private Set<Player> playerJoinOrder;

    public GameLobby(Set<Player> players, Set<Player> playerJoinOrder) {
        this.players = players;
        this.playerJoinOrder = playerJoinOrder;
    }

    protected void addPlayer(String nickname) {
        if (!checkPlayer(nickname)) {
            Player player = new Player(nickname);
            players.add(player);
            System.out.println("Игрок " + nickname + " успешно зарегистрировано на сервере!");
            playerJoinOrder.add(player);
        }
    }

    protected void removePlayer(String nickname) {
        Player player = new Player(nickname);
        players.remove(player);
        playerJoinOrder.remove(player);
    }

    protected boolean hasPlayer(String nickname) {
        return checkPlayer(nickname);
    }

    protected void displayInfo() {
        for (Player player : playerJoinOrder) {
            System.out.println(player.getNickname());
        }
    }

    protected boolean checkPlayer(String nickname) {
        Player player = new Player(nickname);
        return players.contains(player);
    }

    protected void changeStatus(String nickname) {
        for (Player player : playerJoinOrder) {
            if (player.getNickname().equals(nickname)) {
                player.setStatus(Status.READY);
            }
        }
    }
}

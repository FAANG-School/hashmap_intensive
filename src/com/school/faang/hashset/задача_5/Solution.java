package com.school.faang.hashset.задача_5;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Player {
    private String nickname;
    private String status = "Не готов";

    public Player(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Никнейм: " + nickname + ", статус: " + status;
    }

}

class GameLobby{
    private Set<Player> players = new HashSet<>();
    private Set<Player> playerJoinOrder = new LinkedHashSet<>();

    public GameLobby() {
        this.players = new HashSet<>();
        this.playerJoinOrder = new LinkedHashSet<>();
    }

    public void addPlayer(String nickname) {
        Player addPlayer = new Player(nickname);
        if (players.contains(addPlayer)){
            System.out.println("Такой игрок уже есть");
        } else{
            players.add(addPlayer);
            playerJoinOrder.add(addPlayer);
        }
    }
    public void removePlayer(String nickname){
        Player removePlayer = new Player(nickname);
        players.remove(removePlayer);
        playerJoinOrder.remove(removePlayer);
        System.out.println("Игрок "+nickname+" удален из лобби");
    }
    public boolean hasPlayer(String nickname){
        Player player = new Player(nickname);
        return (playerJoinOrder.contains(player));
    }
    public void displayPlayers(){
        System.out.println("Список игроков:");
        for (Player listPlayer:playerJoinOrder) {
            System.out.println(listPlayer);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        GameLobby gameLobby = new GameLobby();
        gameLobby.addPlayer("shtrih228");
        gameLobby.addPlayer("ivanyhka");
        gameLobby.addPlayer("zxc1234");
        gameLobby.addPlayer("qwerty333");
        gameLobby.addPlayer("asdfg666");

        gameLobby.displayPlayers();

        gameLobby.addPlayer("zxc1234");



        gameLobby.removePlayer("qwerty333");

        gameLobby.displayPlayers();

        System.out.println(gameLobby.hasPlayer("shtrih228"));
        System.out.println(gameLobby.hasPlayer("qwerty333"));
    }
}

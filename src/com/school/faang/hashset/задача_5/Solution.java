package com.school.faang.hashset.задача_5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.HashSet;
import java.util.List;

public class Solution {
    static class Player {
        private String nickname;
        private String status;

        public Player(String nickname, String status) {
            this.nickname = nickname;
            this.status = status;
        }

        @Override
        public int hashCode() {
            return Objects.hash(nickname);
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            Player player = (Player) o;

            return nickname.equals(player.nickname);
        }

        String getNickname() {
            return nickname;
        }

        String getStatus() {
            return status;
        }
    }

    static class GameLobby {
        private HashSet<Player> players;
        private List<Player> playerJoinOrder;

        public GameLobby(HashSet<String> players, ArrayList<Player> playerJoinOrder) {
            this.players = new HashSet<>();
            this.playerJoinOrder = new ArrayList<>();
        }

        void addPlayer(String nickname) {
            Player player = new Player(nickname, "Не готов");
            if (players.add(player)) {
                playerJoinOrder.add(player);
            }
        }

        void removePlayer(String nickname) {
            Player player = new Player(nickname, "Не готов");
            players.remove(player);
            playerJoinOrder.remove(player);
        }

        boolean hasPlayer(String nickname) {
            Player player = new Player(nickname, "Не готов");
            return playerJoinOrder.contains(player);
        }

        void displayPlayers() {
            for (Player player : playerJoinOrder) {
                System.out.println(player.getNickname() + " " + player.getStatus());
            }
        }
    }

    public static void main(String[] args) {
        GameLobby lobby = new GameLobby(new HashSet<>(), new ArrayList<Player>());
        lobby.addPlayer("gellivar");
        lobby.addPlayer("jeenek");
        lobby.addPlayer("S1mple");
        lobby.addPlayer("doggy");
        lobby.addPlayer("gellivar");
        lobby.displayPlayers();
        lobby.removePlayer("jeenek");
        lobby.displayPlayers();
    }
}

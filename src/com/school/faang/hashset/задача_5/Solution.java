package com.school.faang.hashset.задача_5;

public class Solution {
    public static void main(String[] args) {
        GameLobby lobby = new GameLobby();

        lobby.addPlayer("Player1");
        lobby.addPlayer("Player2");
        lobby.addPlayer("Player3");

        lobby.addPlayer("Player2");
        System.out.println("Список игроков:");
        lobby.displayPlayers();

        System.out.println("Player2 в лобби? " + lobby.hasPlayer("Player2"));
        System.out.println("Player4 в лобби? " + lobby.hasPlayer("Player4"));

        lobby.removePlayer("Player2");
        System.out.println("Список игроков:");
        lobby.displayPlayers();
    }

    private static class Player {
        private final String nickname;
        private String status = "Не готов";

        public Player(String nickname, String status) {
            this.nickname = nickname;
            this.status = status;
        }

        public String getNickname() {
            return nickname;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public int hashCode() {
            return Objects.hash(nickname);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Player other)) return false;

            return Objects.equals(nickname, other.nickname);
        }

        @Override
        public String toString() {
            return "Player{" +
                    "nickname='" + nickname + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }

    private static class GameLobby {
        private final Set<Player> players = new HashSet<>();
        private final List<Player> playerJoinOrder = new LinkedList<>();

        public void addPlayer(String nickname) {
            Player tempPlayer = new Player(nickname, "Не готов");
            if (players.contains(tempPlayer)) return;

            players.add(tempPlayer);
            playerJoinOrder.add(tempPlayer);
        }

        public void removePlayer(String nickname) {
            Player tempPlayer = new Player(nickname, "Не готов");

            players.remove(tempPlayer);
            playerJoinOrder.remove(tempPlayer);
        }

        public boolean hasPlayer(String nickname) {
            Player tempPlayer = new Player(nickname, "Не готов");
            return players.contains(tempPlayer);
        }

        public void displayPlayers() {
            for (Player player : playerJoinOrder) {
                System.out.println(player);
            }
        }
    }
}

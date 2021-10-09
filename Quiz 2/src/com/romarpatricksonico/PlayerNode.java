package com.romarpatricksonico;

import java.util.Objects;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public String toString() {
        return "PlayerNode{" +
                "player=" + player +
                ", nextPlayer=" + nextPlayer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerNode that = (PlayerNode) o;
        return Objects.equals(player, that.player) && Objects.equals(nextPlayer, that.nextPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, nextPlayer);
    }
}

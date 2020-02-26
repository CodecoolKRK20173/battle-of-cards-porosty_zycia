package com.codecool.resources;

import com.codecool.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Player> players;

    public Deck() {
        this.players = new ArrayList<Player>();
    }
    public void addPlayers(Player player) {
        this.players.add(player);
    }
}

package com.codecool.comparator;

import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorShooting implements Comparator<Player> {

    @Override
    public int compare(Player activePlater, Player inActivePlayer) {
        return activePlater.getTopCard().getShooting() - inActivePlayer.getTopCard().getShooting();
    }
}

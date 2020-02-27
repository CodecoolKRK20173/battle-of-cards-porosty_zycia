package com.codecool.comparator;

import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorDefence implements Comparator<Player> {

    @Override
    public int compare(Player activePlater, Player inActivePlayer) {
        return activePlater.getTopCard().getDefending() - inActivePlayer.getTopCard().getDefending();
    }
}

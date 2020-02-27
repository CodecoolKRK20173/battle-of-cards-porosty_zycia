package com.codecool.comparator;

import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorPace implements Comparator<Player> {

    @Override
    public int compare(Player activePlater, Player inActivePlayer) {
        return activePlater.getTopCard().getPace() - inActivePlayer.getTopCard().getPace();
    }
}

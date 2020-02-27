package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;
import java.util.Comparator;

public class ComparatorDribling implements Comparator<Player> {

    @Override
    public int compare(Player activePlater, Player inActivePlayer) {
        return activePlater.getTopCard().getDribbling() - inActivePlayer.getTopCard().getDribbling();
    }


}



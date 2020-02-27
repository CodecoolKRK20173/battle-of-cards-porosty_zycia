package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;
import java.util.Comparator;

public class ComparatorDribling implements Comparator<Player> {

    @Override
    public int compare(Player activePlayer, Player inActivePlayer) {
        if (((activePlayer.getTopCard().getDribbling() - inActivePlayer.getTopCard().getDribbling()  )>  0)) {
            return 1;
        }else if (((activePlayer.getTopCard().getDribbling() - inActivePlayer.getTopCard().getDribbling()) == 0)) {
            return 0;
        }return 2;

        }
    }






package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorPace implements Comparator<Card> {

    @Override
    public int compare(Card cardActiv, Card cardInActiv) {
        if (cardActiv.getPace() == cardInActiv.getPace()) {
            return 0;
        } else if (cardActiv.getPace() > cardInActiv.getPace()) {
            return 1;
        } else {
            return 2;
        }
    }
}

package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorDefence implements Comparator<Card> {

    @Override
    public int compare(Card cardActiv, Card cardInActiv) {
        if (cardActiv.getDefending() == cardInActiv.getDefending()) {
            return 0;
        } else if (cardActiv.getDefending() > cardInActiv.getDefending()) {
            return 1;
        } else {
            return 2;
        }
    }
}
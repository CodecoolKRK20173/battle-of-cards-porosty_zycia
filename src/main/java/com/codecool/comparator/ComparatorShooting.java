package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorShooting implements Comparator<Card> {

    @Override
    public int compare(Card cardActiv, Card cardInActiv) {
        if (cardActiv.getShooting() == cardInActiv.getShooting()) {
            return 0;
        } else if (cardActiv.getShooting() > cardInActiv.getShooting()) {
            return 1;
        } else {
            return 2;
        }
    }
}
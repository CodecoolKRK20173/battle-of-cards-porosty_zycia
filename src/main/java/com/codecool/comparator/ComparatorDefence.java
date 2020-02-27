package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorDefence implements Comparator<Card> {

    @Override
    public int compare(Card cardActive, Card cardInActive) {
        if (cardActive.getDefending() == cardInActive.getDefending()) {
            return 0;
        } else if (cardActive.getDefending() > cardInActive.getDefending()) {
            return 1;
        } else {
            return 2;
        }
    }
}
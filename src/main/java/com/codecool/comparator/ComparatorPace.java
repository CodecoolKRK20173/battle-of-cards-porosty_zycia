package com.codecool.comparator;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.Comparator;

public class ComparatorPace implements Comparator<Card> {

    @Override
    public int compare(Card cardActive, Card cardInActive) {
        if (cardActive.getPace() == cardInActive.getPace()) {
            return 0;
        } else if (cardActive.getPace() > cardInActive.getPace()) {
            return 1;
        } else {
            return 2;
        }
    }
}

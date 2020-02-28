package com.codecool.comparator;

import com.codecool.Card;

import java.util.Comparator;

public class ComparatorDribling implements Comparator<Card> {


    @Override
    public int compare(Card cardActiv, Card cardInActiv) {
        if (cardActiv.getDribbling() == cardInActiv.getDribbling()) {
            return 0;
        } else if (cardActiv.getDribbling() > cardInActiv.getDribbling()) {
            return 1;
        } else {
            return 2;
        }
    }
}






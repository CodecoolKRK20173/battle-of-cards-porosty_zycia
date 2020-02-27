package com.codecool.players;

import com.codecool.Card;
import com.codecool.parser.PlayerDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AIPlayer extends Player {
    private PlayerDeck cardsToUse;

    public AIPlayer(String name) {

        super(name);
        this.cardsToUse = new PlayerDeck();
    }

    @Override
    public PlayerDeck getCardsToUse() {
        return null;


    }

    List<Integer> aiList = new ArrayList<Integer>();

    public int max(Card cardActive) {

        aiList.add(cardActive.getPace());
        aiList.add(cardActive.getShooting());
        aiList.add(cardActive.getDribbling());
        aiList.add(cardActive.getDefending());


        return aiList.indexOf(Collections.max(aiList));
        }


    }


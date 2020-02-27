package com.codecool.players;

import com.codecool.parser.PlayerDeck;

public class AIPlayer extends Player {

    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public PlayerDeck getCardsToUse() {
        return null;
    }
}

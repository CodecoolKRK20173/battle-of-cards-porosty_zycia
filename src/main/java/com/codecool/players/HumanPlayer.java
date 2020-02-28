package com.codecool.players;

import com.codecool.Card;
import com.codecool.parser.PlayerDeck;

public class HumanPlayer extends Player {
    private PlayerDeck cardsToUse;

    public HumanPlayer(String name) {
        super(name);
        this.cardsToUse = new PlayerDeck();
    }

    @Override
    public void addCardToDeck(Card card) {
        super.addCardToDeck(card);
    }

    @Override
    public PlayerDeck getCardsToUse() {
        return null;
    }

}

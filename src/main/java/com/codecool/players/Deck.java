package com.codecool.players;

import com.codecool.Card;
import com.codecool.parser.PlayerDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private List<Player> players;
    private PlayerDeck playerDeck;

    public Deck(List<Card> cards) {
        this.cards = cards;
        this.players = new ArrayList<>();
        this.playerDeck = new PlayerDeck();
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public Card getCardByIndex(int index) {
        return cards.get(index);
    }

    public int getSize() {
        return cards.size();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }
}


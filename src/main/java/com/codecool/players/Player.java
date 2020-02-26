package com.codecool.players;

import com.codecool.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    private List<Card> deck = new ArrayList<>();

    public Player(String name) {
        this.deck = deck;
        this.name = name;
    }

    public void takeCard(Card card) {

    }
    public List<Card> getDeck(){
        return this.deck;
    }

    public void addCardToDeck(Card card) {
        deck.add(card);


    }

    public void printCards(List<Card> deck){
        for (Card card: deck){
            System.out.println(card.getName());
        }

    }
    }




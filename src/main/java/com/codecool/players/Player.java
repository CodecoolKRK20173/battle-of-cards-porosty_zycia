//package com.codecool.players;
//
//import com.codecool.Card;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public abstract class Player {
//    private String name;
//    private List<Card> deck = new ArrayList<>();
//
//    public Player(String name) {
//        this.name = name;
//    }
//
//    public Card getTopCard() {
//        Card topCard = deck.get(0);
//        deck.remove(0);
//
//        return topCard;
//    }
//
//    public List<Card> getAllDeck() {
//        return deck;
//    }
//
//    public void addCardToDeck(Card card) {
//        deck.add(card);
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void printCards(){
//        for (Card card: deck){
//            System.out.println(card.getName());
//        }
//
//    }
//
//    public boolean hasCards() {
//        if (deck.size() > 0) {
//            return true;
//        }
//        return false;
//    }
//
//}
package com.codecool.players;

import com.codecool.Card;
import com.codecool.parser.PlayerDeck;
import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    private String name;
    private List<Card> deck = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public Card getTopCard() {
        Card topCard = deck.get(0);
        deck.remove(0);
        return topCard;
    }

    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    public void printCards() {
        for (Card card : deck) {
            System.out.println(card.getName());
        }
    }

    public boolean hasCards() {
        if (deck.size() > 0) {
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public abstract PlayerDeck getCardsToUse();
}





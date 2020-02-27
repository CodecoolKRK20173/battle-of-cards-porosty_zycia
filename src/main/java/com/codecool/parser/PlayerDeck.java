//package com.codecool.parser;
//
//import com.codecool.Card;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PlayerDeck {
//    public List<Card> listOfPlayerCards;
//
//    public PlayerDeck() {
//        this.listOfPlayerCards = new ArrayList<>();
//    }
//
//    public void addToListOfCards(Card card) {
//        listOfPlayerCards.add(card);
//    }
//
//    public Card getCardByIndex(int index) {
//        return listOfPlayerCards.get(index);
//    }
//}
package com.codecool.parser;

import com.codecool.Card;
import java.util.ArrayList;
import java.util.List;

public class PlayerDeck {
    public List<Card> listOfPlayerCards;

    public PlayerDeck() {
        this.listOfPlayerCards = new ArrayList<>();
    }

    public void addToListOfCards(Card card) {
        listOfPlayerCards.add(card);
    }

    public Card getCardByIndex(int index) {
        return listOfPlayerCards.get(index);
    }
}
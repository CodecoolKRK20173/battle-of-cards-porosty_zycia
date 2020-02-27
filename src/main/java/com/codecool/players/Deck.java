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
    public void createDeck() {
        int cardIterator = 0;
        for (Player player : players) {
            int numOfCardsForEachPlayer = 16;
            for (int i = 0; i< numOfCardsForEachPlayer; i++) {
                player.getCardsToUse().addToListOfCards(playerDeck.getCardByIndex(cardIterator));
                cardIterator++;
            }
            System.out.println(player);
        }
    }

    public int getSize() {
        return cards.size();
    }

    public void printCards() {
        for (Card card: cards){
            System.out.println(card.getName());
        }
    }

    public List<Player> getPlayers(){
        return players;
    }

    public void addPlayers(Player player) {
        this.players.add(player);
    }
    //    List<Card> hand1 = new ArrayList<>();
//    List<Card> hand2 = new ArrayList<>();
//
//    public List<Card> getHand1() {
//        return this.hand1;
//    }
//
//    public List<Card> getHand2() {
//        return this.hand2;
//    }

//    public void shuffleCards() throws ParserConfigurationException, SAXException, IOException {
//        XmlPlayer xmlPlayer = new XmlPlayer();
//        xmlPlayer.parse();
//        xmlPlayer.getCards();
//        String space = "                          ";
//
//
//
//
//
//        Collections.shuffle(xmlPlayer.getCards());
//
//        for (int i=0; i < xmlPlayer.getCards().size() ; i+=2) {
//
//
//
//                System.out.print(xmlPlayer.getCards().get(i).getName());
//            System.out.print(space);
//                System.out.println(xmlPlayer.getCards().get(i+1).getName());
//                System.out.print(xmlPlayer.getCards().get(i).getDefending());
//            System.out.print(space);
//            System.out.println(xmlPlayer.getCards().get(i+1).getDefending());
//                System.out.print(xmlPlayer.getCards().get(i).getDribbling());
//            System.out.print(space);
//            System.out.println(xmlPlayer.getCards().get(i+1).getDribbling());
//                System.out.print(xmlPlayer.getCards().get(i).getPace());
//            System.out.print(space);
//            System.out.println(xmlPlayer.getCards().get(i+1).getPace());
//                System.out.print(xmlPlayer.getCards().get(i).getShooting());
//            System.out.print(space);
//            System.out.println(xmlPlayer.getCards().get(i+1).getShooting());
//
//
//            this.hand1.add(xmlPlayer.getCards().get(i));
//            this.hand2.add(xmlPlayer.getCards().get(i+1));
//
//
//
//            }

//    }


}


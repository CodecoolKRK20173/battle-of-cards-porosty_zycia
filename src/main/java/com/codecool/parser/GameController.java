package com.codecool.parser;

import com.codecool.Card;
import com.codecool.players.Deck;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameController {

    public void run() throws ParserConfigurationException, SAXException, IOException {

        XmlPlayer xmlPlayer = new XmlPlayer();
        xmlPlayer.parse();
        HumanPlayer player1 = new HumanPlayer("Mike");
        HumanPlayer player2 = new HumanPlayer("Stan");


        Deck deck = new Deck(xmlPlayer.getCards());
//        List<Card> cards = xmlPlayer.getCards();

        deck.shuffleCards();
//        Collections.shuffle(cards);

        deck.printCards();
//        printCards(cards);

        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();

        for (int i=0; i < deck.getSize() ; i++) {
            if (i % 2 == 0) {
                //hand1.add(deck.getCardByIndex(i));
                player1.addCardToDeck(deck.getCardByIndex(i));
            }else{
                player2.addCardToDeck(deck.getCardByIndex(i));
            }
        }
        System.out.println("hand1");
       player1.printCards(player1.getDeck());
        System.out.println("hand2");
        player2.printCards(player2.getDeck());



        }

//        private void printCards(List<Card> cards){
//        for (Card card: cards){
//            System.out.println(card.getName());
//        }

    }


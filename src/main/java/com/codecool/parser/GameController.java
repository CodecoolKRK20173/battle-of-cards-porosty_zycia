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
        Player activePlayer = player1;
        Player inActivePlayer = player2;


        Deck deck = new Deck(xmlPlayer.getCards());

        deck.shuffleCards();

        deck.printCards();
        for (int i=0; i < deck.getSize() ; i++) {
            if (i % 2 == 0) {
                player1.addCardToDeck(deck.getCardByIndex(i));
            }else{
                player2.addCardToDeck(deck.getCardByIndex(i));
            }
        }
        System.out.println("hand1");
        player1.printCards();
        System.out.println("hand2");
        player2.printCards();

        while (player1.hasCards() && player2.hasCards()) {
            Card activePlayerCard = activePlayer.getTopCard();
            Card inActivePlayerCard = inActivePlayer.getTopCard();

        }

        }

}


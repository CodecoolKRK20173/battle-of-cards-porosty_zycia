package com.codecool.parser;

import com.codecool.Card;
import com.codecool.PrintTable;
import com.codecool.UserGlobalInput;
import com.codecool.players.Deck;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class GameController {


    public void run() throws ParserConfigurationException, SAXException, IOException {

        UserGlobalInput uInput = new UserGlobalInput();
        XmlPlayer xmlPlayer = new XmlPlayer();
        xmlPlayer.parse();
        HumanPlayer player1 = new HumanPlayer("Mike");
        HumanPlayer player2 = new HumanPlayer("Stan");
        Player activePlayer = player1;
        Player inActivePlayer = player2;
        boolean isRunning = true;

        Deck deck = new Deck(xmlPlayer.getCards());

        deck.shuffleCards();


        for (int i=0; i < deck.getSize() ; i++) {
            if (i % 2 == 0) {
                player1.addCardToDeck(deck.getCardByIndex(i));
            }else{
                player2.addCardToDeck(deck.getCardByIndex(i));
            }
        }


        while (player1.hasCards() && player2.hasCards() && isRunning) {

            int menuOption = uInput.getIntInput(); // TODO: get option from user

            switch (menuOption) {

                case 1:
                    Card activePlayerCard = activePlayer.getTopCard();
                    Card inActivePlayerCard = inActivePlayer.getTopCard();

                    //TODO show active player card - choose characteristic to play - (compare)

                    PrintTable print = new PrintTable(activePlayerCard,inActivePlayerCard);
                    print.printTableActivePlayer(activePlayerCard, activePlayer);


                    print.printMenuOptions();
                    print.printTitle();
//                    print.printTable(activePlayerCard, inActivePlayerCard);

                    //TODO move cards

                    break;
                case 2:
                    break;

                case 0:
                    isRunning = false;
                    break;
                default:
                    break;
            }
        }
        uInput.scannerClose();
    }





}


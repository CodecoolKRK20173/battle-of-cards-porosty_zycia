package com.codecool.parser;

import com.codecool.Card;
import com.codecool.PrintTable;

import com.codecool.comparator.ComparatorDefence;
import com.codecool.comparator.ComparatorDribling;
import com.codecool.comparator.ComparatorPace;
import com.codecool.comparator.ComparatorShooting;
import com.codecool.players.Deck;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class GameController {
    XmlCard xmlPlayer = new XmlCard();
    Deck deck;
    boolean isRunning = true;

    public GameController(XmlCard xmlCard) {
        deck = new Deck(xmlCard.getCards());
    }

    public void menu() throws IOException, SAXException, ParserConfigurationException {

        PrintTable printTable = new PrintTable();

        printTable.printTitle();

        System.out.println("                                                                       Choose an option: " +
                "\n                                                                                           1.Start Game (PvP) " +
                "\n                                                                                           2.Quit game");
        Scanner scan = new Scanner(System.in);

        String textInput = scan.nextLine();

        switch (textInput) {
            case "1":
                int count = 2;
                for (int i = 0; i < count; i++) {
                    System.out.print("                                                          Player" + (i + 1) + " Please input your name: ");
                    createPlayers();
                }
                run();
            case "2":
                break;
        }
        scan.close();
    }

    public void run() throws ParserConfigurationException, SAXException, IOException {
        xmlPlayer.parse();
        deck.shuffleCards();

        Player player1 = deck.getPlayers().get(0);
        Player player2 = deck.getPlayers().get(1);

        for (int i = 0; i < deck.getSize(); i++) {
            if (i % 2 == 0) {
                player1.addCardToDeck(deck.getCardByIndex(i));
            } else {
                player2.addCardToDeck(deck.getCardByIndex(i));
            }
        }

        while (player1.hasCards() && player2.hasCards() && isRunning) {

            Card activePlayerCard = player1.getTopCard();
            Card inActivePlayerCard = player2.getTopCard();

            PrintTable print = new PrintTable(activePlayerCard, inActivePlayerCard);

            print.printTableActivePlayer(activePlayerCard, player1);

            int result = chooseComparator(activePlayerCard, inActivePlayerCard);

            switch (result) {
                case 0://remis
                    player1.addCardToDeck(activePlayerCard);
                    player2.addCardToDeck(inActivePlayerCard);
                    break;
                case 1://wygrana
                    player1.addCardToDeck(activePlayerCard);
                    player1.addCardToDeck(inActivePlayerCard);
                    break;
                case 2://przegrana
                    player2.addCardToDeck(activePlayerCard);
                    player2.addCardToDeck(inActivePlayerCard);
                    break;
            }
            print.printTable(activePlayerCard, inActivePlayerCard, player1, player2);
        }
    }

    public void addLostCardToWinnerPlayerDeck(Card card, Player player) {
        Card lostCard = player.getTopCard();

    }

    public void createPlayers() {
        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();
        HumanPlayer player = new HumanPlayer(textInput);
        deck.addPlayers(player);

    }

    public int chooseComparator(Card activePlayerCard, Card inActivePlayerCard) {
        ComparatorPace comparatorPace = new ComparatorPace();
        ComparatorShooting comparatorShooting = new ComparatorShooting();
        ComparatorDribling comparatorDribling = new ComparatorDribling();
        ComparatorDefence comparatorDefence = new ComparatorDefence();

        System.out.println("                                                        Choose card stat to compare: " +
                "\n                                                                                           1.Pace " +
                "\n                                                                                           2.Shooting" +
                "\n                                                                                           3.Dribbling" +
                "\n                                                                                           4.Defending\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();

        int result = 0;
        switch (textInput) {
            case "1":
                result = comparatorPace.compare(activePlayerCard, inActivePlayerCard);
                break;
            case "2":
                result = comparatorShooting.compare(activePlayerCard, inActivePlayerCard);
                break;
            case "3":
                result = comparatorDribling.compare(activePlayerCard, inActivePlayerCard);
                break;
            case "4":
                result = comparatorDefence.compare(activePlayerCard, inActivePlayerCard);
                break;
            case "0":
                isRunning = false;
        }
        return result;
    }
}


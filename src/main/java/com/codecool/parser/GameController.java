package com.codecool.parser;

import com.codecool.Card;
import com.codecool.PrintTable;
import com.codecool.UserGlobalInput;
import com.codecool.comparator.ComparatorDefence;
import com.codecool.comparator.ComparatorDribling;
import com.codecool.comparator.ComparatorPace;
import com.codecool.comparator.ComparatorShooting;
import com.codecool.players.AIPlayer;
import com.codecool.players.Deck;
import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

//public class GameController {
//
//
//    public void run() throws ParserConfigurationException, SAXException, IOException {
//
//        UserGlobalInput uInput = new UserGlobalInput();
//        XmlPlayer xmlPlayer = new XmlPlayer();
//        xmlPlayer.parse();
//        HumanPlayer player1 = new HumanPlayer("Mike");
//        HumanPlayer player2 = new HumanPlayer("Stan");
//        Player activePlayer = player1;
//        Player inActivePlayer = player2;
//        boolean isRunning = true;
//
//        Deck deck = new Deck(xmlPlayer.getCards());
//
//        deck.shuffleCards();
//
//
//        for (int i=0; i < deck.getSize() ; i++) {
//            if (i % 2 == 0) {
//                player1.addCardToDeck(deck.getCardByIndex(i));
//            }else{
//                player2.addCardToDeck(deck.getCardByIndex(i));
//            }
//        }
//
//
//        while (player1.hasCards() && player2.hasCards() && isRunning) {
//
//            int menuOption = uInput.getIntInput(); // TODO: get option from user
//
//            switch (menuOption) {
//
//                case 1:
//                    Card activePlayerCard = activePlayer.getTopCard();
//                    Card inActivePlayerCard = inActivePlayer.getTopCard();
//
//                    //TODO show active player card - choose characteristic to play - (compare)
//
//                    PrintTable print = new PrintTable(activePlayerCard,inActivePlayerCard);
//                    print.printTableActivePlayer(activePlayerCard, activePlayer);
//
//
//                    print.printMenuOptions();
//                    print.printTitle();
////                    print.printTable(activePlayerCard, inActivePlayerCard);
//
//                    //TODO move cards
//
//                    break;
//                case 2:
//                    break;
//
//                case 0:
//                    isRunning = false;
//                    break;
//                default:
//                    break;
//            }
//        }
//        uInput.scannerClose();
//    }

//}

public class GameController {
    private XmlCard xmlCard;
    XmlCard xmlPlayer = new XmlCard();
    Deck deck;
    boolean isRunning = true;

    public GameController(XmlCard xmlCard) {
        this.xmlCard = xmlCard;
        deck = new Deck(xmlCard.getCards());
    }

    public void menu() throws IOException, SAXException, ParserConfigurationException {

        PrintTable printTable = new PrintTable();

        printTable.printTitle();

        System.out.println("Choose an option: \n1.Start Game (PvP) \n2. Start Game (PvC) \n3.Quit game");
        Scanner scan = new Scanner(System.in);

        //        while (player1.hasCards() && player2.hasCards() && isRunning) {

        String textInput = scan.nextLine();

        switch (textInput) {
            case "1":
                int count = 2;
                for (int i = 0; i < count; i++) {
                    System.out.println("Player" + (i + 1) + " Please input your name: ");
                    createPlayers();
                }
                run();

            case "2":


                    System.out.println("Player"  + " Please input your name: ");
                    createPlayers();
                    createAIPlayers();



                runAI();

            case "3":
                break;
        }
        scan.close();
    }

    public void runAI() throws ParserConfigurationException, SAXException, IOException {
        xmlPlayer.parse();
        deck.shuffleCards();
        deck.printCards();


        Player player1 = deck.getPlayers().get(0);
        AIPlayer aiPlayer = (AIPlayer) deck.getPlayers().get(1);



        for (int i = 0; i < deck.getSize(); i++) {
            if (i % 2 == 0) {
                player1.addCardToDeck(deck.getCardByIndex(i));
            } else {
                aiPlayer.addCardToDeck(deck.getCardByIndex(i));
            }
        }

        System.out.println(player1.getDeckSize());
        System.out.println(aiPlayer.getDeckSize());
        boolean active = true;
        Card activePlayerCard = player1.getTopCard();
        Card inActivePlayerCard = aiPlayer.getTopCard();

        while (player1.hasCards() && aiPlayer.hasCards() && isRunning) {

            if (active == true) {
                activePlayerCard = player1.getTopCard();
                inActivePlayerCard = aiPlayer.getTopCard();
            }else{
                inActivePlayerCard = player1.getTopCard();
                activePlayerCard = aiPlayer.getTopCard();
            }
            System.out.println(player1.getDeckSize());
            System.out.println(aiPlayer.getDeckSize());
            System.out.println(active);

            PrintTable print = new PrintTable(activePlayerCard, inActivePlayerCard);
            if (active == true) {
                print.printTableActivePlayer(activePlayerCard, player1);
            }else{
                print.printTableActivePlayer(activePlayerCard, aiPlayer);
            }
            int result = chooseComparatorAi(activePlayerCard, inActivePlayerCard);

            switch (result) {
                case 0:
                    player1.addCardToDeck(activePlayerCard);
                    aiPlayer.addCardToDeck(inActivePlayerCard);
                case 1:
                    player1.addCardToDeck(activePlayerCard);
                    player1.addCardToDeck(inActivePlayerCard);
                case 2:
                    aiPlayer.addCardToDeck(activePlayerCard);
                    aiPlayer.addCardToDeck(inActivePlayerCard);
                    if (active == true) {
                        active = false;
                    }else{
                        active=true;
                    }

            }
            print.printTable(activePlayerCard, inActivePlayerCard, player1, aiPlayer);
        }
    }

    public void run() throws ParserConfigurationException, SAXException, IOException {
        xmlPlayer.parse();
        deck.shuffleCards();
        deck.printCards();


        Player player1 = deck.getPlayers().get(0);
        Player player2 = deck.getPlayers().get(1);



        for (int i = 0; i < deck.getSize(); i++) {
            if (i % 2 == 0) {
                player1.addCardToDeck(deck.getCardByIndex(i));
            } else {
                player2.addCardToDeck(deck.getCardByIndex(i));
            }
        }

        System.out.println(player1.getDeckSize());
        System.out.println(player2.getDeckSize());
        boolean active = true;
        Card activePlayerCard = player1.getTopCard();
        Card inActivePlayerCard = player2.getTopCard();

        while (player1.hasCards() && player2.hasCards() && isRunning) {

           if (active == true) {
               activePlayerCard = player1.getTopCard();
               inActivePlayerCard = player2.getTopCard();
           }else{
               inActivePlayerCard = player1.getTopCard();
               activePlayerCard = player2.getTopCard();
           }
            System.out.println(player1.getDeckSize());
            System.out.println(player2.getDeckSize());
            System.out.println(active);

            PrintTable print = new PrintTable(activePlayerCard, inActivePlayerCard);
            if (active == true) {
                print.printTableActivePlayer(activePlayerCard, player1);
            }else{
                print.printTableActivePlayer(activePlayerCard, player2);
            }
            int result = chooseComparator(activePlayerCard, inActivePlayerCard);

            switch (result) {
                case 0:
                    player1.addCardToDeck(activePlayerCard);
                    player2.addCardToDeck(inActivePlayerCard);
                case 1:
                    player1.addCardToDeck(activePlayerCard);
                    player1.addCardToDeck(inActivePlayerCard);
                case 2:
                    player2.addCardToDeck(activePlayerCard);
                    player2.addCardToDeck(inActivePlayerCard);
                    if (active == true) {
                        active = false;
                    }else{
                        active=true;
                    }

            }
            print.printTable(activePlayerCard, inActivePlayerCard, player1, player2);
        }
    }

    public void addLostCardToWinnerPlayerDeck (Card card, Player player){
        Card lostCard = player.getTopCard();

    }

    public void createPlayers() {
        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();
        HumanPlayer player = new HumanPlayer(textInput);
        deck.addPlayers(player);
    }

    public void createAIPlayers(){
        AIPlayer aiPlayer = new AIPlayer("Computer");
        deck.addPlayers(aiPlayer);
    }


    public int chooseComparator(Card activePlayerCard, Card inActivePlayerCard){
        ComparatorPace comparatorPace = new ComparatorPace();
        ComparatorShooting comparatorShooting = new ComparatorShooting();
        ComparatorDribling comparatorDribling = new ComparatorDribling();
        ComparatorDefence comparatorDefence = new ComparatorDefence();

        System.out.println("Choose card stat to compare: \n1.Pace \n2.Shooting\n3.Dribbling\n4.Defending");
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
    int result = 0;
        switch (textInput){
            case "1":
                 result = comparatorPace.compare(activePlayerCard, inActivePlayerCard);
            case "2":
              result = comparatorShooting.compare(activePlayerCard, inActivePlayerCard);
            case "3":
                result = comparatorDribling.compare(activePlayerCard, inActivePlayerCard);
            case "4":
               result=  comparatorDefence.compare(activePlayerCard, inActivePlayerCard);
                break;
        }
//        scanner.close();
        return result;

    }

    public int chooseComparatorAi(Card activePlayerCard, Card inActivePlayerCard){
        ComparatorPace comparatorPace = new ComparatorPace();
        ComparatorShooting comparatorShooting = new ComparatorShooting();
        ComparatorDribling comparatorDribling = new ComparatorDribling();
        ComparatorDefence comparatorDefence = new ComparatorDefence();

//        System.out.println("Choose card stat to compare: \n1.Pace \n2.Shooting\n3.Dribbling\n4.Defending");
//        Scanner scanner = new Scanner(System.in);
//        String textInput = scanner.nextLine();
        int result = 0;
        AIPlayer aiPlayer = new AIPlayer("Computer");
        int textInput =  aiPlayer.max(activePlayerCard);
        switch (textInput){
            case 1:
                result = comparatorPace.compare(activePlayerCard, inActivePlayerCard);
            case 2:
                result = comparatorShooting.compare(activePlayerCard, inActivePlayerCard);
            case 3:
                result = comparatorDribling.compare(activePlayerCard, inActivePlayerCard);
            case 4:
                result=  comparatorDefence.compare(activePlayerCard, inActivePlayerCard);
                break;
        }
//        scanner.close();
        return result;

    }
}


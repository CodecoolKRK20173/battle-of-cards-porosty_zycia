package com.codecool.players;

import com.codecool.Card;
import com.codecool.PrintTable;
import com.codecool.UserGlobalInput;

public class PlayerController {

    boolean isRunning = true;
    UserGlobalInput playGameMenu = new UserGlobalInput();

    public PlayerController() {

    }

//    public void playGame() {
//
//        System.out.println("Enter Player One Name");
//        String playerName1 = playGameMenu.getStringInput();
//        System.out.println("Enter Player Two Name");
//        String playerName2 = playGameMenu.getStringInput();
//
//        HumanPlayer player1 = new HumanPlayer(playerName1);
//        HumanPlayer player2 = new HumanPlayer(playerName2);
//        Player activePlayer = player1;
//        Player inActivePlayer = player2;
//
//
//        while ( isRunning) {
//
//            String menuGameOption = playGameMenu.getStringInput(); // TODO: get option from user
//
//            switch (menuGameOption) {
//
//                case "1":
//                    Card activePlayerCard = activePlayer.getTopCard();
//                    Card inActivePlayerCard = inActivePlayer.getTopCard();
//
//                    //TODO show active player card - choose characteristic to play - (compare)
//
//                    PrintTable print = new PrintTable(activePlayerCard, inActivePlayerCard);
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
//                case "2":
//                    break;
//
//                case "0":
//                    isRunning = false;
//                    break;
//                default:
//                    break;
//            }
//        }
//        playGameMenu.scannerClose();
//
//    }

}

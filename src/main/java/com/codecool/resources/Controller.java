package com.codecool.resources;

import com.codecool.players.HumanPlayer;
import com.codecool.players.Player;

import java.util.Scanner;

public class Controller {
    public Deck deck;

    public Controller(){
        this.deck = new Deck();

    }
    public void menu() {
        System.out.println("Choose an option: \n1.Start Game \n2.Quit game");
        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();

        switch (textInput) {
            case "1":
                System.out.println("How many players: ");
                int count = scan.nextInt();
                for (int i = 0; i < count; i++) {
                    System.out.println("Player" + (i + 1) + " Please input your name: ");
                    setPlayers();
               }
//                game();
            case "2":
                break;
        }
    }
    public void setPlayers() {
        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();
        HumanPlayer player = new HumanPlayer(textInput);
        deck.addPlayers(player);
    }
}

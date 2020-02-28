package com.codecool.services;

import com.codecool.Card;
import com.codecool.players.Player;
import com.github.tomaslanger.chalk.Chalk;


public class PrintTable {
    private Card activePlayerCard;
    private Card inactivePlayerCard;



    public PrintTable(){

    }

    public PrintTable(Card activePlayerCard, Card inactivePlayerCard){
        this.activePlayerCard = activePlayerCard;
        this.inactivePlayerCard =inactivePlayerCard;

    }

    public void printTitle() {

        System.out.println("\n" + Color.BLUE +
                "                                      \n\n\n\n\n\n" +
                "                                                   ██████╗  █████╗ ████████╗████████╗██╗     ███████╗     ██████╗ ███████╗     ██████╗ █████╗ ██████╗ ██████╗ ███████╗\n" +
                "                                                   ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝    ██╔═══██╗██╔════╝    ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "                                                   ██████╔╝███████║   ██║      ██║   ██║     █████╗      ██║   ██║█████╗      ██║     ███████║██████╔╝██║  ██║███████╗\n" +
                "                                                   ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝      ██║   ██║██╔══╝      ██║     ██╔══██║██╔══██╗██║  ██║╚════██║\n" +
                "                                                   ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗    ╚██████╔╝██║         ╚██████╗██║  ██║██║  ██║██████╔╝███████║\n" +
                "                                                   ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝     ╚═════╝ ╚═╝          ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝\n" +
                "                                                                                                                                                             \n" +
                "                                                                                                                                                               " +
                "" + Color.RESET);
    }

    public void printTable(Card activePlayerCard, Card inactivePlayerCard, Player activePlayer, Player inactivePlayer) {


        String format = "                                               |%-32s %2s| %-30s |%-32s %2s|";

        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Player cards: "+ activePlayer.getDeckSize(), "","----------------------------------------------", "Player Cards: " + inactivePlayer.getDeckSize(), "");
        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Player name: < "+ activePlayer.getName() , " ","----------------------------------------------", "Player name: < " + inactivePlayer.getName() , " ");
        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "----------------------------------------------", "Card Id: ", inactivePlayerCard.getId());
        System.out.println();
        System.out.printf(format, Chalk.on(activePlayerCard.getName()).green(), "            ", "----------------------------------------------", Chalk.on(inactivePlayerCard.getName()).green(),"            ");
        System.out.println();
        System.out.printf(format, "Pace:", activePlayerCard.getPace(), "----------------------------------------------", "Pace: ", inactivePlayerCard.getPace(),"");
        System.out.println();
        System.out.printf(format, "Shooting:", activePlayerCard.getShooting(), "----------------------------------------------", "Shooting", inactivePlayerCard.getShooting(),"");
        System.out.println();
        System.out.printf(format, "Dribbling:", activePlayerCard.getDribbling(), "----------------------------------------------", "Dribbling", inactivePlayerCard.getDribbling(),"");
        System.out.println();
        System.out.printf(format, "Defending:", activePlayerCard.getDefending(), "----------------------------------------------", "Defending", inactivePlayerCard.getDefending(),"");
        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");


    }
    public void printTableActivePlayer(Card activePlayerCard, Player activePlayer) {

        String format = "                                               |%-32s %-2s|";
//        System.out.printf(format, "\n\n\nWon round name: < " + activePlayer.getName(), "\n", "\n", "\n", "");

        System.out.println("\n                                               |-----------------------------------|");
        System.out.printf(format, "Player cards: "+ activePlayer.getDeckSize(), "","----------------------------------------------");
        System.out.println("\n                                               |-----------------------------------|");
        System.out.printf(format, "Player name: < " + activePlayer.getName(), "", "", "", "");
        System.out.println("\n                                               |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "", "", "", "");
        System.out.println();
        System.out.printf(format, Chalk.on(activePlayerCard.getName()).red(), "            ", "", "", "");
        System.out.println();
        System.out.printf(format, "Pace:", activePlayerCard.getPace(), "", "", "", "");
        System.out.println();
        System.out.printf(format, "Shooting:", activePlayerCard.getShooting(), "", "","");
        System.out.println();
        System.out.printf(format, "Dribbling:", activePlayerCard.getDribbling(), "", "", "", "");
        System.out.println();
        System.out.printf(format, "Defending:", activePlayerCard.getDefending(), "", "", "", "");
        System.out.println("\n                                               |-----------------------------------|");
    }

    public void spaceForScreen() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void winPrint(Player activePlayer) {
        System.out.println("\n" +
                "\n\n\n                                                                       ██╗    ██╗██╗███╗   ██╗███╗   ██╗███████╗██████╗     ██╗███████╗   \n" +
                "                                                                       ██║    ██║██║████╗  ██║████╗  ██║██╔════╝██╔══██╗    ██║██╔════╝██╗\n" +
                "                                                                       ██║ █╗ ██║██║██╔██╗ ██║██╔██╗ ██║█████╗  ██████╔╝    ██║███████╗╚═╝\n" +
                "                                                                       ██║███╗██║██║██║╚██╗██║██║╚██╗██║██╔══╝  ██╔══██╗    ██║╚════██║██╗\n" +
                "                                                                       ╚███╔███╔╝██║██║ ╚████║██║ ╚████║███████╗██║  ██║    ██║███████║╚═╝\n" +
                "                                                                        ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝    ╚═╝╚══════╝   \n" +
                "                                                                                           \n" +
                "                                                                                           " + activePlayer.getName());
    }
}



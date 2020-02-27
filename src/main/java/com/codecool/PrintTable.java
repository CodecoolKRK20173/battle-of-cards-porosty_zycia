package com.codecool;

import com.codecool.players.Player;
import com.github.tomaslanger.chalk.Chalk;


public class PrintTable {

    private Card activePlayerCard;
    private Card inactivePlayerCard;

    public PrintTable(Card activePlayerCard, Card inactivePlayerCard) {

    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void printMenuOptions() {
        System.out.println("" +
                "\n\n\n" +
                "                                                   \n\n" +
                "                                                                                    Please choose from one of the following options\n\n" +
                "                                                                                                   (1) Start GAME\n" +
                "         Where is Pioter ?                                                                         (2) Show Result\n" +
                "                                                                                                   (0) Exit Game\n\n\n");
    }

    public void printGameMenuOptions() {
        System.out.println("" +
                "\n\n\n" +
                "                                                   \n\n" +
                "                                                                                    Please choose from one of the following options\n\n" +
                "                                                                                                   (1) Play PACE\n" +
                "         Where is Pioter ?                                                                         (2) Play SHOOTING\n" +
                "                                                                                                   (3) Play Dribbling\n\n\n" +
                "                                                                                                   (4) Play Defending\n\n\n" +
                "                                                                                                   (0) Exit Game\n\n\n");
    }




    public void printTitle() {

        System.out.println("\n" +
                "                                      \n\n\n\n\n\n" +
                "                                                   ██████╗  █████╗ ████████╗████████╗██╗     ███████╗     ██████╗ ███████╗     ██████╗ █████╗ ██████╗ ██████╗ ███████╗\n" +
                "                                                   ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝    ██╔═══██╗██╔════╝    ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "                                                   ██████╔╝███████║   ██║      ██║   ██║     █████╗      ██║   ██║█████╗      ██║     ███████║██████╔╝██║  ██║███████╗\n" +
                "                                                   ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝      ██║   ██║██╔══╝      ██║     ██╔══██║██╔══██╗██║  ██║╚════██║\n" +
                "                                                   ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗    ╚██████╔╝██║         ╚██████╗██║  ██║██║  ██║██████╔╝███████║\n" +
                "                                                   ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝     ╚═════╝ ╚═╝          ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝\n" +
                "                                                                                                                                                             \n" +
                "                                                                                                                                                               " +
                "");
    }

    public void printTable(Card activePlayerCard, Card inactivePlayerCard) {

        String format = "                                               |%-32s %2s| %-22s |%-32s %2s|";







        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.println("                                               |----------< PLAYER ONE >-----------|                                                |------------< PLAYER TWO >---------|");
        System.out.println("                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "----------------------------------------------", "Card Id: ", inactivePlayerCard.getId());
        System.out.println();
        System.out.printf(format, Chalk.on(activePlayerCard.getName()).red(), "            ", "----------------------------------------------", Chalk.on(inactivePlayerCard.getName()).red(),"            ");
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

        String format = "                                               |%-40s %2s| %-22s ";







        System.out.println("\n                                               |-----------------------------------|");
        System.out.println("                                               |----------<" + activePlayer.getName() + ">-----------|");
        System.out.println("                                               |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "", "", "");
        System.out.println();
        System.out.printf(format, Chalk.on(activePlayerCard.getName()).red(), "", "", "", "");
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



}

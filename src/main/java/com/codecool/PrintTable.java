package com.codecool;

import com.codecool.players.Player;
import com.github.tomaslanger.chalk.Chalk;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;

public class PrintTable {
    private Card activePlayerCard;
    private Card inactivePlayerCard;
    private Color color;

    public PrintTable(){

    }

    public PrintTable(Card activePlayerCard, Card inactivePlayerCard){
        this.activePlayerCard = activePlayerCard;
        this.inactivePlayerCard =inactivePlayerCard;

    }

    public void printTitle() {

        System.out.println("\n" +
                "                                      \n\n\n\n\n\n" +
                "                                          ██████╗  █████╗ ████████╗████████╗██╗     ███████╗     ██████╗ ███████╗     ██████╗ █████╗ ██████╗ ██████╗ ███████╗\n" +
                "                                          ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝    ██╔═══██╗██╔════╝    ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
                "                                          ██████╔╝███████║   ██║      ██║   ██║     █████╗      ██║   ██║█████╗      ██║     ███████║██████╔╝██║  ██║███████╗\n" +
                "                                          ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝      ██║   ██║██╔══╝      ██║     ██╔══██║██╔══██╗██║  ██║╚════██║\n" +
                "                                          ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗    ╚██████╔╝██║         ╚██████╗██║  ██║██║  ██║██████╔╝███████║\n" +
                "                                          ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝     ╚═════╝ ╚═╝          ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚══════╝\n" +
                "                                                                                                                                                             \n" +
                "                                                                                                                                                               " +
                "");
    }

    public void printTable(Card activePlayerCard, Card inactivePlayerCard, Player activePlayer, Player inactivePlayer, int chooseStat, Player winner) {
        System.out.println(activePlayer.getDeck().size());
        System.out.println(inactivePlayer.getDeck().size());

        String format = "                                               |%-32s %2s| %-30s |%-32s %2s|";
        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Player name: < "+ activePlayer.getName(), "","----------------------------------------------", "Player name: < " + inactivePlayer.getName(), "");
        System.out.println("\n                                               |-----------------------------------|                                                |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "----------------------------------------------", "Card Id: ", inactivePlayerCard.getId());
        System.out.println();
        System.out.printf(format, activePlayerCard.getName(), "", "----------------------------------------------", inactivePlayerCard.getName(),"");
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



}



package com.codecool;

import com.codecool.*;
import com.codecool.parser.XmlPlayer;
import com.github.tomaslanger.chalk.Chalk;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintTable {

    public PrintTable() {

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

    public void printTable() throws ParserConfigurationException, SAXException, IOException {
        XmlPlayer xmlPlayer = new XmlPlayer();
        xmlPlayer.parse();
        xmlPlayer.getCards();

        int player1 = 15;
        int player2 = 22;

        String format = "                                               |%-22s %2s| %-22s |%-22s %2s|";







        System.out.println("\n                                               |-------------------------|                                             |-------------------------|");
        System.out.printf(format, "Card Id: ", xmlPlayer.getCards().get(player1).getId(), "-------------------------------------------", "Card Id: ", xmlPlayer.getCards().get(player2).getId());
        System.out.println();
        System.out.printf(format, Chalk.on(xmlPlayer.getCards().get(player1).getName()).red(), "            ", "-------------------------------------------", Chalk.on(xmlPlayer.getCards().get(player2).getName()).red(),"      ");
        System.out.println();
        System.out.printf(format, "Pace:", xmlPlayer.getCards().get(player1).getPace(), "-------------------------------------------", "Pace: ", xmlPlayer.getCards().get(player2).getPace(),"");
        System.out.println();
        System.out.printf(format, "Shooting:", xmlPlayer.getCards().get(player1).getShooting(), "-------------------------------------------", "Shooting", xmlPlayer.getCards().get(player2).getPace(),"");
        System.out.println();
        System.out.printf(format, "Dribbling:", xmlPlayer.getCards().get(player1).getDribbling(), "-------------------------------------------", "Dribbling", xmlPlayer.getCards().get(player2).getDribbling(),"");
        System.out.println();
        System.out.printf(format, "Defending:", xmlPlayer.getCards().get(player1).getDefending(), "-------------------------------------------", "Defending", xmlPlayer.getCards().get(player2).getDefending(),"");
        System.out.println("\n                                               |-------------------------|                                             |-------------------------|");


    }



}

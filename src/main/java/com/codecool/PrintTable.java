package com.codecool;

import com.github.tomaslanger.chalk.Chalk;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class PrintTable {

    private Card activePlayerCard;
    private Card inactivePlayerCard;

    public PrintTable(Card activePlayerCard, Card inactivePlayerCard) {

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

    public void printTable(Card activePlayerCard, Card inactivePlayerCard) throws ParserConfigurationException, SAXException, IOException {

        String format = "                                               |%-32s %2s| %-22s |%-32s %2s|";







        System.out.println("\n                                               |-----------------------------------|                                             |-----------------------------------|");
        System.out.println("                                               |----------< PLAYER ONE >-----------|                                             |------------< PLAYER TWO >---------|");
        System.out.println("                                               |-----------------------------------|                                             |-----------------------------------|");
        System.out.printf(format, "Card Id: ", activePlayerCard.getId(), "-------------------------------------------", "Card Id: ", inactivePlayerCard.getId());
        System.out.println();
        System.out.printf(format, Chalk.on(activePlayerCard.getName()).red(), "            ", "-------------------------------------------", Chalk.on(inactivePlayerCard.getName()).red(),"            ");
        System.out.println();
        System.out.printf(format, "Pace:", activePlayerCard.getPace(), "-------------------------------------------", "Pace: ", inactivePlayerCard.getPace(),"");
        System.out.println();
        System.out.printf(format, "Shooting:", activePlayerCard.getShooting(), "-------------------------------------------", "Shooting", inactivePlayerCard.getShooting(),"");
        System.out.println();
        System.out.printf(format, "Dribbling:", activePlayerCard.getDribbling(), "-------------------------------------------", "Dribbling", inactivePlayerCard.getDribbling(),"");
        System.out.println();
        System.out.printf(format, "Defending:", activePlayerCard.getDefending(), "-------------------------------------------", "Defending", inactivePlayerCard.getDefending(),"");
        System.out.println("\n                                               |-----------------------------------|                                             |-----------------------------------|");


    }



}

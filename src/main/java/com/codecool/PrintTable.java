package com.codecool;

import com.codecool.*;
import com.codecool.parser.XmlPlayer;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintTable {

    public PrintTable() {

    }

    public void printTable() throws ParserConfigurationException, SAXException, IOException {
        XmlPlayer xmlPlayer = new XmlPlayer();
        xmlPlayer.parse();
        xmlPlayer.getCards();

        String format = "                                            |%-22s %2s| %-22s |%-22s %2s|";
        System.out.println("\n                                            |-------------------------|                                             |-------------------------|");
        System.out.printf(format, "Name: ", "", "-------------------------------------------", "Name: ", "");
        System.out.println();
        System.out.printf(format, xmlPlayer.getCards().get(1).getName(), "", "-------------------------------------------", xmlPlayer.getCards().get(2).getName(),"");
        System.out.println();
        System.out.printf(format, "Pace:", xmlPlayer.getCards().get(1).getPace(), "-------------------------------------------", "Pace: ", xmlPlayer.getCards().get(2).getPace(),"");
        System.out.println();
        System.out.printf(format, "Shooting:", xmlPlayer.getCards().get(1).getShooting(), "-------------------------------------------", "Shooting", xmlPlayer.getCards().get(2).getPace(),"");
        System.out.println();
        System.out.printf(format, "Dribbling:", xmlPlayer.getCards().get(1).getDribbling(), "-------------------------------------------", "Dribbling", xmlPlayer.getCards().get(2).getDribbling(),"");
        System.out.println();
        System.out.printf(format, "Defending:", xmlPlayer.getCards().get(1).getDefending(), "-------------------------------------------", "Defending", xmlPlayer.getCards().get(2).getDefending(),"");
        System.out.println("\n                                            |-------------------------|                                             |-------------------------|");


    }



}

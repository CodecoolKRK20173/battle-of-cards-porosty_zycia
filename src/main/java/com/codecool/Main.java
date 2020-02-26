package com.codecool;

import com.codecool.parser.XmlCard;
import com.codecool.resources.Controller;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
            XmlCard xmlCard = new XmlCard();
           xmlCard.parse();
        Controller controller = new Controller();
        controller.menu();
        controller.setPlayers();





            //ESProvider esProvider = new ESProvider(ruleParser,  factParser);
            //esProvider.collectAnswers();

          //  ArrayList<Player> facts = factParser
	// write your code here
    }
}

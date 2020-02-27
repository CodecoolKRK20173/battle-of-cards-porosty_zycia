package com.codecool;

import com.codecool.parser.GameController;
import com.codecool.parser.XmlCard;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        XmlCard xmlCard = new XmlCard();
        xmlCard.parse();
        GameController gameController = new GameController(xmlCard);
        gameController.menu();
//        game.run();
    }
}

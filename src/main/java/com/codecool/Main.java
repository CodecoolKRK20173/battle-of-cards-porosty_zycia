package com.codecool;

import com.codecool.parser.GameController;
import com.codecool.parser.XmlPlayer;
import com.codecool.players.Deck;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        GameController game = new GameController();
        game.run();


    }
}

package com.codecool;

import com.codecool.parser.XmlPlayer;
import com.codecool.players.Deck;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {


            PrintTable printTable = new PrintTable();
            printTable.printTable();

        Deck deck = new Deck();
        deck.shuffleCards();
        printTable.printHands();


            //ESProvider esProvider = new ESProvider(ruleParser,  factParser);
            //esProvider.collectAnswers();

          //  ArrayList<Player> facts = factParser
	// write your code here
    }
}

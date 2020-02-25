package com.codecool;

import com.codecool.parser.XmlPlayer;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
            XmlPlayer xmlPlayer = new XmlPlayer();
           xmlPlayer.parse();




            //ESProvider esProvider = new ESProvider(ruleParser,  factParser);
            //esProvider.collectAnswers();

          //  ArrayList<Player> facts = factParser
	// write your code here
    }
}

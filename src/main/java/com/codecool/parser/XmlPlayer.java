package com.codecool.parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import com.codecool.Card;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlPlayer extends XmlParser {

    List<Card> cards = new ArrayList<Card>();


    public List<Card> getCards() {

        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    public void parse() throws IOException, SAXException, ParserConfigurationException {
        File fXmlFile = new File("src/com/codecool/resources/players.xml");
       // "/Users/mzi/Desktop/zADANIA/battle-of-cards-porosty_zycia1/BattleCards/src/com/codecool/resources/players.xml"
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();

//        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("player");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

//            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;


                int id = Integer.parseInt(eElement.getAttribute("id"));
                String name = eElement.getElementsByTagName("name").item(0).getTextContent();
                int pace = Integer.parseInt(eElement.getElementsByTagName("pace").item(0).getTextContent());
                int shooting = Integer.parseInt(eElement.getElementsByTagName("shooting").item(0).getTextContent());
                int dribbling = Integer.parseInt(eElement.getElementsByTagName("dribling").item(0).getTextContent());
                int defending = Integer.parseInt(eElement.getElementsByTagName("defending").item(0).getTextContent());

                Card card = new Card(id, name, pace, shooting, dribbling, defending);

                cards.add(card);

//                System.out.println("Cards id : " + eElement.getAttribute("id"));
//                System.out.println("First Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
//                System.out.println("Pace : " + eElement.getElementsByTagName("pace").item(0).getTextContent());
//                System.out.println("Shooting : " + eElement.getElementsByTagName("shooting").item(0).getTextContent());
//                System.out.println("Dribling : " + eElement.getElementsByTagName("dribling").item(0).getTextContent());
//                System.out.println("Defending : " + eElement.getElementsByTagName("defending").item(0).getTextContent());
            }
        }

        for (Card card : cards) {
            System.out.println(card.getName());
            System.out.println(card.getPace());
            System.out.println(card.getShooting());
            System.out.println(card.getDribbling());
            System.out.println(card.getDefending());


        }
        Card card = cards.get(4);
        int value = card.getName().length()/2;
        int valueSpace = value + 3;
        String star = " * ";
        String a = " ";
        for (int i = 0; i < valueSpace; ++i){
            a += " ";
        }


        for (int i = 0 ; i < value +2; ++i) {
            System.out.print(star);
        }
        System.out.println();
        System.out.println(" * Player : " + card.getName() + star);
        System.out.println(" *  P a c  e : " + card.getPace() + a + star);
        System.out.println(" *  Shooting : " +card.getShooting() + a + star);
        System.out.println(" *  Dribling : " + card.getDribbling() + a + star);
        System.out.println(" * Defensing : " + card.getDefending() + a + star);
        for (int i = 0 ; i < value + 2; ++i) {
            System.out.print(star);
        }
    }
}
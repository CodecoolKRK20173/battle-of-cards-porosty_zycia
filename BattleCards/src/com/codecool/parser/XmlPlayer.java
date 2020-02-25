package com.codecool.parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class XmlPlayer extends XmlParser {


    public void parse() throws IOException, SAXException, ParserConfigurationException {
        File fXmlFile = new File("/home/michal/IdeaProjects/battle-of-cards-porosty_zycia/BattleCards/src/com/codecool/resources/players.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("player");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                System.out.println("Cards id : " + eElement.getAttribute("id"));
                System.out.println("First Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Pace : " + eElement.getElementsByTagName("pace").item(0).getTextContent());
                System.out.println("Shooting : " + eElement.getElementsByTagName("shooting").item(0).getTextContent());
                System.out.println("Dribling : " + eElement.getElementsByTagName("dribling").item(0).getTextContent());
                System.out.println("Defending : " + eElement.getElementsByTagName("defending").item(0).getTextContent());
            }
        }
    }
}
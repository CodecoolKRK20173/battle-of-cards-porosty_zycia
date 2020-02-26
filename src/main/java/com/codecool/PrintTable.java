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
        System.out.println(xmlPlayer.getCards().get(1).getName());
        System.out.println(xmlPlayer.getCards().get(1).getDefending());
        System.out.println(xmlPlayer.getCards().get(1).getDribbling());
        System.out.println(xmlPlayer.getCards().get(1).getPace());
        System.out.println(xmlPlayer.getCards().get(1).getShooting());



    }

//    Card card = cards.get(4);
//    int value = card.getName().length()/2;
//    int valueSpace = value + 3;
//    String star = " * ";
//    String a = " ";
//        for (int i = 0; i < valueSpace; ++i){
//        a += " ";
//    }
//
//
//        for (int i = 0 ; i < value +2; ++i) {
//        System.out.print(star);
//    }
//        System.out.println();
//        System.out.println(" * Player : " + card.getName() + star);
//        System.out.println(" *  P a c  e : " + card.getPace() + a + star);
//        System.out.println(" *  Shooting : " +card.getShooting() + a + star);
//        System.out.println(" *  Dribling : " + card.getDribbling() + a + star);
//        System.out.println(" * Defensing : " + card.getDefending() + a + star);
//        for (int i = 0 ; i < value + 2; ++i) {
//        System.out.print(star);
//    }


//        for (Card card : cards) {
//        System.out.println(card.getName());
//        System.out.println(card.getPace());
//        System.out.println(card.getShooting());
//        System.out.println(card.getDribbling());
//        System.out.println(card.getDefending());
//
//
//    }

}

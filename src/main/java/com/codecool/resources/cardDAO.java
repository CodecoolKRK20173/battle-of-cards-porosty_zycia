package com.codecool.resources;

import com.codecool.Card;
import com.codecool.players.Player;
import com.codecool.xmlDAO;
import java.util.ArrayList;
import java.util.List;

public class cardDAO implements xmlDAO {

    List<Card> cards;

    @Override
    public List<Card> getAllCards() {
        return null;
    }

    @Override
    public Player getPlayer(int id) {
        return null;
    }

    public void cardDAOImplement() {
        cards = new ArrayList<Card>();

    }
}

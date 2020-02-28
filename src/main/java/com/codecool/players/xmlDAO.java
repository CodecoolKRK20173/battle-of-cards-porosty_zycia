package com.codecool.players;

import com.codecool.Card;
import com.codecool.players.Player;

import java.util.List;

public interface xmlDAO {

    public List<Card> getAllCards();
    public Player getPlayer(int id);

}

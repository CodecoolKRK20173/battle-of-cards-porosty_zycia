package com.codecool;

import com.codecool.players.Player;

import java.util.List;

public interface xmlDAO {

    public List<Card> getAllCards();
    public Player getPlayer(int id);

}

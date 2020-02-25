package com.codecool;

public class Card {
    public String name;
    public int pace;
    public int shooting;
    public int dribbling;
    public int defending;

    public Card(String name, int pace, int shooting, int dribbling, int defending){
        this.name = name;
        this.pace = pace;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.defending = defending;
    }
    public String getName() {
        return name;
    }

    public int getPace() {
        return pace;
    }

    public int getShooting() {
        return shooting;
    }

    public int getDribbling() {
        return dribbling;
    }

    public int getDefending() {
        return defending;
    }

}

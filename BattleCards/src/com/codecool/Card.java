package com.codecool;

public class Card {
    private int id;
    private String name;
    private int pace;
    private int shooting;
    private int dribbling;
    private int defending;

    public Card(int id, String name, int pace, int shooting, int dribbling, int defending) {
        this.id = id;
        this.name = name;
        this.pace = pace;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.defending = defending;
    }

    public int getId() {
        return id;
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

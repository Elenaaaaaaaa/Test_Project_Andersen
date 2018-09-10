package com.com.andersen.game;

public abstract class All_capabilities {
    private double health = 100;
    private boolean isBuffed;
    private String name = "person";
    private Race race;


    public All_capabilities(boolean isBuffed, Race race) {
        this.isBuffed = isBuffed;
        this.race = race;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double setHealth(double health) {
        this.health = health;
        return health;
    }

    public boolean isBuffed() {
        return isBuffed;
    }

    public boolean setBuffed(boolean buffed) {
        isBuffed = buffed;
        return buffed;
    }

    public boolean isLive () {
        return health > 0;
    }

}

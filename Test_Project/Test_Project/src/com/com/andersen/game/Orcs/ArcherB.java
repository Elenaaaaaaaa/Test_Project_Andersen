package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class ArcherB extends All_capabilities implements Shooting, Melee {
    Read_name rf = new Read_name();

    public ArcherB() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Лучник (Орк) - " + rf.readNameFromFile());
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (isBuffed()) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 4);
        } else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2 HP)");
            return target.setHealth(target.getHealth() - 2);
        }


    }

    @Override
    public double shootSkill(All_capabilities target) {
        if (isBuffed() == true) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 6 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 6);
        } else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3 HP)");
            return target.setHealth(target.getHealth() - 3);
        }
    }
}
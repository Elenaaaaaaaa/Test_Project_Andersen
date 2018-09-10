package com.com.andersen.game.People;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;


public class Arbalester extends All_capabilities implements Shooting, Melee {
    Read_name rf = new Read_name();

    public Arbalester() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Арбалетчик (Человек) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double shootSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2.5 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 2.5);
        } else {
            System.out.println("Выстрел из арбалета от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 5 HP)");
            return target.setHealth(target.getHealth() - 5);
        }


    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 1.5 HP)");

            setBuffed(false);
            return target.setHealth(target.getHealth() - 1.5);
        }
     else{
            System.out.println("Атака от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3 HP)");
            return target.setHealth(target.getHealth() - 3);
        }
    }
}


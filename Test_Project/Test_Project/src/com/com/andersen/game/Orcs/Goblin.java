package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class Goblin extends All_capabilities implements Melee {
    Read_name rf = new Read_name();

    public Goblin() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Гоблин (Орк) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (isBuffed()) {
            System.out.println("Атака дубинкой: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 30 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 30);
        }
        else {
            System.out.println("Атака дубинкой от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 20 HP)");
            return target.setHealth(target.getHealth() - 20);
        }
    }

}

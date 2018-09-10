package com.com.andersen.game.Undead;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class Zombie extends All_capabilities implements Melee {
    Read_name rf = new Read_name();

    public Zombie() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Зомби (Зомби) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (isBuffed() == true) {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 36 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 36);
        } else {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 18 HP)");
            return target.setHealth(target.getHealth() - 18);
        }

    }
}

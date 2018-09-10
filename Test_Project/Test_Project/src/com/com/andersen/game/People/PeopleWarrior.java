package com.com.andersen.game.People;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class PeopleWarrior extends All_capabilities implements Melee {
    Read_name rf = new Read_name();

    public PeopleWarrior() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Воин (Человек) - " + rf.readNameFromFile() + " ");
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 9 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 9);
        } else {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 18 HP)");
            return target.setHealth(target.getHealth() - 18);
        }
    }
}

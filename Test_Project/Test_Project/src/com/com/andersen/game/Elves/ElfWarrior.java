package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class ElfWarrior extends All_capabilities implements Melee {
    Read_name rf = new Read_name();

     public ElfWarrior() {
         super(false, Race.elf);
     }

    @Override
    public String setName(String name) {
        return super.setName("Воин (Эльф) - " + rf.readNameFromFile());
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 7.5 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 7.5);
        } else {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 15 HP)");
            return target.setHealth(target.getHealth() - 15);
        }
    }
}

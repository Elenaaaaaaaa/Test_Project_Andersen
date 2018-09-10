package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Capabilities.Shooting;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class ElfArcher extends All_capabilities implements Shooting, Melee {
    public ElfArcher() {
        super(false, Race.elf);
    }
    Read_name rf = new Read_name();


    @Override
    public String setName(String name) {
        return super.setName("Лучник (Эльф) - " + rf.readNameFromFile());
    }


    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            setBuffed(false);
            return target.setHealth(target.getHealth() - 1.5);
        } else {
            return target.setHealth(target.getHealth() - 3);
        }


    }

    @Override
    public double shootSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3.5 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 3.5);
        } else {
            System.out.println("Выстрел из лука от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 7 HP)");
            return target.setHealth(target.getHealth() - 7);
        }


    }

}

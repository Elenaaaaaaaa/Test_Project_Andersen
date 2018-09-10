package com.com.andersen.game.Undead;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.Ailment;
import com.com.andersen.game.Capabilities.Melee;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class Necromancer extends All_capabilities implements Melee, Ailment {
    Read_name rf = new Read_name();

    public Necromancer() {
        super(false, Race.undead);
    }

    @Override
    public String setName(String name) {
        return super.setName("Некромант (Зомби) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double meleeSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака магией от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 5 HP)");
            return target.setHealth(target.getHealth() - 5);
        } else {
            System.out.println("Атака магией от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 10 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 10);
        }
    }

    @Override
    public boolean Ailment(All_capabilities target) {
        System.out.println("Нанесение недуга от: " + setName(getName()) + "на персонажа: " + target.setName(getName()) + " -50% от урона");
        return target.setBuffed(true);
    }


}


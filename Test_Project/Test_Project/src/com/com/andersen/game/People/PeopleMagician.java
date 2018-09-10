package com.com.andersen.game.People;


import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicDarkSupport;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class PeopleMagician extends All_capabilities implements MagicDarkSupport, MagicDamage {
    Read_name rf = new Read_name();

    public PeopleMagician() {
        super(false, Race.people);
    }

    @Override
    public String setName(String name) {
        return super.setName("Маг (Человек) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double magicDamageSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака мечом от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 2);
        }
        else {
            System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4 HP)");
            return target.setHealth(target.getHealth() -4);
    }

    }

    @Override
    public double magicDarkSupport(All_capabilities target) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + target.setName(getName()) + " - (+10% HP)");
        return target.setHealth((target.getHealth()) + (target.getHealth() * 0.10));
    }
}

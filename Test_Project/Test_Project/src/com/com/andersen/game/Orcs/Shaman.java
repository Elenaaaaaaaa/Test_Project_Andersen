package com.com.andersen.game.Orcs;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class Shaman extends All_capabilities implements MagicSupport, MagicDamage {
    Read_name rf = new Read_name();

    public Shaman() {
        super(false, Race.orcs);
    }

    @Override
    public String setName(String name) {
        return super.setName("Шаман (Орк) - " + rf.readNameFromFile() + " ");
    }

    @Override
    public double magicDamageSkill(All_capabilities target) {
        if (isBuffed()) {
            System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 9 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 9);
        } else {
            System.out.println("Атака магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 6 HP)");
            return target.setHealth(target.getHealth() - 6);
        }
    }

    @Override
    public boolean magicSupportSkill(All_capabilities target) {
        System.out.println("Наложение баффа от: " + setName(getName()) + "на персонажа: " + target.setName(getName()) + "+50% к урону");
        return target.setBuffed(true);
    }
}

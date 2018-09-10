package com.com.andersen.game.Elves;

import com.com.andersen.game.All_capabilities;
import com.com.andersen.game.Capabilities.MagicDamage;
import com.com.andersen.game.Capabilities.MagicDarkSupport;
import com.com.andersen.game.Capabilities.MagicSupport;
import com.com.andersen.game.Race;
import com.com.andersen.game.Read_name;

public class ElfMagician extends All_capabilities implements MagicDarkSupport, MagicDamage {
    Read_name rf = new Read_name();

    public ElfMagician() {
        super(false, Race.elf);
    }

    @Override
    public String setName(String name) {
        return super.setName("Маг (Эльф) - " + rf.readNameFromFile());
    }

    @Override
    public double magicDamageSkill(All_capabilities target) {
        if (this.isBuffed()) {
            System.out.println("Атака магией от : " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 5 HP)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 5);
        } else {
            System.out.println("Атака магией от : " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 10 HP)");
            return target.setHealth(target.getHealth() - 10);
        }

    }


    @Override
    public double magicDarkSupport(All_capabilities target) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + target.setName(getName()) + " - (+25% HP)");
        return target.setHealth((target.getHealth()) + (target.getHealth() * 0.25));
    }

    }



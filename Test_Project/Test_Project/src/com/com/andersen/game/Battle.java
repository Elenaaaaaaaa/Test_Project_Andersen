package com.com.andersen.game;

import com.com.andersen.game.Elves.ElfArcher;
import com.com.andersen.game.Elves.ElfMagician;
import com.com.andersen.game.Elves.ElfWarrior;
import com.com.andersen.game.Orcs.ArcherB;
import com.com.andersen.game.Orcs.Goblin;
import com.com.andersen.game.Orcs.Shaman;
import com.com.andersen.game.People.Arbalester;
import com.com.andersen.game.People.PeopleMagician;
import com.com.andersen.game.People.PeopleWarrior;
import com.com.andersen.game.Undead.Hunter;
import com.com.andersen.game.Undead.Necromancer;
import com.com.andersen.game.Undead.Zombie;

import javax.lang.model.util.ElementFilter;
import java.util.List;
import java.util.Random;

public class Battle extends Detachments{
    Detachments detachments = new Detachments();

    Random random = new Random();
    int setRandDetachments = random.nextInt(5-1) + 1;


    public All_capabilities goalLightSide () {
        if (setRandDetachments == 1) {
            return getNewElves();
        }
        else if (setRandDetachments == 2) {
            return getNewElves();
        } else if (setRandDetachments == 3) {
            return getNewPeople();
        } else if (setRandDetachments == 4) {
            return getNewPeople();
        } else
            return goalLightSide();
    }

    public All_capabilities goalDarkSide () {
        if (setRandDetachments == 1) {
            return getNewOcrs();
        }
        else if (setRandDetachments == 2) {
            return getNewUndead();
        } else if (setRandDetachments == 3) {
            return getNewOcrs();
        } else if (setRandDetachments == 4) {
            return getNewUndead();
        } else
            return goalDarkSide();
    }


    public void generateSquads(){

        System.out.println(setRandDetachments);

        if (setRandDetachments == 1) {
            for (int i = 0; i < 8; i++) {
                generateElves();
                generateOrcs();
            }
            System.out.println("Эльфы и Орки начинают игру");
            while (getNewElves().isLive() && getNewOcrs().isLive()) {
                retMethodElves();
                retMethodOrcs();
            }
            if (!getNewElves().isLive()) {
                System.err.println("Отряд Эльфов проиграл (все умерли)");
            }
            else
            {
                System.err.println("Отряд Орков проиграл (все умерли)");
            }
        }

        if (setRandDetachments == 2) {
            for (int i = 0; i < 8; i++) {
                generateElves();
                generateUndead();
            }
            System.out.println("Эльфы и Нежить начинают игру");
            while (getNewElves().isLive() && getNewUndead().isLive()) {
                retMethodElves();
                retMethodUndead();
            }
            if (!getNewElves().isLive()) {
                System.err.println("Отряд Эльфов проиграл (все умерли)");
            }
            else
            {
                System.err.println("Отряд Нежити проиграл (все умерли)");
            }
        }

        if (setRandDetachments == 3) {
            for (int i = 0; i < 8; i++) {
                generatePeople();
                generateOrcs();
            }
            System.out.println("Люди и Орки начинают игру");
            while (getNewPeople().isLive() && getNewOcrs().isLive()) {
                retMethodPeople();
                retMethodOrcs();
            }
            if (!getNewPeople().isLive()) {
                System.err.println("Отряд Людей проиграл (все умерли)");
            }
            else
            {
                System.err.println("Отряд Орков проиграл (все умерли)");
            }
        }


        if (setRandDetachments == 4)
        {
            for (int i = 0; i < 8; i++) {
                generatePeople();
                generateUndead();
            }
            System.out.println("Люди и Нежить начинают игру");
            while (getNewPeople().isLive() && getNewUndead().isLive()) {
                retMethodPeople();
                retMethodUndead();
            }
            if (!getNewPeople().isLive()) {
                System.err.println("Отряд Людей проиграл (все умерли)");
            }
            else
            {
                System.err.println("Отряд Нежити проиграл (все умерли)");
            }
        }
    }

        public double retMethodElves () {
        int setdetachmentElves = random.nextInt(3-1) + 1;
        if (getNewElves() instanceof ElfArcher) {
            switch (setdetachmentElves) {
                case 1: {
                    return ((ElfArcher) getNewElves()).shootSkill(goalDarkSide());
                }
                case 2: {
                    return ((ElfArcher) getNewElves()).meleeSkill(goalDarkSide());
                }
            }
        }
        else
        if (getNewElves() instanceof ElfMagician) {
            switch (setdetachmentElves) {
                case 1: {
                    return ((ElfMagician) getNewElves()).magicDarkSupport(goalDarkSide());
                }
                case 2: {
                    return ((ElfMagician) getNewElves()).magicDamageSkill(goalDarkSide());
                }
            }
        }
        if (getNewElves() instanceof ElfWarrior) {
            return ((ElfWarrior) getNewElves()).meleeSkill(goalDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodOrcs () {
        int setdetachmentOrcs = random.nextInt(3-1) + 1;
        if (getNewOcrs() instanceof ArcherB) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((ArcherB) getNewOcrs()).shootSkill(goalLightSide()); }
                case 2: {
                    return ((ArcherB) getNewOcrs()).shootSkill(goalLightSide());
                }
            }
        }
        else
        if (getNewOcrs() instanceof Shaman) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((Shaman) getNewOcrs()).magicSupportSkill(goalLightSide());
                }
                case 2: {
                    return ((Shaman) getNewOcrs()).magicDamageSkill(goalLightSide());
                }
            }
        }
        if (getNewOcrs() instanceof Goblin) {
            return ((Goblin) getNewOcrs()).meleeSkill(goalLightSide());
        }
        else
            return 0;
    }

    public double retMethodPeople () {
        int setdetachmentPeople = random.nextInt(3-1) + 1;
        if (getNewPeople() instanceof Arbalester) {
            switch (setdetachmentPeople) {
                case 1: {
                    return ((Arbalester) getNewPeople()).shootSkill(goalDarkSide());
                }
                case 2: {
                    return ((Arbalester) getNewPeople()).meleeSkill(goalDarkSide());
                }
            }
        }
        else
        if (getNewPeople() instanceof PeopleMagician) {
            switch (setdetachmentPeople) {
                case 1: {
                    return ((PeopleMagician) getNewPeople()).magicDarkSupport(goalDarkSide());
                }
                case 2: {
                    return ((PeopleMagician) getNewPeople()).magicDamageSkill(goalDarkSide());
                }
            }
        }
        if (getNewPeople() instanceof PeopleWarrior) {
            return ((PeopleWarrior) getNewPeople()).meleeSkill(goalDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodUndead () {
        int setdetachmentUndead = random.nextInt(3-1) + 1;
        if (getNewUndead() instanceof Hunter) {
            switch (setdetachmentUndead) {
                case 1: {
                    return ((Hunter) getNewUndead()).shootSkill(goalLightSide());
                }
                case 2: {
                    return ((Hunter) getNewUndead()).meleeSkill(goalLightSide());
                }
            }
        }
        else
        if (getNewUndead() instanceof Necromancer) {
            switch (setdetachmentUndead) {
                case 1: {
                    return ((Necromancer) getNewUndead()).meleeSkill(goalLightSide());
                }
                case 2: {
                    return ((Necromancer) getNewUndead()).Ailment(goalLightSide());
                }
            }
        }
        if (getNewUndead() instanceof Zombie) {
            return ((Zombie) getNewUndead()).meleeSkill(goalLightSide());
        }
        else
            return 0;
    }

}
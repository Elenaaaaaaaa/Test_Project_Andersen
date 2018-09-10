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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Detachments {
    private All_capabilities newElves;
    private All_capabilities newPeople;
    private All_capabilities newOcrs;
    private All_capabilities newUndead;



    public All_capabilities getNewElves() {
        return newElves;
    }

    public All_capabilities getNewPeople() {
        return newPeople;
    }

    public All_capabilities getNewOcrs(){
        return newOcrs;
    }

    public All_capabilities getNewUndead(){
        return newUndead;
    }

    public All_capabilities generateElves (){
        Random randPerson = new Random();
        ArrayList<All_capabilities> lightElves = new ArrayList<>();
        lightElves.add(new ElfMagician());
        lightElves.add(new ElfArcher());
        lightElves.add(new ElfArcher());
        lightElves.add(new ElfArcher());
        lightElves.add(new ElfArcher());
        lightElves.add(new ElfWarrior());
        lightElves.add(new ElfWarrior());
        lightElves.add(new ElfWarrior());
        lightElves.add(new ElfWarrior());

        All_capabilities personElves = lightElves.get(randPerson.nextInt(lightElves.size()));

        if (personElves instanceof ElfArcher) {
            newElves = ((ElfArcher) personElves);;
        }
        if (personElves instanceof ElfMagician) {
            newElves = ((ElfMagician) personElves);
        }
        if (personElves instanceof ElfWarrior) {
            newElves = ((ElfWarrior) personElves);
        }

        return newElves;
    }



    public All_capabilities generateOrcs(){
        Random randPerson = new Random();

        List<All_capabilities> darkOrcs = new ArrayList<>();
        darkOrcs.add(new Shaman());
        darkOrcs.add(new ArcherB());
        darkOrcs.add(new ArcherB());
        darkOrcs.add(new ArcherB());
        darkOrcs.add(new Goblin());
        darkOrcs.add(new Goblin());
        darkOrcs.add(new Goblin());
        darkOrcs.add(new Goblin());

        All_capabilities personOrcs = darkOrcs.get(randPerson.nextInt(darkOrcs.size()));

        if (personOrcs instanceof Shaman) {
            newOcrs = ((Shaman) personOrcs);
        }
        if (personOrcs instanceof ArcherB) {
            newOcrs = ((ArcherB) personOrcs);
        }
        if (personOrcs instanceof Goblin) {
            newOcrs = ((Goblin) personOrcs);
        }
        return newOcrs;
    }


    public All_capabilities generatePeople () {
        Random randPerson = new Random();
        List<All_capabilities> lightPeople = new ArrayList<>();
        lightPeople.add(new PeopleMagician());
        lightPeople.add(new Arbalester());
        lightPeople.add(new Arbalester());
        lightPeople.add(new Arbalester());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());
        lightPeople.add(new PeopleWarrior());

        All_capabilities personPeople = lightPeople.get(randPerson.nextInt(lightPeople.size()));

        if (personPeople instanceof ElfArcher) {
            newPeople = ((ElfArcher) personPeople);
        }
        if (personPeople instanceof ElfMagician) {
            newPeople = ((ElfMagician) personPeople);
        }
        if (personPeople instanceof ElfWarrior) {
            newPeople = ((ElfWarrior) personPeople);
        }

        return newPeople;
    }

    public All_capabilities generateUndead () {
        Random randPerson = new Random();
        List<All_capabilities> darkUndead = new ArrayList<>();
        darkUndead.add(new Necromancer());
        darkUndead.add(new Hunter());
        darkUndead.add(new Hunter());
        darkUndead.add(new Hunter());
        darkUndead.add(new Zombie());
        darkUndead.add(new Zombie());
        darkUndead.add(new Zombie());
        darkUndead.add(new Zombie());

        All_capabilities personUndead = darkUndead.get(randPerson.nextInt(darkUndead.size()));

        if (personUndead instanceof Necromancer) {
            newUndead = ((Necromancer) personUndead);
        }
        if (personUndead instanceof Hunter) {
            newUndead = ((Hunter) personUndead);
        }
        if (personUndead instanceof Zombie) {
            newUndead = ((Zombie) personUndead);
        }
        return newUndead;
    }

    public All_capabilities lightSide () {
        Random randPerson = new Random();

        List<All_capabilities> lightSide = new ArrayList<>();
        final boolean add = lightSide.add(generateElves());
        lightSide.add(generatePeople());

        All_capabilities personOnLightSide = lightSide.get(randPerson.nextInt(lightSide.size()));


        return personOnLightSide;
    }

    public All_capabilities darkSide () {
        Random randPerson = new Random();

        List<All_capabilities> darkSide = new ArrayList<>();
        darkSide.add(generateOrcs());
        darkSide.add(generateUndead());

        All_capabilities personOnDarkSide = darkSide.get(randPerson.nextInt(darkSide.size()));

        return personOnDarkSide;
    }

}



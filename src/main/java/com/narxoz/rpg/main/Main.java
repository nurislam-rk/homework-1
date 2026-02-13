package com.narxoz.rpg.main;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character Creation System ===");

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        warrior.getStats();
        warrior.useSpecialAbility();
        warrior.equip(new MedievalFactory());

        System.out.println();

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        mage.getStats();
        mage.useSpecialAbility();
        mage.equip(new MagicFactory());

        System.out.println();

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter();
        archer.getStats();
        archer.useSpecialAbility();
        archer.equip(new RangerFactory());
    }
}
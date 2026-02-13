package com.narxoz.rpg.character;

import com.narxoz.rpg.character.*;

public class Warrior extends Character {
    public Warrior() {
        super("Warrior", 150, 20, 40, 10);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Warrior uses Whirlwind Strike!");
    }
}

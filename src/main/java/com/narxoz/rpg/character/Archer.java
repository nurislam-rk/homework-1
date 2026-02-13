package com.narxoz.rpg.character;

public class Archer extends Character {
    public Archer() {
        super("Archer", 100, 40, 25, 20);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Archer uses Piercing Arrow!");
    }
}

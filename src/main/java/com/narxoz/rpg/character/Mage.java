package com.narxoz.rpg.character;

public class Mage extends Character {
    public Mage() {
        super("Mage", 80, 100, 10, 40);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Mage casts Fireball!");
    }
}

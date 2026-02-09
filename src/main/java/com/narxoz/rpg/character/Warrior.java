package com.narxoz.rpg.character;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    // TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?


    public Warrior(String name) {
        this.name = name;
        // Warrior stats: high health and strength, low mana and intelligence
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    // TODO: Implement methods from Character interface
    // You need to define those methods in Character interface first!

    // Example method structure:
    public String getName() {
        return name;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    // TODO: Add equipment-related methods
    // Examples:
    // - void equipWeapon(Weapon weapon)
    // - void equipArmor(Armor armor)
    // - void displayEquipment()

}

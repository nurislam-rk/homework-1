package com.narxoz.rpg.equipment;

/**
 * Example concrete weapon implementation - Medieval theme.
 *
 * This is provided as a reference to help you understand the structure.
 * Study this, then create other weapons and armor for different themes.
 *
 * Notice:
 * - This implements the Weapon interface
 * - It has specific attributes for this weapon type
 * - It belongs to the "Medieval" equipment family
 *
 * TODO: Create similar implementations for:
 * Weapons:
 * - WizardStaff (Magic theme)
 * - Longbow (Ranger theme)
 * - Other weapons you imagine...
 *
 * Armor:
 * - PlateArmor (Medieval theme)
 * - EnchantedRobes (Magic theme)
 * - LeatherArmor (Ranger theme)
 * - Other armor you imagine...
 */
public class IronSword implements Weapon {

    private int damage;
    private String weaponType;

    public IronSword() {
        this.damage = 25;
        this.weaponType = "Sword";
    }

    // TODO: Implement methods from Weapon interface
    // Define those methods in the Weapon interface first!

    // Example method structure:
    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }

    // TODO: Consider adding theme-specific properties
    // For example, Medieval weapons might have:
    // - Durability
    // - Weight
    // Magic weapons might have:
    // - Mana boost
    // - Spell power
}

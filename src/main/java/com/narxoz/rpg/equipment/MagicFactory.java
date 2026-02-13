package com.narxoz.rpg.equipment;

public class MagicFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobe();
    }
}

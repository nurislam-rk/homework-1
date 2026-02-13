package com.narxoz.rpg.equipment;

public class RangerFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}

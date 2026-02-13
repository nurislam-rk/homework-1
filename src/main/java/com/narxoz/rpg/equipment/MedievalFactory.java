package com.narxoz.rpg.equipment;

public class MedievalFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}

package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    @Override
    public String getWeaponInfo() {
        return "Wizard Staff";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}

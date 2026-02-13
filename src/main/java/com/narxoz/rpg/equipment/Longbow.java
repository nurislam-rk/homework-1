package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    @Override
    public String getWeaponInfo() {
        return "Longbow";
    }

    @Override
    public int getDamage() {
        return 30;
    }
}

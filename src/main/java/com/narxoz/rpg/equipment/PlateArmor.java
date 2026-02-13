package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    @Override
    public String getArmorInfo() {
        return "Plate Armor";
    }

    @Override
    public int getDefense() {
        return 30;
    }
}

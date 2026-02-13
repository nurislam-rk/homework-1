package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    @Override
    public String getArmorInfo() {
        return "Leather Armor";
    }

    @Override
    public int getDefense() {
        return 20;
    }
}

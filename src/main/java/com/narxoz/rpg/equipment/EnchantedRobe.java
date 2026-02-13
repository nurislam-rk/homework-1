package com.narxoz.rpg.equipment;

public class EnchantedRobe implements Armor {
    @Override
    public String getArmorInfo() {
        return "Enchanted Robe";
    }

    @Override
    public int getDefense() {
        return 10;
    }
}

package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.*;

public class WarriorFactory extends CharacterFactory {
    @Override
    public com.narxoz.rpg.character.Character createCharacter() {
        return new com.narxoz.rpg.character.Warrior();
    }
}

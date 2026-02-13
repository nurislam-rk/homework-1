package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.*;

public class MageFactory extends CharacterFactory {
    @Override
    public com.narxoz.rpg.character.Character createCharacter() {
        return new Mage();
    }
}

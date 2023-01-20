package org.example.Armour;

import org.example.Character.Attributes;
import org.example.Item.Item;
import org.example.Item.ItemEnums;

public class Armour extends Item {


    public Armour(String name, ItemEnums.Slot slot, int requiredLevel, Attributes attributes) {
        super(name, slot, requiredLevel, attributes);
    }
}

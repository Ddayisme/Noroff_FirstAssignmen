package org.example.Item;

import org.example.Character.Attributes;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {

    private String name;
    protected ItemEnums.Slot slot;

    private int RequiredLevel;

    private Attributes attributes;

    public Item(String name, ItemEnums.Slot slot, int requiredLevel, Attributes attributes) {
        this.name = name;
        this.slot = slot;
        this.RequiredLevel = requiredLevel;
        this.attributes = attributes;
    }


    public ItemEnums.Slot getSlot() {
        return slot;
    }

    public String getName() {
        return name;
    }

    public int getRerquiedLevel() {
        return RequiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        RequiredLevel = requiredLevel;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRequiredLevel() {
        return RequiredLevel;
    }

    public Attributes getAttributes() {
        return attributes;
    }
}

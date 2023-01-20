package org.example.Weapons;

import org.example.Character.Attributes;
import org.example.Item.Item;
import org.example.Item.ItemEnums;


public class Weapon extends Item {

    private WeaponsEnum.WeaponType weaponEnum;

    public String weaponType;
    private double weaponDamage;



    public Weapon(WeaponsEnum.WeaponType inn, double wDmg, int requiredLvl, String name, Attributes innAtt) {
        super(name, ItemEnums.Slot.Weapon, requiredLvl, innAtt);
        //setName(name);
        //setRequiredLevel(requiredLvl);
        //slot = ItemEnums.Slot.Weapon;
        this.weaponType = inn.toString();
        this.weaponDamage = wDmg;

    }


    public String getWeaponType() {
        return weaponType;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }

    public WeaponsEnum.WeaponType getWeaponEnum() {
        return weaponEnum;
    }
}

package org.example;

import org.example.Character.Attributes;
import org.example.Character.Hero;
import org.example.Character.Mage;
import org.example.Weapons.WeaponsEnum;
import org.example.Weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        Hero one_Mage = new Mage("Baltasar");



       one_Mage.LevelUp();

        Weapon example = new Weapon(WeaponsEnum.WeaponType.Hammer, 2, 4, "Warrior Axe", new Attributes(3,0,0));

        try{
            one_Mage.EquipWeapon(example);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Weapon staff = new Weapon(WeaponsEnum.WeaponType.Staff, 3 ,2, "Mage Staff", new Attributes(0,0,5));

        try{
            one_Mage.EquipWeapon(staff);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(one_Mage.getEuqipment().get(0));
        System.out.println(one_Mage.getEuqipment().get(0).getName());
        Weapon example2= new Weapon(WeaponsEnum.WeaponType.Wand, 1,3, "Blaster", new Attributes(0,0,3));

        try{
            one_Mage.EquipWeapon(example2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(example2.getWeaponType());

        one_Mage.Display();
    }
}
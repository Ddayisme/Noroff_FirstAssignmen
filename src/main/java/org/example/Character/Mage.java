package org.example.Character;

import org.example.Armour.Armour;
import org.example.Item.Item;
import org.example.Weapons.Weapon;
import org.example.Weapons.WeaponsEnum;

import java.util.ArrayList;

public class Mage extends Hero{




    public Mage(String name) {
        super(name,new Attributes(1,1,8));


    }


    public void LevelUp() {
        int strength=1;
        int dexterity=1;
        int intelligence=5;

        int valueStr=super.getAttribute().getStrength()+strength;
        super.getAttribute().setStrength(valueStr);

        int valueDex=super.getAttribute().getDexterity()+dexterity;
        super.getAttribute().setDexterity(valueDex);

        int valueInt=super.getAttribute().getIntelligence()+intelligence;
        super.getAttribute().setIntelligence(valueInt);




        super.setLevel(1);
    }

    public void EquipWeapon(Weapon innWeapon) throws Exception{

        System.out.println("innweapon "+innWeapon.weaponType);
        System.out.println("Weapon enum "+WeaponsEnum.WeaponType.Staff);
        if(innWeapon.weaponType != WeaponsEnum.WeaponType.Staff.toString()){
            throw new Exception("Weapon type is not assignable to this Hero class");
        }
        boolean equipped=false;
        int index=-1;

        if(getEuqipment().isEmpty()){
            getEuqipment().add(innWeapon);
            setItemStat(innWeapon);
        }
        for(Item var: getEuqipment()) {
            if(var.getSlot() == innWeapon.getSlot()){
                equipped=true;
                index++;
            }
        }
        if(equipped){
            removeItemStat(getEuqipment().get(index));
            getEuqipment().set(index,innWeapon);
            setItemStat(innWeapon);
        }
    }
}

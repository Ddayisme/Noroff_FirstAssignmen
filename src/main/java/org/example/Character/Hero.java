package org.example.Character;

import org.example.Armour.Armour;
import org.example.Item.Item;
import org.example.Weapons.Weapon;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public abstract class Hero {

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int levels) {
        this.level += this.level + levels;
    }






    private String name;
    private int level=1;

    private Attributes attribute;


    private ArrayList<Item> Euqipment= new ArrayList<>();




    public  Hero(String name, Attributes attributes) {
        this.name=name;
        this.attribute=attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return level == hero.level &&  Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, level);
    }

    public Attributes getAttribute() {
        return attribute;
    }


    public abstract void LevelUp();

    public int TotalAttributes(){
        int totalAttributes= attribute.getDexterity()+attribute.getStrength()+attribute.getIntelligence();
        return totalAttributes;
    }

    public abstract void EquipWeapon(Weapon innWeapon) throws Exception;

    public void EquipArmour(Armour innArmour){
        boolean equipped=false;
        int index=-1;

        if(Euqipment.isEmpty()){
            Euqipment.add(innArmour);
            setItemStat(innArmour);
        }
        for(Item var: Euqipment) {
            if(var.getSlot() == innArmour.getSlot()){
                equipped=true;
                index++;
            }
        }
        if(equipped){
            removeItemStat(Euqipment.get(index));

            Euqipment.set(index,innArmour);
            setItemStat(innArmour);
        }



    }
    public void setItemStat(Item innItem){
        Attributes itemAttributes= innItem.getAttributes();
        attribute.setStrength(attribute.getStrength()+innItem.getAttributes().getStrength());
        attribute.setDexterity(attribute.getDexterity()+itemAttributes.getDexterity());
        attribute.setIntelligence(attribute.getIntelligence()+itemAttributes.getIntelligence());
    }

    public void removeItemStat(Item innItem){
        Attributes itemAttributes= innItem.getAttributes();

        attribute.setStrength(attribute.getStrength()-itemAttributes.getStrength());
        attribute.setDexterity(attribute.getDexterity()-itemAttributes.getDexterity());
        attribute.setIntelligence(attribute.getIntelligence()-itemAttributes.getIntelligence());

    }

    public List<Item> getEuqipment() {
        return Euqipment;
    }


    public void Display(){
        System.out.println("Name: "+name);
        System.out.println("Hero level: "+level);
        System.out.println("Hero strength: "+attribute.getStrength());
        System.out.println("Hero dexterity: "+attribute.getDexterity());
        System.out.println("Hero intelligence: "+attribute.getIntelligence());
        System.out.println("Total attributes: "+TotalAttributes());


        System.out.println("Hero equipment:");
        for (Item var:Euqipment
             ) {
            System.out.println(var.getName());
            System.out.println(var.getRerquiedLevel());
            System.out.println(var.getSlot());
            System.out.println(var.getAttributes());

            System.out.println("---------");
        }
    }
}
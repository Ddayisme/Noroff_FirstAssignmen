package org.example.Character;

public class Attributes {
    private int Strength;
    private int Dexterity;

    private int Intelligence;

    public Attributes(int strength, int dexterity, int intelligence) {
        this.Strength = strength;
        this.Dexterity=dexterity;
        this.Intelligence=intelligence;
    }


    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }


}

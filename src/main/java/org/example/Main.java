package org.example;

import org.example.Character.Hero;
import org.example.Character.Mage;

public class Main {
    public static void main(String[] args) {
        Hero one_Mage= new Mage("Baltasar");
        System.out.println(one_Mage.getName());
        System.out.println(one_Mage.getLevel());
    }
}
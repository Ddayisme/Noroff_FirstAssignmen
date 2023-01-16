package org.example.Character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Mage mage;
    @BeforeEach
    void setUp() {
         mage=new Mage("Baltasar");
    }

    @Test
    void MageHero_CreateMage_ShouldCreateAMage(){
        //Arrange
        Mage expectedMage= mage;

        //Act
        Mage actualMage= new Mage("Baltasar");

        //Assert
        assertEquals(expectedMage, actualMage);
        assertEquals(expectedMage.hashCode(), actualMage.hashCode());
        //expectedMage.equals(actualMage);

    }


}
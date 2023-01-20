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

    @Test
    void MageHero_Level_ShouldStartWithLevel1(){
        //Arrenge
        int expected=1;
        //Act
        int actual=mage.getLevel();
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    void MageHero_LevelUp_AttributesshouldBeUpdated(){
        //Arrenge
        int expectedInt=8+5+5;
        int expectedTotalAttribute=8+5+5+3+3;

        //Act
        mage.LevelUp();
        mage.LevelUp();
        int actualInt=mage.getAttribute().getIntelligence();
        int actualTotAtt= mage.TotalAttributes();

        //Assert
        assertEquals(expectedInt,actualInt);
        assertEquals(expectedTotalAttribute,actualTotAtt);
    }

}
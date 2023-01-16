package org.example.Character;

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

    public void setLevel(int level) {
        this.level = level;
    }

    private String hero_Class;

    public String getHero_Class() {
        return hero_Class;
    }

    public void setHero_Class(String hero_Class) {
        this.hero_Class = hero_Class;
    }


    private String name;
    private int level=1;







    public  Hero(String name) {
        this.name=name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return level == hero.level && Objects.equals(hero_Class, hero.hero_Class) && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hero_Class, name, level);
    }
}
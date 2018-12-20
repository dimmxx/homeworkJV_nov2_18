package homework.homework8;

import java.util.Arrays;

public class Hero {

    private String name;
    private int health = 1000;

    private int accuracy;
    private int intel;
    private int strength;
    private int strike;
    private boolean heroMode;

    private Item[] item = new Item[2];

    public Hero(String name, int accuracy, int intel, int strength) {
        this.name = name;
        this.accuracy = accuracy;
        this.intel = intel;
        this.strength = strength;
        this.strike = intel/3 + accuracy/2 + strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getIntel() {
        return intel;
    }

    public int getStrength() {
        return strength;
    }

    public Item[] getItem() {
        return item;
    }

    public int getStrike() {
        return strike;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setItem(Item item, int n) {
        this.item[n] = item;
    }

    public boolean isHeroMode() {
        return heroMode;
    }

    public void setHeroMode(boolean heroMode) {
        this.heroMode = heroMode;
    }

    protected int ultimate(){
        return strike * 2;
    }




    @Override
    public String toString() {
        return "\nHero:" + "\nname: " + name + "\nhealth: " + health + "\naccuracy: " + accuracy +
                "\nintel: " + intel + "\nstrength: " + strength + "\nstrike: " + strike + "\nHeroMode: " +
                heroMode + "\nItem: " + item[0].toString() + item[1].toString();
    }


}

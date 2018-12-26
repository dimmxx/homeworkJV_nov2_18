package homework.homework10.heroes_v3;

public abstract class Hero {

    private String name;
    private int health = 1000;

    private int accuracy;
    private int intel;
    private int strength;
    private int strike;
    private boolean heroMode;

    private Item[] slots = new Item[2];

    public Hero(String name, int accuracy, int intel, int strength) {
        this.name = name;
        this.accuracy = accuracy;
        this.intel = intel;
        this.strength = strength;
        this.strike = intel / 3 + accuracy / 2 + strength;
//      slots[0] = new Item();
//      slots[1] = new Item();
        slots[0] = new Item("Sword", 20, 0);
        slots[1] = new Item("Shield", 0, 20);

    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public Item[] getSlots() {
        return slots;
    }
    public int getStrike() {
        return strike;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setItem(Item item, int n) {
        this.slots[n] = item;
    }

    public boolean isHeroMode() {
        return heroMode;
    }

    public void setHeroMode(boolean heroMode) {
        this.heroMode = heroMode;
    }

    public abstract int ultimate();

    @Override
    public String toString() {
        return "\nHero:" +
                "\nname: " + name +
                "\nhealth: " + health +
                "\naccuracy: " + accuracy +
                "\nintel: " + intel +
                "\nstrength: " + strength +
                "\nstrike: " + strike +
                "\nHeroMode: " + heroMode +
                "\nUltimate: " + ultimate() + (isHeroMode() ? " (Enabled)" : (" (Disabled)")) +
                "\nSlot 1: " + slots[0].toString() + "\nSlot 2: " + slots[1].toString();
    }
}

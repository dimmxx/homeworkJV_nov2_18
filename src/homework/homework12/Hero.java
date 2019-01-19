package homework.homework12;

public class Hero <Hero>{

    private String name;
    private int health;
    private int accuracy;
    private int intel;

    public Hero(String name, int health, int accuracy, int intel){
        this.name = name;
        this.health = health;
        this.accuracy = accuracy;
        this.intel = intel;
    }


    public int getIntel() {
        return intel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", accuracy=" + accuracy +
                ", intel = " + intel +
                '}';
    }
}

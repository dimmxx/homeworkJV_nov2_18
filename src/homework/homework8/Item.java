package homework.homework8;

public class Item {

    private String name = "empty";
    private int strike = 0;
    private int defence = 0;

    public Item(){
    }

    public Item(String name, int strike, int defence){
        this.name = name;
        this.strike = strike;
        this.defence = defence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrike() {
        return strike;
    }

    public int getDefence() {
        return defence;
    }

    @Override
    public String toString() {
        return " " + name  + ", strike " + strike + ", defence " + defence;
    }
}

package homework.homework9.dota;

public class DemoHero {

    public static void main(String[] args) {

        Hero luna = new Luna("Luna", 40, 10, 50);
        Hero zeus = new Zeus("Zeus", 30, 70, 40);

        Engine engine = new Engine(luna, zeus);

    }

}

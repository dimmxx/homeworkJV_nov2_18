package homework.homework10.heroes_v3;

public class Engine {

    Hero hero1;
    Hero hero2;

    public Engine(Hero hero1, Hero hero2){
        this.hero1 = hero1;
        this.hero2 = hero2;
        start();
    }

    public void start(){
        System.out.println(hero1.toString());
        System.out.println(hero2.toString());

        int count = 0;

        while (hero1.getHealth() >= 0 && hero2.getHealth() >= 0) {
            count++;
            hero1.setHeroMode(false);
            hero2.setHeroMode(false);
            if (count % 3 == 0) {
                hero1.setHeroMode(true);
                hero2.setHeroMode(true);
            }
            int lunaHit = hero1.isHeroMode() ? hero1.ultimate() + hero1.getSlots()[0].getStrike() :
                    hero1.getStrike() + hero1.getSlots()[0].getStrike();
            int zeusHit = hero2.isHeroMode() ? hero2.ultimate() + hero2.getSlots()[0].getStrike() :
                    hero2.getStrike() + hero2.getSlots()[0].getStrike();

            if (hero1.getHealth() > 0)
                hero2.setHealth(hero2.getHealth() - lunaHit + hero2.getSlots()[1].getDefence());
            if (hero2.getHealth() > 0)
                hero1.setHealth(hero1.getHealth() - zeusHit + hero1.getSlots()[1].getDefence());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
            System.out.println();
            System.out.println("Round # " + count + ":");
            System.out.println("---------------------------------------------");
            System.out.println(hero1.toString());
            System.out.println(hero2.toString());
        }

        System.out.println();
        if (hero2.getHealth() <= 0 && hero1.getHealth() <= 0) System.out.println("Both heroes are dead");
        else if (hero1.getHealth() <= 0) System.out.println("Luna is dead!");
        else if (hero2.getHealth() <= 0) System.out.println("Zeus is dead!");
    }
}

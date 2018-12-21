package homework.homework8;

public class DemoHero {

    public static void main(String[] args) {

        Hero luna = new Luna("Luna", 40, 10, 50);
        Hero zeus = new Zeus("Zeus", 15, 70, 40);

        Item sword = new Item("Sword", 20, 0);
        Item shield = new Item("Shield", 0, 30);

        luna.setItem(sword, 0);
        //luna.setItem(shield, 1);
        //zeus.setItem(sword, 0);
        zeus.setItem(shield, 1);

        System.out.println(luna.toString());
        System.out.println(zeus.toString());

        int count = 0;

        while (luna.getHealth() >= 0 && zeus.getHealth() >= 0) {
            count++;
            luna.setHeroMode(false);
            zeus.setHeroMode(false);
            if (count % 3 == 0) {
                luna.setHeroMode(true);
                zeus.setHeroMode(true);
            }
            int lunaHit = luna.isHeroMode() ? luna.ultimate() + luna.getSlots()[0].getStrike() :
                    luna.getStrike() + luna.getSlots()[0].getStrike();
            int zeusHit = zeus.isHeroMode() ? zeus.ultimate() + zeus.getSlots()[0].getStrike() :
                    zeus.getStrike() + zeus.getSlots()[0].getStrike();

            if (luna.getHealth() > 0)
                zeus.setHealth(zeus.getHealth() - lunaHit + zeus.getSlots()[1].getDefence());
            if (zeus.getHealth() > 0)
                luna.setHealth(luna.getHealth() - zeusHit + luna.getSlots()[1].getDefence());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
            System.out.println();
            System.out.println("Round # " + count + ":");
            System.out.println("---------------------------------------------");
            System.out.println(luna.toString());
            System.out.println(zeus.toString());
        }

        System.out.println();
        if (zeus.getHealth() <= 0 && luna.getHealth() <= 0) System.out.println("Both heroes are dead");
        else if (luna.getHealth() <= 0) System.out.println("Luna is dead!");
        else if (zeus.getHealth() <= 0) System.out.println("Zeus is dead!");

    }
}

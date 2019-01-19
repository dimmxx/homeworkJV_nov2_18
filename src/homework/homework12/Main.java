package homework.homework12;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Luna", 100, 20, 100);
        Hero hero2 = new Hero("Zeus", 120, 20, 40);
        Hero hero3 = new Hero("Appolo", 110, 20, 490);
        Hero hero4 = new Hero("Ares", 10, 20, 300);
        Hero hero5 = new Hero("Hector", 200, 20, 30);
        Hero hero6 = new Hero("Hermes", 300, 20, 3);
        Hero hero7 = new Hero("Poseidon", 150, 20, 0);
        Hero hero8 = new Hero("Adonis", 130, 20, 1);

        Store store = new Store();

        store.addAndSort(hero1, store); //100
        store.addAndSort(hero2, store); //40
        store.addAndSort(hero8, store); //1
        store.addAndSort(hero5, store); //30
        store.addAndSort(hero3, store); //490

        Iterator<Hero> it = store.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(store.remove("Luna", store));
        System.out.println(store.remove("Adonis", store));
        System.out.println(store.remove("Appolo", store));

        it = store.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

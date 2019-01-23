package homework.homework13;

import java.util.Arrays;
import java.util.Iterator;

public class DemoDimaCollection {

    private static String[] name = {"Amelia", "Olivia", "Emily", "Ava", "Isla", "Jessica", "Poppy", "Isabella", "Sophie", "Mia", "Ruby", "Lily", "Grace", "Evie", "Sophia", "Ella", "Scarlett", "Chloe", "Isabelle", "Freya", "Charlotte", "Sienna", "Daisy", "Phoebe", "Millie", "Eva", "Alice", "Lucy", "Florence", "Sofia", "Layla", "Lola", "Holly", "Imogen", "Molly", "Matilda", "Lilly", "Rosie", "Elizabeth", "Erin", "Maisie", "Lexi", "Ellie", "Hannah", "Evelyn", "Abigail", "Elsie", "Summer", "Megan", "Jasmine", "Maya", "Amelie", "Lacey", "Willow", "Emma"};
    private static int[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static String[] color = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "white", "grey", "brown", "black"};

    private static int loops = 100;

    public static void main(String[] args) {

//      DimaCollectionArrayList dArrayList = new DimaCollectionArrayList();

        DimaCollectionLinkedList dLinkedList = new DimaCollectionLinkedList();

        DogClass dog1 = new DogClass("Poppy", 15, "black");
        DogClass dog2 = new DogClass("Emma", 12, "brown");
        DogClass dog3 = new DogClass("Ellie", 9, "white");
        DogClass dog4 = new DogClass("Jess", 1, "green");
        DogClass dog5 = new DogClass("Jeff", 150, "blue");
        DogClass dog6 = new DogClass("Peter", 24, "orange");
        DogClass dog7 = new DogClass("Linda", 100, "violet");

//        for (int i = 0; i < loops; i++){
//            dArrayList.add(makeDog(name[(int) (Math.random()*name.length)], age[(int)(Math.random()*age.length)], color[(int)(Math.random()*color.length)]));
//        }

//        dArrayList.add(dog1);
//        dArrayList.add(dog2);
//        dArrayList.add(dog3);
//
//        dArrayList.printOut();
//        System.out.println("----------------------------------------------");
//
//        dArrayList.sort(new DogClassComparator());
//
//        dArrayList.printOut();
//        System.out.println("----------------------------------------------");

//        dArrayList.remove(0);
//        dArrayList.printOut();
//        System.out.println("----------------------------------------------");
//
//        dArrayList.remove(1);
//        dArrayList.printOut();
//        System.out.println("----------------------------------------------");


//        Iterator<DogClass> it = dArrayList.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next().getAge());
//        }

        System.out.println(dLinkedList.getCurrentSize());
        dLinkedList.add(dog1);
        dLinkedList.add(dog2);
        dLinkedList.add(dog3);
        dLinkedList.add(dog7);
        System.out.println(dLinkedList.getCurrentSize());
        System.out.println(dLinkedList.printOut());
//        System.out.println("First " + dLinkedList.getFirstNode());
//        System.out.println("Last " + dLinkedList.getLastNode());

//        dLinkedList.add(0, dog4);
//        System.out.println("------------------------------");
//        System.out.println(dLinkedList.printOut());
//

//        System.out.println("------------------------------");
//        System.out.println(dLinkedList.remove(0));
//
//        System.out.println(dLinkedList.printOut());


//        System.out.println(Arrays.toString(dLinkedList.toArray()));


    }


    private static DogClass makeDog(String name, int age, String color) {
        return new DogClass(name, age, color);
    }
}

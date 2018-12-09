package homework;

import java.util.Scanner;

public class Homework3_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        //String name = "борисов дмитрий олегович";
        name = name.trim();
        String surname = name.substring(0, name.indexOf(' '));
        surname = (surname.substring(0,1)).toUpperCase() + surname.substring(1);
        String initial = name.substring(surname.length() + 1, name.lastIndexOf(' ') + 2);
        initial = ((initial.charAt(0)) + "." + initial.charAt(initial.length() - 1) + ".").toUpperCase();
        System.out.println(surname + " " + initial);
    }
}

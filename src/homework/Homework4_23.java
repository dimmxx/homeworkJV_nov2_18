package homework;

import java.util.Date;

public class Homework4_23 {

    public static void main(String[] args) {

        //Homework4_2
        System.out.println();
        System.out.printf("%s%s%s%-15s%s%-20s%s%-7s%s", "|", "#", "|", "currency", "|", "description", "|", "rate", "|");
        System.out.println("\n------------------------------------------------");
        System.out.printf("%s%d%s%-15s%s%-20s%s%-7.2f%s", "|", 1, "|", "USD", "|", "American dollar", "|", 28.15, "|");
        System.out.printf("\n%s%d%s%-15s%s%-20s%s%-7.2f%s", "|", 2, "|", "EUR", "|", "Euro", "|", 32.05, "|");
        System.out.printf("\n%s%d%s%-15s%s%-20s%s%-7.2f%s", "|", 3, "|", "GBP", "|", "British Pound", "|", 37.70, "|");
        System.out.println();
        System.out.println();


        //Homework4_3
        for(int i = 0; i < 61; i++) {
            System.out.printf("\r%s %ta %<te %tb  %<tY; %s H:%tH M:%tM S:%tS", "Date:", new Date(), new Date(), "Time:", new Date(), new Date(), new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

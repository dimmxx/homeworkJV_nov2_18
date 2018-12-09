package homework;

public class Homework3_3 {

    public static void main(String[] args) {

        discount(400);
    }

    public static void discount(int n) {
        int discount = 0;
        int a = Integer.signum(300 - n);
        int b = Integer.signum(400 - n);

        switch (b){

            case 1:
                switch (a){
                    case 1: discount = 0;
                            break;
                    case 0: discount = 3;
                    case - 1: discount = 3;
                }
                break;
            case 0: discount = 5;
            case -1: discount = 5;
        }
        int sum = n - (n * discount / 100);
        System.out.println("Your discount is " + discount + "%, to pay " + sum + "$");
    }
}

package homework.homework6;

import java.util.Scanner;

public class DemoFigure {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean go = true;
        while(go){
            System.out.println("\nSelect 1 - 3 to: 1 - Create a circle, 2 - Create a square, 3 - Create a triangle or 0 to exit");
            if(scan.hasNextInt()){
                int input = scan.nextInt();
                switch (input){
                    case 0:
                        go = false;
                        break;
                    case 1:
                        new Circle(inputColor(), inputPerimeter()).printFigure();
                        break;
                    case 2:
                        new Square(inputColor(), inputPerimeter()).printFigure();
                        break;
                    case 3:
                        new Triangle(inputColor(), inputPerimeter()).printFigure();
                }
            }else{
                System.out.println("Error! Select 1 - 3 or 0 to exit");
                scan.next();
            }
        }
    }

    public static String inputColor(){
        System.out.println("Enter object color: ");
        String color = scan.next();
        return color;
    }

    public static double inputPerimeter(){
        double perimeter = 0;
        System.out.println("Enter object perimeter: ");
        while(true) {
            if (scan.hasNextDouble()) {
                perimeter = scan.nextDouble();
                break;
            } else{
                System.out.println("Error! Enter double number:");
                scan.next();
            }
        }
        return perimeter;
    }






}

package homework.homework10.shapes_v3;

import java.util.Scanner;

public abstract class ShapeClass {

    private String name;
    private String color;
    private double sideOne;
    private double perimeter;
    private double area;

    public double inputData() throws IllegalArgumentException{
        Scanner scan = new Scanner(System.in);
        double side = 1;
        while(true) {
            if (scan.hasNextDouble()) {
                side = scan.nextDouble();
                if (side <= 0) throw new IllegalArgumentException();
                break;
            } else{
                System.out.println("Error! Enter double number:");
                scan.next();
            }
        }
        return side;
    }

    public abstract double countPerimeter();

    public abstract double countArea();

    public abstract void printFigure();
}

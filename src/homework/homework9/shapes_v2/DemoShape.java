package homework.homework9.shapes_v2;

import java.util.Scanner;

public class DemoShape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ShapeClass[] array = new ShapeClass[3];

        boolean go = true;
        while(go) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("\nSelect 1 - 3 to: 1 - Create a circle, 2 - Create a square, " +
                        "3 - Create a triangle or 0 to exit");
                if (scan.hasNextInt()) {
                    int input = scan.nextInt();
                    switch (input) {
                        case 0:
                            go = false;
                            scan.close();
                            break;
                        case 1:
                            array[i] = new Circle(Color.getColor());
                            break;
                        case 2:
                            array[i] = new Square(Color.getColor());
                            break;
                        case 3:
                            array[i] = new Triangle(Color.getColor());
                    }
                } else {
                    System.out.println("Error! Select 1 - 3 or 0 to exit");
                    i--;
                    scan.next();
                }
            }
            scan.close();
            go = false;
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] != null) array[i].printFigure();
        }
    }
}

package homework.homework10.shapes_v3;

import java.util.Scanner;

public class DemoShape {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ShapeClass[] array = new ShapeClass[5];

        boolean go = true;

        while (go) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("\nSelect 1 - 3 to: 1 - Create a circle, 2 - Create a square, " +
                        "3 - Create a triangle or 0 to exit. Cells filled: " + i + "/" + array.length );
                if (scan.hasNextInt()) {
                    int input = scan.nextInt();
                    try {
                        switch (input) {
                            case 1:
                                array[i] = new Circle(Color.getColor());
                                System.out.println("Circle is built");
                                break;
                            case 2:
                                array[i] = new Rectangle(Color.getColor());
                                System.out.println("Rectangle is built");
                                break;
                            case 3:
                                array[i] = new Triangle(Color.getColor());
                                System.out.println("Triangle is built");
                                break;
                            case 0:
                                i = array.length;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("IllegalArgumentException. Length can not be negative. Try once more: ");
                        i--;
                    } catch (IllegalTriangleException e) {
                        System.out.println(e.getMessage() + " Try once more: ");
                        i--;
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

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) array[i].printFigure();
        }
    }
}
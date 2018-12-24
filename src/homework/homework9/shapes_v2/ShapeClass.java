package homework.homework9.shapes_v2;
import java.util.Scanner;

public class ShapeClass {

    private String name;
    private String color;
    private double area;

    public ShapeClass(String color) {
        this.color = color;
    }

      protected double inputData(){
        Scanner scan = new Scanner(System.in);
        double data = 0;
        while(true) {
            if (scan.hasNextDouble()) {
                data = scan.nextDouble();
                break;
            } else{
                System.out.println("Error! Enter double number:");
                scan.next();
            }
        }
        //scan.close();
        return data;
    }

    public void printFigure() {
        System.out.println("Shape color: " + color);
    }


}

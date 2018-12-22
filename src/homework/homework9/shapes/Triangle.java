package homework.homework9.shapes;

public class Triangle extends ShapeClass{

    private String name = "Triangle";

    public Triangle(String color, double perimeter) {
        super(color, perimeter);
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Shape area: " + Math.pow(perimeter/3, 2)* Math.sqrt(3) / 4);
    }










}

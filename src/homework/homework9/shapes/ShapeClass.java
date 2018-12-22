package homework.homework9.shapes;

public class ShapeClass {

    private String color;
    protected double perimeter;
    private double area;

    public ShapeClass(String color, double perimeter) {
        this.color = color;
        this.perimeter = perimeter;
    }

    public void printFigure() {
        System.out.println("Shape color: " + color);
        System.out.println("Shape perimeter: " + perimeter);
    }


}

package homework.homework10.shapes_v3;

public class Rectangle extends ShapeClass {

    private String name = "Rectangle";
    private String color;
    private double sideOne;
    private double sideTwo;
    private double perimeter;
    private double area;
    private int sideCounter = 1;

    public Rectangle(String color){
        this.color = color;
        this.sideOne = inputData();
        sideCounter++;
        this.sideTwo = inputData();
        perimeter = countPerimeter();
        area = countArea();
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        System.out.println("Rectangle color: " + color);
        System.out.println("Rectangle side 1: " + sideOne);
        System.out.println("Rectangle side 2: " + sideTwo);
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    @Override
    public double inputData() throws IllegalArgumentException {
        System.out.println("Enter a length of a RECTANGLE side " + sideCounter + ":");
        return super.inputData();
    }

    @Override
    public double countPerimeter() {
        perimeter = sideOne + sideTwo;
        return perimeter ;
    }

    @Override
    public double countArea() {
        area = sideOne * sideTwo;
        return area;
    }
}

package homework.homework10.shapes_v3;

public class Triangle extends ShapeClass {

    private String name = "Triangle";
    private String color;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double perimeter;
    private double area;
    private int sideCounter = 1;

    public Triangle(String color) throws IllegalTriangleException{
        this.color = color;
        sideOne = inputData();
        sideCounter++;
        sideTwo = inputData();
        sideCounter++;
        sideThree = inputData();
        if (!(sideOne < sideTwo + sideThree) || !(sideTwo < sideOne + sideThree)
                || !(sideThree < sideOne + sideTwo)){
            throw new IllegalTriangleException();
        }
        perimeter = countPerimeter();
        area = countArea();
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        System.out.println("Triangle color: " + color);
        System.out.println("Triangle side 1: " + sideOne);
        System.out.println("Triangle side 2: " + sideTwo);
        System.out.println("Triangle side 3: " + sideThree);
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    @Override
    public double inputData() throws IllegalArgumentException {
        System.out.println("Enter a length of a Triangle side " + sideCounter + ":");
        return super.inputData();
    }

    @Override
    public double countPerimeter() {
        perimeter = sideOne + sideTwo + sideThree;
        return perimeter ;
    }

    @Override
    public double countArea() {
        double sP = countPerimeter() / 2; //semi-perimeter
        area = Math.sqrt(sP * (sP - sideOne) * (sP - sideTwo) * (sP - sideThree));
        return area;
    }
}

package homework.homework9.shapes_v2;

public class Triangle extends ShapeClass {

    private String name = "Triangle";
    private double side = inputData();
    private double perimeter = side * 3;
    private double area = (Math.pow(side, 2) * Math.pow(3, -3)) / 4;

    public Triangle(String color){
        super(color);
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Triangle side: " + side);
        System.out.println("Triangle area: " + area);
        System.out.println("Triangle perimeter: " + perimeter);
    }

    @Override
    protected double inputData(){
        System.out.println("Enter a side of the Triangle: ");
        return super.inputData();
    }
}
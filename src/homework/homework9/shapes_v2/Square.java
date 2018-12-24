package homework.homework9.shapes_v2;

public class Square extends ShapeClass {

    private String name = "Square";
    private double side = inputData();
    private double perimeter = side * 4;
    private double area = Math.pow(side, 2);

    public Square(String color){
        super(color);
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Square side: " + side);
        System.out.println("Square area: " + area);
        System.out.println("Square perimeter: " + perimeter);
    }

    @Override
    protected double inputData(){
        System.out.println("Enter a side of the Square: ");
        return super.inputData();
    }
}

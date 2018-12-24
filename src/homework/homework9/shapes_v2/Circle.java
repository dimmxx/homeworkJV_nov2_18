package homework.homework9.shapes_v2;

public class Circle extends ShapeClass {

    private String name = "Circle";
    private double radius = inputData();
    private double area = Math.pow(radius, 2) * Math.PI;
    private double circumference = radius * 2 * Math.PI;

    public Circle(String color){
        super(color);
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area);
        System.out.println("Circle сircumference: " + circumference);
    }

    @Override
    protected double inputData(){
        System.out.println("Enter the circle radius: ");
        return super.inputData();
    }
}

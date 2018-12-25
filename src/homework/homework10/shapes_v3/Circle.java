package homework.homework10.shapes_v3;

public class Circle extends ShapeClass {

    private String name = "Circle";
    private String color;
    private double sideOne;
    private double perimeter;
    private double area;

    public Circle(String color){
        this.color = color;
        this.sideOne = inputData();
        perimeter = countPerimeter();
        area = countArea();
    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        System.out.println("Circle color: " + color);
        System.out.println("Circle radius: " + sideOne);
        System.out.println("Circle area: " + area);
        System.out.println("Circle circumference: " + perimeter);
    }

    @Override
    public double inputData() throws IllegalArgumentException {
        System.out.println("Enter a radius of a Circle:");
        return super.inputData();
    }

    @Override
    public double countPerimeter() {
        perimeter = sideOne * 2 * Math.PI;
        return perimeter ;
    }

    @Override
    public double countArea() {
        area = Math.pow(sideOne, 2) * Math.PI;
        return area;
    }
}

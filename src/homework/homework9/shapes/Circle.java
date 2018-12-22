package homework.homework9.shapes;

public class Circle extends ShapeClass {

    private String name = "Circle";
    //private String

    public Circle(String color, double perimeter) {
        super(color, perimeter);


    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Shape area: " + Math.pow(perimeter,2) / (Math.PI * 4));
    }


}

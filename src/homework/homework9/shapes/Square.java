package homework.homework9.shapes;

public class Square extends ShapeClass {

    private String name = "Square";

    public Square(String color, double perimeter){
        super(color, perimeter);

    }

    @Override
    public void printFigure() {
        System.out.println();
        System.out.println("Shape name: " + name);
        super.printFigure();
        System.out.println("Shape area: " + Math.pow((perimeter / 4) ,2));
    }



}

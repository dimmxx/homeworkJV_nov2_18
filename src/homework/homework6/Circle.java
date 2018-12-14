package homework.homework6;

public class Circle {

    private String name = "Circle";
    private String color;
    private double perimeter;
    private double area;

     public Circle(String color, double perimeter){
        this.color = color;
        this.perimeter = perimeter;
        this.area = Math.pow(perimeter,2) / (Math.PI * 4);
    }

    public void printFigure(){
        System.out.println("Figure name: " + name);
        System.out.println("Figure color: " + color);
        System.out.println("Figure perimeter: " + perimeter);
        System.out.println("Figure area: " + area);
    }
}

package homework.homework6;

public class Triangle {

    private String name = "Triangle";
    private String color;
    private double perimeter;
    private double area;

    public Triangle(String color, double perimeter){
        this.color = color;
        this.perimeter = perimeter;
        this.area = Math.pow(perimeter/3, 2)* Math.sqrt(3) / 4;
    }

    public void printFigure(){
        System.out.println("Figure name: " + name);
        System.out.println("Figure color: " + color);
        System.out.println("Figure perimeter: " + perimeter);
        System.out.println("Figure area: " + area);
    }

}

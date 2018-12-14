package homework.homework6;

import java.util.SortedMap;

public class Square {

    private String name = "Square";
    private String color;
    private double perimeter;
    private double area;

    public Square(String color, double perimeter){
        this.color = color;
        this.perimeter = perimeter;
        this.area = Math.pow((perimeter / 4) ,2);
    }

    public void printFigure(){
        System.out.println("Figure name: " + name);
        System.out.println("Figure color: " + color);
        System.out.println("Figure perimeter: " + perimeter);
        System.out.println("Figure area: " + area);
    }

}

package homework.homework16;

public class Circle extends ShapeClass {

    private String name = "Circle";
    private double area;
    private double perimeter;

    public Circle(int side) {
        super(side);
        area = Math.pow(side, 2) * Math.PI;
        perimeter = side * 2 * Math.PI;
        this.add();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

}




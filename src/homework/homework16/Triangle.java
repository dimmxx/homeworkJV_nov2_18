package homework.homework16;

public class Triangle extends ShapeClass {

    private String name = "Triangle";
    private double area;
    private double perimeter;

    public Triangle(int side) {
        super(side);
        area = Math.sqrt(side * 3/2 * (side * 3/2 - side) * (side * 3/2 - side) * (side * 3/2 - side));
        perimeter = side * 3;
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


package homework.homework16;

public class Square extends ShapeClass {

    private String name = "Square";
    private double area;
    private double perimeter;

    public Square(int side) {
        super(side);
        area = Math.pow(side, 2);
        perimeter = side * 4;
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


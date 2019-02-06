package homework.homework16;

public class ShapeClass {

    private int id;
    private String name;
    private double area;
    private double perimeter;
    private int side;
    private String user = "Borysov Dmytro";



    public ShapeClass(){

    }


    public ShapeClass(int side) {
        this.side = side;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }




    public boolean add() {
        DbWorkerItea2 worker = new DbWorkerItea2();
        worker.addShape(this);
        worker.close();
        return true;
    }


    @Override
    public String toString() {
        return "\n" + id + " " + name + " " + area + " " + perimeter + " " + user;
    }

    public void printFigure() {
        System.out.println();
    }


}

package homework.homework13;

public class DogClass {

    private String name;
    private int age;
    private String color;


    public DogClass(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\nDogClass {" + "name = " + name  + ", age = "
                + age + ", color = " + color + "}";
    }
}

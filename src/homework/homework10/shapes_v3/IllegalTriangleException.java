package homework.homework10.shapes_v3;

public class IllegalTriangleException extends Exception {

    @Override
    public String getMessage() {
        return "IllegalTriangleException. Cannot build a triangle with such sides' length. ";
    }
}

package homework.homework9.shapes_v2;

public class Color {

    private static String[] colorBase = {"Red", "Orange","Yellow", "Green", "Blue", "Violet","Brown", "Black ", "Azure", "Grey"};

    public static String getColor(){
        int indx = (int)(Math.random() * 10);
        String color = colorBase[indx];
        return color;
    }
}

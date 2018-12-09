package homework;
import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args){

        //arrayMonth();
        //System.out.println(palindrome());
        runDog();
        //runDogMatrix();

    }

    public static void arrayMonth(){
        int[] array = new int[12];
        for(int i = 0; i < array.length; i++) array[i] = (int)(28 + ((i + 1) + Math.floor((i + 1)/8)) % 2
                + 2 % (i + 1) + 2 * Math.floor(1/(i + 1)));
        System.out.println(Arrays.toString(array));
    }

    public static String palindrome(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] charLine = word.toCharArray();
        scanner.close();
        String pos = "Palindrome:)";
        String neg = "Not a palindrome";
        if (charLine.length % 2 != 0){
            for (int i = 0; i < charLine.length / 2; i++){
                if(charLine[i] != charLine[charLine.length - 1 - i]){
                    return neg;
                }
            }
        }else{
            for(int i = 0; i < charLine.length - 1 / 2; i++){
                if(charLine[i] != charLine[charLine.length - 1 - i]){
                    return neg;
                }
            }
        }
        return pos;
    }

    public static void runDog() {
        char[] array = {'@', '_' ,'_' ,'_' , '_' , '_' ,'_' , '_' ,'_' ,'_' , '_'};
        char dog = array[0];
        int pos = 0;

        Scanner scan = new Scanner(System.in);
        printRunDog(array);

        do {

            if (scan.hasNext("d")) {
                array[pos] = '_';
                if (pos != array.length - 1){
                    pos++;
                } else break;
                array[pos] = dog;
                printRunDog(array);
                scan.next();
            } else if (scan.hasNext("a")) {
                array[pos] = '_';
                if (pos != 0){
                    pos--;
                } else break;
                array[pos] = dog;
                printRunDog(array);
                scan.next();
            } else {
                printRunDog(array);
                System.out.println(" Press A or D!");
                scan.next();
            }

        } while (true);
        scan.close();

    }

    public static void printRunDog(char[] array){
        //System.out.print("\r");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static void runDogMatrix(){
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++) array[i][k] = '_';
        }

        char dog = '@';
        array[0][0] = dog;
        int pos = 0;
        int high = 0;

        Scanner scan = new Scanner(System.in);

        printRunDogMatrix(array);

        do {

            if (scan.hasNext("d")) {
                array[pos][high] = '_';
                if (pos != array.length - 1){
                    pos++;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("a")) {
                array[pos][high] = '_';
                if (pos != 0){
                    pos--;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("s")){
                array[pos][high] = '_';
                if (high != array[pos].length - 1){
                    high++;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("w")){
                array[pos][high] = '_';
                if (high != 0){
                    high--;
                } else break;
                array[pos][high] = dog;
                printRunDogMatrix(array);
                scan.next();
            } else {
                printRunDogMatrix(array);
                System.out.println(" Press A, D, W or S!");
                scan.next();
            }

        } while (true);
        scan.close();
    }

    public static void printRunDogMatrix(char[][] array){
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println();
            for (int k = 0; k < array[i].length; k++){
                System.out.print(array[k][i]);
            }
        }
        System.out.println();
    }
}

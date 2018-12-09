package homework;
import java.util.Scanner;

public class Homework3_1 {

// The aim of the game is to lead the dog to the exit (E).
// Bombs and medkits are generated on every move.

    private static int len = 5; // the length of the field
    private static int height = 10; // the height of the field
    private static int health = 100;
    private static int healthMoveDecrease = 5;
    private static int healthBigBombDecrease = 40;
    private static int healthSmallBombDecrease = 20;
    private static int healthBigMedIncrease = 40;
    private static int healthSmallMedIncrease = 20;
    private static int move = 0;

    public static void main(String[] args) {

        runDog3D(len, height);
    }

    public static void runDog3D(int l, int h){
        char[][] array = new char[l][h];
        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++) array[i][k] = '_';
        }

        char dog = '@';

        array[0][0] = dog; //dog
        array[l - 1][h - 1] = 'E'; //exit

        int pos = 0; //horizontal
        int high = 0; //vertical

        Scanner scan = new Scanner(System.in);

        printRunDogMatrix(array);

        while (health > 0) {
            if (scan.hasNext("d")) {
                array[pos][high] = '_';
                if (pos != array.length - 1 && health > 0){
                    pos++;
                } else break;
                checkMove(array, pos, high);
                move++;
                array[pos][high] = dog;
                health -= healthMoveDecrease;
                generateItems(array);
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("a")) {
                array[pos][high] = '_';
                if (pos != 0){
                    pos--;
                } else break;
                checkMove(array, pos, high);
                move++;
                array[pos][high] = dog;
                health -= healthMoveDecrease;
                generateItems(array);
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("s")){
                array[pos][high] = '_';
                if (high != array[pos].length - 1){
                    high++;
                } else break;
                checkMove(array, pos, high);
                move++;
                array[pos][high] = dog;
                health -= healthMoveDecrease;
                generateItems(array);
                printRunDogMatrix(array);
                scan.next();
            } else if (scan.hasNext("w")){
                array[pos][high] = '_';
                if (high != 0){
                    high--;
                } else break;
                checkMove(array, pos, high);
                move++;
                array[pos][high] = dog;
                health -= healthMoveDecrease;
                generateItems(array);
                printRunDogMatrix(array);
                scan.next();
            } else {
                printRunDogMatrix(array);
                System.out.println("\nPress A, D, W or S!");
                scan.next();
            }
        }
        scan.close();
        System.out.println("You lost!!! The game is over");
    }

     public static void printRunDogMatrix(char[][] array){
        for(int k = 0; k < height; k++){
            System.out.println();
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i][k]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Moves: " + move + " Health: " + health);
    }

    public static void generateItems(char array[][]){

        int rndLenB = (int)(Math.random()*len);
        int rndHiB = (int)(Math.random()*height);
        System.out.println();
        System.out.println("A bomb dropped at: " + rndLenB + ":" + rndHiB);

        if(rndLenB % 2 == 0){
            if(array[rndLenB][rndHiB] == '@'){
                health -= healthBigBombDecrease;
            } else array[rndLenB][rndHiB] = 'B';
        } else {
            if(array[rndLenB][rndHiB] == '@'){
                health -=healthSmallBombDecrease;
            } else array[rndLenB][rndHiB] = 'b';
        }

        int rndLenM = (int)(Math.random()*len);
        int rndHiM = (int)(Math.random()*height);
        System.out.println("A medkit dropped at: " + rndLenM + ":" + rndHiM);

        if(rndHiM % 2 == 0){
            if(array[rndLenM][rndHiM] == '@'){
                health += healthBigMedIncrease;
            } else array[rndLenM][rndHiM] = 'M';
        } else {
            if(array[rndLenM][rndHiM] == '@'){
                health += healthSmallMedIncrease;
                } else array[rndLenM][rndHiM] = 'm';
        }
        array[len -1][height - 1] = 'E';

    }

    public static void checkMove(char[][] array, int pos, int high) {
        if (array[pos][high] == 'B') health -= healthBigBombDecrease;
        if (array[pos][high] == 'b') health -= healthSmallBombDecrease;
        if (array[pos][high] == 'M') health += healthBigMedIncrease;
        if (array[pos][high] == 'm') health += healthSmallMedIncrease;
        if (array[pos][high] == 'E'){
            System.out.println("You won!!! The game is over.");
            System.exit(0);
        }
    }
}

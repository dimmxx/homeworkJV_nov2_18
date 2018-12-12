package homework.homework5;

import java.util.Scanner;

public class PowerSupply {

    private boolean state;
    private boolean mode; //false 5V, true 12V
    String message;
    String errorHV = "High voltage. ";
    String errorLV = "Low voltage. ";
    String okMessage = "The voltage is normal. ";

    Scanner scan = new Scanner(System.in);

    public void getinfo(){
        System.out.println("The power supply is " + (state ? "ON. " : "OFF. ")
                + (message != null ? message : "") + (mode ? "12V " : "5V ")
                + "mode is selected.");
    }

    public void switchMode(){
        if(mode) {
            mode = false;
            getinfo();
        }else {
            mode = true;
            getinfo();
        }
    }

    public void powerSupplyOn(int input){
        if (state = checkVoltage(input)){
            getinfo();
            while (state){
                System.out.println("Enter input voltage (200-250V): ");
                if (scan.hasNextInt()){
                    input = scan.nextInt();
                    state = checkVoltage(input);
                    getinfo();
                } else{
                    System.out.println("Error");
                    scan.next();
                }
            }
        }else {
            state = checkVoltage(input);
            getinfo();
        }
    }

    private boolean checkVoltage(int input) {
        if (input < 200) {
            message = errorLV;
            return false;
        } else if (input > 250) {
            message = errorHV;
            return false;
        }
        message = okMessage;
        return true;
    }
}
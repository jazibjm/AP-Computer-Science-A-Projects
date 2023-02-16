import java.util.Scanner;
public class MicrowaveD {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in); //Scanner
        int input = 0;
        System.out.println("What is your name?");
        String name = sc.next();
        Microwave  U5 = new Microwave(name);        //constructor 
        while (input != 5){
            System.out.println("Input 1 to add 30 seconds, 2 to reset, 3 to change power level, 4 to start, or 5 to stop the program");
            input = sc.nextInt();  //Take input from user to select an action
            switch (input) {
                case 1:            //Adds 30 seconds
                  U5.incTime30();
                  break;
                case 2:          //Resets the microwave 
                  U5.reset();
                  break;
                case 3:              //Changes the power level
                  U5.powerLevel();
                  break;
                case 4:
                    U5.start();     //starts microwave
                  break;
              }
        
            }
    }
}


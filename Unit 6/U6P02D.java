import java.util.Scanner;
public class U6P02D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many dices would you like to roll?");     //Asks user for amount of dices (enhanced)
        int amountOfDice = sc.nextInt();
        U6P02 U6 = new U6P02(amountOfDice);                     //Calls constructor 
        System.out.println("\nThe longest run is:");                //Calls longest instance of dice in a row 
        U6.longestRun(); 
    }
}

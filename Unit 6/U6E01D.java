import java.util.Random;
import java.util.Scanner;
public class U6E01D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the maximum value for the random numbers to be? (Input a whole number)");
        int maxRandom = sc.nextInt();
        U6E01 U6 = new U6E01(maxRandom);                  //Asks user for maximum value of random numbers and constructs class 
        U6.printArray();
        U6.evenIndex();
        U6.evenElement();                  //Calls all the methods 
        U6.printElementsReverse();
        U6.printFirstAndLast();
    }

}

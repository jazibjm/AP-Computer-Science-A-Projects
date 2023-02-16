import java.util.Scanner;
public class U4P05_PrimePrinter {
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");                  //Gets input from user 
        int input = sc.nextInt();
        U4P05_PrimeGenerator U4 = new U4P05_PrimeGenerator();                  //Calls PrimeGenerator class 
        U4.nextPrime(input);

    }
}

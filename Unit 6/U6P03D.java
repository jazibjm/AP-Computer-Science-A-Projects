import java.util.Scanner;

public class U6P03D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many total bathroom stalls?");     //Prompts user for amount of bathroom stalls 
        int stalls = sc.nextInt();
        U6P03 U6 = new U6P03(stalls);
        System.out.println("\nProgression of stalls:");           //show progression of stalls 
        for (int i = 0; i < stalls; i++) {
            U6.findStall();               //Runs find stall for amount of stalls there are 
        }
    }
}

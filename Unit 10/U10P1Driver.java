import java.util.Scanner;

public class U10P1Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);              //Scanner 
        System.out.print("Enter pin number: ");       //Prompts user for pin number 
        String num = sc.nextLine();                     //Sets the pin to a string 
        System.out.println();
        System.out.println("The keypad encodings for " + num + " are:");          
        U10P1Data.enumerateWords(num, "");                //Call the static method 
    }
}
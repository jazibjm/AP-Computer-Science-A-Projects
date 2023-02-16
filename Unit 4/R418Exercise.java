import java.util.Scanner;
import java.lang.Math;
public class R418Exercise
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int amountOfDigits = (int)Math.log10(number);
      int firstDigit = (int)(number / Math.pow(10, amountOfDigits));
      int lastDigit = number % 10;
      System.out.println("First Digit: " + firstDigit);
      System.out.println("Last Digit: " + lastDigit);
   }
}
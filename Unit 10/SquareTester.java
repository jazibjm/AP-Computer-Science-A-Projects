import java.util.Scanner;
public class SquareTester
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("What is the side length of the square?");
      int length = sc.nextInt();    //Prompts user for side length 
      Square square = new Square(length); 
      System.out.println("The area is: " + square.area());  //Prints the area
   }
}
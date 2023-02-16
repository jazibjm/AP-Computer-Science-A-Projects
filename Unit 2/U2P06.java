import java.util.Random;                       //implements the random class 
import java.util.Scanner;                     //implements the scanner class 

public class U2P06
{
   public static void main(String [] args)
   {
      System.out.println("Welcome to the lottery! Pick 6 numbers from 1 - 49");
      Random generator = new Random();
      Scanner sc = new Scanner(System.in);                                                                                  //Creates scanner and generator
      int firstNumber = sc.nextInt();
      int secondNumber = sc.nextInt();
      int thirdNumber = sc.nextInt();                                                                                                 //Gets input of all six numbers from user 
      int fourthNumber = sc.nextInt();
      int fifthNumber = sc.nextInt();
      int sixthNumber = sc.nextInt();
      if(firstNumber > 49 || secondNumber > 49 || thirdNumber > 49 || fourthNumber > 49 || fifthNumber > 49 || sixthNumber > 49)           //Prompts user to restart code if any number is over 49 
      {
         System.out.println("You entered a number over 49. Re-run to try again.");
      }
      if(firstNumber < 1 || secondNumber < 1 || thirdNumber < 1 || fourthNumber < 1 || fifthNumber < 1 || sixthNumber < 1)                   //Prompts user to restart code if any number is under 1 
      {
         System.out.println("You entered a number under 1. Re-run to try again.");
      }
      if(firstNumber > 0 && secondNumber > 0 && thirdNumber > 0 && fourthNumber > 0 && fifthNumber > 0 && sixthNumber > 0 && firstNumber < 50 && secondNumber < 50 && thirdNumber < 50 && fourthNumber < 50 && sixthNumber < 50)
      {
         int firstRandomNumber = generator.nextInt(50);
         int secondRandomNumber = generator.nextInt(50);
         int thirdRandomNumber = generator.nextInt(50);                                                                                     //Gets all the random numbers
         int fourthRandomNumber = generator.nextInt(50);
         int fifthRandomNumber = generator.nextInt(50);
         int sixthRandomNumber = generator.nextInt(50);
         if(firstRandomNumber == firstNumber && secondRandomNumber == secondNumber && thirdRandomNumber == thirdNumber && fourthRandomNumber == fourthNumber && fifthRandomNumber == fifthNumber && sixthRandomNumber == sixthNumber)
         {
            System.out.println("Good job, you won the lottery with the combination: "  + firstRandomNumber + " " + secondRandomNumber + " " + thirdRandomNumber + " " + fourthRandomNumber + " " + fifthRandomNumber + " " + sixthRandomNumber);
         }
            else
         {
         System.out.println("Play this combination: " + firstRandomNumber + " " + secondRandomNumber + " " + thirdRandomNumber + " " + fourthRandomNumber + " " + fifthRandomNumber + " " + sixthRandomNumber + " - It'll make you rich!");    //Prints out the combination of numbers 
         }
      }
   
      
   }
}
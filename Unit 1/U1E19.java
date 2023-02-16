import java.util.Scanner;
public class U1E19
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);                   //initializes scanner to get the integer of the month
      System.out.println("Input the number of a month:");
      int monthNumber = sc.nextInt();
      int monthNumber2 = monthNumber - 1; 
      final String monthName = "Jaunuary  February March    April    May      June     July     August   SeptemberOctober  November December ";              //Creates final string for all the month names to be accessed in following lines
      if (monthNumber <= 12 && monthNumber > 0)
      {  
         if (monthNumber != 1)
         {
            System.out.println("The month is: " + monthName.substring(monthNumber2 * 9 + 1, monthNumber2 * 9 + 10));            //Takes month number and finds month name by using substring method and also multiplying month number by 9 and adding 1 and  for the other input multiplying by 9 and adding 10
         }
         else
         {
            System.out.println("The month is: " + monthName.substring(0,9));                                              //Prints January if month number is 1 
         }
      }
      else
      {
         System.out.println("That month is invalid. Re-run the code to try again.");                              //Shuts off code if the month number is not 1-12
      }
   
   
   }
}
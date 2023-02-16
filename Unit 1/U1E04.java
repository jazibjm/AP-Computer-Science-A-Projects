import java.util.Scanner;
public class U1E04
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);                   //Initializes scanner to get A and B
      System.out.println("Input 2 numbers please:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a + b;
      int difference = a - b;
      int product = a * b;                                    //Gets sum, difference, product, and avg from given numbers
      int avg = sum / 2;
      if (a > b)
      {
         int distance = a - b;                          //Gets integers for distance, max, and minimum
         int maximum = a;
         int minimum = b;
         System.out.println("Sum: " + sum);
         System.out.println("Difference: " + difference);
         System.out.println("Product: " + product);                  //Prints out all the values 
         System.out.println("Average: " + avg);
         System.out.println("Distance: " + distance);
         System.out.println("Maximum: " + maximum);
         System.out.println("Minimum: " + minimum);
      }
      if (b >= a) 
      {
         int distance = b - a;                                //Gets integers for distance, max, and minimum 
         int maximum = b;
         int minimum = a;
         System.out.println("Sum: " + sum);
         System.out.println("Difference: " + difference);       //prints out all the values 
         System.out.println("Product: " + product);
         System.out.println("Average: " + avg);
         System.out.println("Distance: " + distance);
         System.out.println("Maximum: " + maximum);
         System.out.println("Minimum: " + minimum);
      }
   
   
   
   }
}
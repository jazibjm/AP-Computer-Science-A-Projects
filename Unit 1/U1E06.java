import java.util.Scanner;
public class U1E06
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);                   //initializes scanner to get the integer meters
      System.out.println("Input amount of meters:");
      double meters = sc.nextDouble();
      final double METERS_IN_MILE = 1609.34;
      final double METERS_IN_FOOT = 0.3048;                    //Creates values for amount of meters in each measurement
      final double METERS_IN_INCH = 0.0254;
      System.out.println(meters + " meters converted to " + meters / METERS_IN_MILE + " miles.");
      System.out.println(meters + " meters converted to " + meters / METERS_IN_FOOT + " feet.");         //Prints out all the values for the conversions. 
      System.out.println(meters + " meters converted to " + meters / METERS_IN_INCH + " inches.");
      
   
   
   }
}
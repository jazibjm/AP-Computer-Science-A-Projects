import java.util.Scanner;
public class CarTester
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("How much mpg?");
      double mpg = sc.nextDouble();
      System.out.println("How much gas would you like to fuel?");
      double gas = sc.nextDouble();
      System.out.println("How much would you like to drive?");      //Inputs variables from user
      double drive = sc.nextDouble();
      Car car = new Car(mpg); //Constructor 
      car.addGas(gas);  //Adds gas  to car
      car.drive(drive);  //Drives the car
      double amtOfGasLeft = car.getGasInTank();
      System.out.println(amtOfGasLeft + " gas remaining");  //Prints
      sc.close();
   }
}
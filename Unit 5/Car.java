public class Car
{   
   private double gasTank;
   private double fuelEfficiency; //Private variables
  
   public Car()                     //Default constructor
   {
      gasTank = 0;
      fuelEfficiency = 0;
   }
   
   public Car(double mpg)  //Constructor
   {
      gasTank = 0;
      fuelEfficiency = mpg;
   }
   
   public void drive(double miles)  //Drives the car 
   {
      gasTank -= (miles / fuelEfficiency);
   }
   
   public double getGasInTank()  
   {
      return gasTank;         //Returns gas available in car
   }
     
   public void addGas(double gas)   //adds certain amount of gas to tank
   {
      gasTank = gasTank + gas;
   }
   
}//end class
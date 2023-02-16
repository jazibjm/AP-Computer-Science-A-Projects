import java.util.Scanner;
public class Employee
{
   private double percentage;   //Sets up name, salary, percent, and increase.
   private double increase; 
   private String name;
   private double salary; 
   Scanner sc = new Scanner(System.in);  
   public Employee()
   {
      percentage = 0;
      increase = 0;
      name = "";
      salary = 0;
   }
   
   public Employee(String Name, double currentSalary, double percentIncrease)  
   {
      name = Name;
      salary = currentSalary;
      percentage = percentIncrease;  //Construction 
      increase = currentSalary * percentIncrease;
   }
   public String getName() 
   {
      System.out.println("Input the name?");
      name = sc.nextLine();  //Inputs name from user
      return name;
   }
   public double getSalary() 
   {
      System.out.println("Input the salary");
      salary = sc.nextDouble();               //Gets salary from user
      return salary;
   }
   

   public double raiseSalary()   
   {
      salary += increase;       //Raises the salary using the increase var
      return salary;
   }
   public double percentIncrease()  
   {
      System.out.println("What is the percent increase? (Example: Enter 10 for 10%)");
      percentage = sc.nextDouble() * 0.01;              //Inputs percentage increased from the user 
      increase = salary * percentage;
      return increase;
   }
   

   
}
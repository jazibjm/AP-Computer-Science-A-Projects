public class EmployeeTester
{
   public static void main(String [] args)
   {
      Employee U5 = new Employee(); //creates object
      
      //stores values in variables
      String name = U5.getName();            //gets name
      double salary = U5.getSalary();          //gets salary
      double percent = U5.percentIncrease();    //gets percent increase
      double raiseSalary = U5.raiseSalary();       //updates salary    
      System.out.println("Name: " + name);  
      System.out.println("Original Salary: " + salary); 
      System.out.println("The increase in salary is: " + percent);   //Prints all the values
      System.out.println("The new salary is " + raiseSalary);  
      
   }
}
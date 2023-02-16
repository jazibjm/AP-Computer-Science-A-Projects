import java.util.Scanner;
public class FactorTester
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);   //Creates a scanner 
      Factor factor = new Factor();   //Factor oject
      
      
      System.out.println("What number would you like to factor?");    //Asks user what number they would like to factor 
      int num = sc.nextInt(); 
      
      factor.factor(num);//Calls needed method for factoring the number inputted earlier 
      factor.printFactors();  //Prints 
   }
}
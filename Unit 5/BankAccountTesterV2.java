import java.util.Scanner;
public class BankAccountTesterV2
{
   public static void main(String [] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Input a transaction fee. (There are 3 transactions for free)");            //Prompts user for transaction fee
      double transactionFee = sc.nextDouble();
      BankAccountV2 U5 = new BankAccountV2(transactionFee);    
      String input = "";
      outer:
      while (input != "S")              //Loop for depositing, withdrawing, or stop
      {
         System.out.println("Enter D to deposit, W to withdraw, or enter stop to stop");
         input = sc.next();
         switch (input)             //Switch to choose between all 3 cases 
         {
            case "D":
               U5.depositMoney();  //Deposit money
               break;
               
            case "W":
               U5.withdrawMoney();       //Withdraw money 
               break;
            case "stop":
               break outer;  //Breaks out of 2 loops 
               
         }
      }
      
      U5.deductMonthlyChargeAndPrint();   //Print + deduct the monthly transaction fees
      
   }
}
import java.util.Scanner;   //Import scanner
public class BankAccountV2
{
   Scanner sc = new Scanner(System.in);       //Sets up the scanner to be used in the following methods 
   private double balance;
   private double deposit;
   private double withdraw;                 //Sets up all private doubles to be used in the methods 
   private double transactionFee;
   private int amtOfFreeTransaction;
   private int counter;
   private int amtOfFreeTransactionDeducted;
   public BankAccountV2()
   {
      transactionFee = 0;
      balance = 0;
      deposit = 0;
      withdraw = 0;
      amtOfFreeTransaction = 3;
      counter = 0;
      amtOfFreeTransactionDeducted = 0;
   }
   public BankAccountV2(double fee)    
   {
      transactionFee = fee;   //Inputs tFee from bank account tester class  and assigns it to transaction fee 
      balance = 0;
      deposit = 0;
      withdraw = 0;
      amtOfFreeTransaction = 3;
      counter = 0;
      amtOfFreeTransactionDeducted = 0;
   }
   public void withdrawMoney()
   {
      System.out.println("Enter withdraw amount ");
      withdraw = sc.nextDouble();                        //Withdraw method 
      if (withdraw <= balance)
      {            
         balance -= withdraw;  
         counter++; 
         System.out.println("Transaction #: " + counter + " You withdrew $"+ withdraw + " and you account balance is " + balance + " before fees.");
      }
      else
      {
         System.out.println("You don't have enough balance to withdraw!");
      }
   }
   public void depositMoney()
   {
      System.out.println("Enter deposit amount");
      deposit = sc.nextDouble();                             //Deposit and print deposit
      balance += deposit;  
      counter++;
      System.out.println("Transaction #: " + counter + " You deposited $"+ deposit + " and your account balance is " + balance + " before fees."); 
   }
   public void deductMonthlyChargeAndPrint()
   {
      amtOfFreeTransactionDeducted = counter - amtOfFreeTransaction;      //Deducts amont of feed transactions from total transactions
      if (amtOfFreeTransactionDeducted < 0)
      {
         amtOfFreeTransactionDeducted = 0;
      }
      if (counter > amtOfFreeTransaction)
      {
         balance -= transactionFee * amtOfFreeTransactionDeducted;  //Calculates amount of transaction fees
      } 
      System.out.println("The final balance is " + balance);
      System.out.println("The amount that was charged due to fees was " + (amtOfFreeTransactionDeducted * transactionFee));   //Prints all values 
      System.out.println("The amount of charged transactions is " + (counter - amtOfFreeTransaction));     
   }
}
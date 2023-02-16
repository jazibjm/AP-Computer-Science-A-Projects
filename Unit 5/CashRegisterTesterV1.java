import java.util.Scanner;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTesterV1
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);                   //Scanner 
      final Coin DOLLAR = new Coin(1.0, "Dollar");            //Sets up coin values 
      final Coin QUARTER = new Coin(0.25, "Quarter");
      String finalReceipt = "";                    
      double finalPurchasePrice = 0;                         //Final purchase price and receipt 
      System.out.println("What's your name?");
      String name = sc.next();
      CashRegisterV1 register = new CashRegisterV1(name);               //Calls constructor from cashregv1 class 

      register.recordPurchase(1.95);
      register.printReceipt(1.95);
      finalPurchasePrice = register.recordPurchase(1.40);             //Records all purchases and puts finalpurhase price on the final values 
      finalReceipt = register.printReceipt(1.40);
      register.receivePayment(3, DOLLAR);                             //Receives payment from user 
      register.receivePayment(2, QUARTER);

      double change = register.giveChange();
      register.printUsername();                                              //Prints all final values 
      System.out.println("Change: " + change);      
      //System.out.println("Expected: 0.15");   
      System.out.println("Receipt:");
      System.out.print(finalReceipt);
      System.out.println("Total price: " + finalPurchasePrice);
             
   }
}

import java.util.Scanner;
/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      final Coin DOLLAR = new Coin(1.0, "Dollar"); //Sets up dollar and dollar value 
      final Coin QUARTER = new Coin(0.25, "Quarter"); //Sets up quarter and quarter value
      final Coin DIME = new Coin(0.10, "Dime"); //Sets up dime and dime value
      final Coin NICKEL = new Coin(0.05, "Nickel"); //Sets up nickel and nickel value
      final Coin PENNY = new Coin(0.01, "Penny"); //Sets up penny and penny value
      String finalReceipt = "";                    //String for the final receipt
      double finalPurchasePrice = 0;             //Variables for final purchase price and final amount of tax
      double finalAmountOfTax = 0;
      double tax = 0.053; //Sales tax in VA in most locations according to google 
      CashRegister register = new CashRegister(tax);                //Sets up constructor with one arg 
      int amountOfNonTaxedItems = register.amountofNonTaxItem();         //Gets amount of nontaxed items
      int count = 1;
      double nontaxPrice = 0;
      double finalPurchasePriceWTax = 0;          //Sets up doubles to be used
      double taxPrice = 0;
      while(amountOfNonTaxedItems > 0)            //While loop for amount of non taxable items 
      {
         System.out.println("What is the price of non-taxed item #" + count);     //Prompts user for price of non taxable item
         nontaxPrice = sc.nextDouble();
         finalPurchasePrice = register.recordPurchase(nontaxPrice);      //Calls methods to print receipt and record the purchase
         finalReceipt = register.printReceipt(nontaxPrice);
         count++;                                                    //Counter
         amountOfNonTaxedItems--;
      }
      int amountOfTaxedItems = register.amountOfTaxItem();  //Prompts user for amount of taxed items
      count = 1;
      while(amountOfTaxedItems > 0)                   //While loop for amount of taxed items
      {
         System.out.println("What is the price of taxed item #" + count);     //Prompts user for price of taxed items
         taxPrice = sc.nextDouble();
         finalPurchasePriceWTax = register.recordTaxablePurchase(taxPrice);     //Calls methods for recording taxable purchase and printing receipt
         finalReceipt = register.printReceipt(taxPrice * tax + taxPrice);
         finalAmountOfTax = register.getTotalTax(taxPrice);
         amountOfTaxedItems--;
         count++;            //Counter
      }
      register.receivePayment(register.dollars(), DOLLAR);    //Recieves payment from user in dollars
      register.receivePayment(register.quarters(), QUARTER); //Recieves payment from user in quarters 
      register.receivePayment(register.dimes(), DIME); //Recieves payment from user in dimes
      register.receivePayment(register.nickels(), NICKEL); //Recieves payment from user in nickels
      register.receivePayment(register.pennies(), PENNY); //Recieves payment from user in pennies
      double change = register.giveChange(); //Processes change by calling change method
      register.finalReceiptPrinter(finalReceipt, finalPurchasePrice, finalPurchasePriceWTax, finalAmountOfTax, change);
      sc.close();

             
   }
}

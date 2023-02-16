/**
   A cash register totals up sales and computes change due.
*/
import java.util.Scanner;
public class CashRegister
{
   Scanner sc = new Scanner(System.in);
   private double purchase;    //Sets up non tax purchase variable       
   private double taxedPurchase;  //Setups up taxed purchase variable
   private double payment;  //Sets up payment amount 
   private double tax;          //Sets up tax variable
   private double totalTax;       //Sets up the total amount of tax var
   private String receipt;              //String for the receipt 
   private String item;            //String for each item

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()                         //Default constructor 
   {
      purchase = 0;    //Sets up non tax purchase variable       
      taxedPurchase = 0;  //Setups up taxed purchase variable
      payment = 0;  //Sets up payment amount 
      tax = 0;          //Sets up tax variable
      totalTax = 0;       //Sets up the total amount of tax var
      receipt = "";              //String for the receipt 
      item = "";        
   }
   public CashRegister(double taxPercentage)    //1 arg Constructor
   {
      purchase = 0;    //Sets up non tax purchase variable       
      taxedPurchase = 0;  //Setups up taxed purchase variable
      payment = 0;  //Sets up payment amount 
      totalTax = 0;       //Sets up the total amount of tax var
      receipt = "";              //String for the receipt 
      item = ""; 
      tax = taxPercentage;  //Makes tax = taxpercentage so other methods can access it 
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public double recordPurchase(double amount)
   {
      purchase += amount;   //adds to non taxable purchase and then returns it 
      return purchase;
   }
   public double recordTaxablePurchase(double amount)
   {
      
      taxedPurchase += (amount * tax) + amount; //Calculations of taxed purchase with tax and records it 
      return taxedPurchase;
   }
   /**
      Enters the payment received from the customer.
      @param coinCount the number of coins received
      @param coinType the type of coin that was received
   */
   public void receivePayment(int coinCount, Coin coinType)
   {
      payment = payment + coinCount * coinType.getValue();      //Caluclates each coin 
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase - taxedPurchase;         //Calculates change 
      purchase = 0;
      payment = 0;
      return change;   //returns the change 
   }
   public double getTotalTax(double taxes)
   {
      totalTax += taxes * tax;           //Calculates total amount of taxes
      return totalTax; 
   }
   int counter = 1;
   public String printReceipt(double amt)
   {
      item = String.valueOf(amt);
      receipt = receipt.concat("Item #" + counter + ": $" + item + "\n"); //Receipt printer
      counter++;
      return receipt;

   } 
   public int dollars()
   {
      System.out.println("How many dollars would you like to pay?");
      int amountOfDollars = sc.nextInt();
      return amountOfDollars;
   }
   public int quarters()
   {
      System.out.println("How many quarters would you like to pay?");
      int amountOfQuarters = sc.nextInt();
      return amountOfQuarters;
   }
   public int dimes()
   {
      System.out.println("How many dimes would you like to pay?");
      int amountOfDimes = sc.nextInt();
      return amountOfDimes;
   }
   public int nickels()
   {
      System.out.println("How many nickels would you like to pay?");
      int amountOfNickels = sc.nextInt();
      return amountOfNickels;
   }
   public int pennies()
   {
      System.out.println("How many pennies would you like to pay?");
      int amountOfPennies = sc.nextInt();
      return amountOfPennies;
   }
   public int amountofNonTaxItem()
   {
      System.out.println("How many non-taxable items?");
      int amtOfNonTaxItems = sc.nextInt();
      return amtOfNonTaxItems;
   }
   public int amountOfTaxItem()
   {
      System.out.println("How many taxable items?");
      int amtOfTaxItems = sc.nextInt();
      return amtOfTaxItems;
   }
   public void finalReceiptPrinter(String finalReceipt, double finalPurchasePrice, double finalPurchasePriceWTax, double finalAmountOfTax, double change) 
   {
      if (change >= 0){
         System.out.println("Receipt:");
         System.out.print(finalReceipt);
         System.out.println("Subtotal price: " + (finalPurchasePrice + (finalPurchasePriceWTax - finalAmountOfTax)));
         System.out.println("The total amount that was taxed was " + finalAmountOfTax);
         System.out.println("Total price: " + (finalPurchasePrice + finalPurchasePriceWTax));
         System.out.println("Amount of change: " + change);      
      }
      else
      {
         System.out.println("PURCHASE COULD NOT BE COMPLETED. INSUFFICIENT BALANCE.");
      }
   }
}

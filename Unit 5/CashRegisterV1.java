/**
   A cash register totals up sales and computes change due.
*/
public class CashRegisterV1
{
   private double purchase;
   private double payment;
   private String username;
   private String receipt;
   private String item;
   private int counter;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegisterV1()                      //Default constructor 
   {
      receipt = "";
      item = "";
      counter = 1;
      purchase = 0;
      payment = 0;
      username = "";
   }
   public CashRegisterV1(String name)         //1 Arg constructor 
   {
      receipt = "";
      item = "";
      counter = 1;
      purchase = 0;
      payment = 0;
      username = name;

   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public double recordPurchase(double amount)                 //Record purchase 
   {
      purchase = purchase + amount;                               //Adds purchase to amount 
      return purchase;
   }
   
   /**
      Enters the payment received from the customer.
      @param coinCount the number of coins received
      @param coinType the type of coin that was received
   */
   public void receivePayment(int coinCount, Coin coinType)                        //recieves coin payments 
   {
      payment = payment + coinCount * coinType.getValue();
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;                                  //Gives user  change 
      purchase = 0;
      payment = 0;
      return change;
   }
   public void printUsername()
   {
      System.out.println("Thank you for your purchase, " + username);
   }
   public String printReceipt(double amt)                                     //Prints each item on the receipt 
   {
      item = String.valueOf(amt);
      receipt = receipt.concat("Item #" + counter + ": $" + item + "\n");
      counter++;
      return receipt;

   } 
}

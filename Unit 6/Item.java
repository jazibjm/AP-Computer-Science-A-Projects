import java.util.Scanner;

public class Item
{    
   boolean pet;             //Starting variables up 
   int amtOfItems;
   double itemPrice;          //Cant be private because other classes need to be used.
   Invoice U6 = new Invoice();
   Scanner sc = new Scanner(System.in);
   public Item()   
   {
      itemPrice = 0;       //Default constructor and assigning variables 
      amtOfItems = 0;
      pet = false;
      
   }
   
   public Item(double price, boolean isPet, int quantity)   
   {
      itemPrice = price;       
      amtOfItems = quantity;                            //3 arg constructor
      pet = isPet;
      
   }
   public double setItem()
   {
      int sv = 0; 
      while(sv != -1)     //While the sentinel value doesnt equal -1 (-1 is used to stop using it)
      {
        System.out.println("Pet in this order? (True or false)");              //Asks if user has a pet 
        boolean pet = sc.nextBoolean();
         System.out.println("Whats the price of the item/pet?");                //Asks the price of item 
         double price = sc.nextInt();
         System.out.println("Whats the quantity of items/pets?");           //Asks about the quantity of the items 
         int quantity = sc.nextInt();
         Item Items = new Item(price, pet, quantity);                  
         U6.add(Items);
         System.out.println("Purchase more items? -1 for no, any other number for yes");    //Asks user if more items/pets need to be purchased
         sv = sc.nextInt();
      }
      return U6.getDiscount();
   }
   
}
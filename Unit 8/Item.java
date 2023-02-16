public class Item
{    
   double itemPrice;
   boolean pet;       //Instance variables 
   int amtOfItems;
   
   public Item()                  //Default constructor 
   {
      itemPrice = 0;
      pet = false;
      amtOfItems = 0;
   }
   
   public Item(double price, boolean isPet, int quantity)   
   {
      pet = isPet;
      amtOfItems = quantity;
      itemPrice = price;               //Sets up the 3 arg constructor 
      
   }

   public String setItem() {
      return null;
   }
   
}
import java.util.ArrayList;        //Import for array list 
public class Invoice
{  
   ArrayList <Item> items;
   int petCount;              
   int amtOfItems2;        //Instance vars 
   double itemPrice2;   
     
   public Invoice()   //default constructor
   {
      items = new ArrayList<Item>();
      petCount = 0;
      amtOfItems2 = 0;
      itemPrice2 = 0;
   }
   
   public void add(Item anItem)        //Adds an item to the array  list if it is called 
   {
      items.add(anItem); 
   }
   
   public double getDiscount()   
   {  
      for(int i = 0; i < items.size(); i++)   //Scans all items in array
      {
        if(items.get(i).pet)  
        {
           petCount += items.get(i).amtOfItems;   
        }
        else
        {
           amtOfItems2 +=  items.get(i).amtOfItems;   
           itemPrice2 += items.get(i).itemPrice * items.get(i).amtOfItems;
        }
      }
      System.out.println("Pet count: " + petCount);
      System.out.println("Amt of items: " + amtOfItems2);
      if(petCount >= 1 && amtOfItems2 >= 5)  
      {
         return itemPrice2 * 0.2;           //Returns the discounted value 
      }
      else
      {  
         return 0;   //Returns 0 if no discount is allowed 
      }
   }
   
}
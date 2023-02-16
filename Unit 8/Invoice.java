import java.util.*;  //Import 
public class Invoice
{   
   private ArrayList<Item> objects;
   private int amtofPets;              //Instance variables 
   private double normItemCount;        
   private double nonPetPrice;   
   private int sv;
      
   public Invoice()                 //Default constructor
   {
      objects =  new ArrayList<Item>();
      amtofPets = 0;
      normItemCount = 0;
      nonPetPrice = 0;
      sv = 0;
   }
   
   public void getData()
   {
      Scanner sc = new Scanner(System.in);   //Scanner
      
      while(sv != -1)
      {
         System.out.println("Price of Item? ");
         double price = sc.nextInt();
         System.out.println("Pet, true or false?");//Prompts user and asks for price, if its a pet, and the amount of such item
         boolean pet = sc.nextBoolean();
         System.out.println("Quantity of Items? ");
         int quantity = sc.nextInt();
         
        
         Item U8 = new Item(price, pet, quantity);           
         objects.add(U8);
         
         System.out.println("Purchase more items? -1 to stop, 0 to continue");  //Prompts user and asks them if they would like to purchase more items 
         sv = sc.nextInt();
      }
   
   }
   
   public void add(Item anItem)    //Adds an item
   {
      objects.add(anItem);
   }
   
   public double getDiscount()   
   {  
      for(int i = 0; i < objects.size(); i++)   //For loop up until max array list
      {
         if(objects.get(i).pet)  
         {
            amtofPets += objects.get(i).amtOfItems;   //Pet counter 
         }
         else
         {
            normItemCount += objects.get(i).amtOfItems;   //Adds amojunt of normal items to a counter
            
            nonPetPrice += objects.get(i).itemPrice * objects.get(i).amtOfItems;   //Adds price for nonpet 
         }
      }
      if(amtofPets >= 1 && normItemCount >= 5)  //Checks if the amount of pets is more than or equal to 1 and the amount of normal items is more than or equal to 5
      {
         return nonPetPrice * 0.2;   //Returns amount that is discounted 
      }
      else
      {  
         return 0;   //Returns no discount 
      }
   }
   
   public void print()
   {
      System.out.println("Discount: $" + getDiscount());   //Prints the final discount 
   }
   
}
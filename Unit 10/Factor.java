import java.util.ArrayList;
public class Factor
{
   ArrayList<Integer> list;   //Instance variable for array list 
   
   public Factor()   
   {
      list = new ArrayList<Integer>();    //sets the list to a new list 
   }
   
   public void factor(int num) //Method to compute the factors using the value given by method header and adds the factors to the array list 
   {
      if(num == 0 || num == 1) 
      {
         list.add(num);
      }
      else
      {
         int factor = 0;
         int divisible = 2;
      
         while(divisible <= Math.ceil(num / 2))  
         {
            if(num % divisible == 0)
            {
               factor = divisible; 
               list.add(factor);
               break;  //Breaks to the outside 
            }
            divisible++; //Increment divisible 
         }
         if(factor == 0)  
         {
            list.add(num);//Adds to the list 
         }
         else
         {
            factor(num/factor); //Recursive method 
         }
      }
   }
   
   public void printFactors() //Print method 
   {
      System.out.print("The factors are: ");
      for(int i : list) //Goes through whole array list using a enhanced loop 
      {
         System.out.print(i + ", ");
      }
   }
}
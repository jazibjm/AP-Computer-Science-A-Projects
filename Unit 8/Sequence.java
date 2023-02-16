import java.util.*;
public class Sequence
{
   private ArrayList<Integer> values;       //Creates the instance variable 
    
   public Sequence()                      //Default constructor 
   {
      values = new ArrayList<Integer>();
   }
   
   public Sequence(int nextInt) {
   }

   public void add(int n)  //Adds an element 
   { 
      values.add(n); 
   }
   
   public String toString()             //Turns an arraylist into a string 
   {
      return values.toString();
   }
   
   public Sequence merge(Sequence other)                       //Adds the 2 arrays together (example: array a: 1,2,3; array b: 4,5,6; new array: 1,2,3,4,5,6)
   {
      Sequence newSequence = new Sequence();
      for(int i = 0; i < this.values.size(); i++)
      {
         newSequence.add(this.values.get(i));
      }
      for(int i = 0; i < other.values.size(); i++)
      {
         newSequence.add(other.values.get(i));
      }
      return newSequence;
   }
   
   public Sequence alternateMerge(Sequence other)  //Adds the 2 arrays together (example: array 1: 1,2,3; array 2: 4,5,6; new array: 1,4,2,5,3,6)
   {
      Sequence newSequence = new Sequence();
      int a1 = this.values.size();
      int a2 = other.values.size();
      
      if(a1 < a2)                                         //Sees if an array is longer
      {
         for(int i = 0; i < this.values.size(); i++)                  //Alternates and adds them 
         {
            newSequence.add(this.values.get(i));
            newSequence.add(other.values.get(i));
         }
         for(int i = a2 - a1 + 1; i < other.values.size(); i++)        //Adds the leftover values
         {
            newSequence.add(other.values.get(i));    
         }
      }
      else if(a1 > a2)                      //Checks if the other one is larger 
      {
         for(int i = 0; i < other.values.size(); i++)     //Alternates and adds them 
         {
            newSequence.add(this.values.get(i)); 
            newSequence.add(other.values.get(i));
         }
         for(int i = a1 - a2 + 1; i < this.values.size(); i++)    //Adds the remaining values 
         {
            newSequence.add(this.values.get(i)); 
         }
      }
      else           //If both sequences are the same length 
      {
         for(int i = 0; i < this.values.size(); i++)    //Alternates and adds them to the new sequence
         {
            newSequence.add(this.values.get(i));    
            newSequence.add(other.values.get(i));
         }
      }
      return newSequence;
   }

   public Sequence sortMerged(Sequence other)   //Same as a previous one but sorts it 
   {
      Sequence newSequence = new Sequence();
      for(int i = 0; i < this.values.size(); i++)             //Does one array then the other
      {
         newSequence.add(this.values.get(i));
      }                    
      for(int i = 0; i < other.values.size(); i++)
      {
         newSequence.add(other.values.get(i));
      }
      Collections.sort(newSequence.values);       //Sorts
      return newSequence;           //Returns the sorted array 
   }

public void set(int sequenceNumber) {
}

public void result(boolean check) {
}
}
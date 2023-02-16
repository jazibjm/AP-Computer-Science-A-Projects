public class U8E222324D
{
   public static void main(String [] args)
   {
      Sequence a = new Sequence();     //Creates 2 new sequence objects 
      Sequence b = new Sequence();
      
      a.alternateMerge(b);
      a.merge(b);                //Calls all the methods in the sequence class 
      a.sortMerged(b);
   
   }
}
public class TruthTable
{
   public static void main(String [] args)
   {
      boolean theTrue = true;
      boolean theFalse = false;                                                          //Sets up booleans to use in the truth tables
      boolean trueAnswer = true;
      boolean falseAnswer = false;
      System.out.println("AND truth table");
      System.out.println(theTrue + " and " + theTrue + " = " + trueAnswer);
      System.out.println(theTrue + " and " + theFalse + " = " + falseAnswer);
      System.out.println(theFalse + " and " + theTrue + " = " + falseAnswer);                //AND truth table lines
      System.out.println(theFalse + " and " + theFalse + " = " + falseAnswer);
      System.out.println();
      System.out.println("OR truth table");
      System.out.println(theTrue + " or " + theTrue + " = " + trueAnswer);
      System.out.println(theTrue + " or " + theFalse + " = " + trueAnswer);
      System.out.println(theFalse + " or " + theTrue + " = " + trueAnswer);                //OR truth table lines
      System.out.println(theFalse + " or " + theFalse + " = " + falseAnswer);
      System.out.println();
      System.out.println("NOT truth table"); 
      System.out.println("not " + theFalse + " = " + trueAnswer);                                  //NOT truth table lines 
      System.out.println("not " + theTrue + " = " + falseAnswer);
   
      
   }//end of main
}//end oc class
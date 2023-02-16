public class U2E03
{
   public static void main(String [] args)
   {
      String mississippi = "Mississippi";
      
      mississippi = mississippi.replace("i", "ii");     //Replaces every "i" with "ii"
      System.out.println(mississippi);                      //Prints out "Miissiissiippii after replacement of "i"
      
      mississippi = mississippi.replace("ss", "s");        //Replaces every "ss" with "s"
      System.out.println(mississippi);               //Prints out Miisiisiipii after replacement of "ss"
   }
}

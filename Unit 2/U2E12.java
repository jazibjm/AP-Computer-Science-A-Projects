import java.util.Random;                       //implements the random class 

public class U2E12
{
   public static void main(String [] args)
   {
   Random generator = new Random();                    //Creates the new generator 
   int randomNumber = generator.nextInt(6);            //Generates a random number from 0 to 5 
   System.out.println("Random number from 0 to 5: " + randomNumber);              //Prints out the number               
   }
}

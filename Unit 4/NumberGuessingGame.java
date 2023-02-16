import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input a random 4 digit number");                                //Asks user to input random number that is 4 digits 
        String guessedNumber = sc.next();
        Double randomNumber = Math.random();
        String randomNumber2 = Double.toString(randomNumber).substring(2,6);                     //Takes the 4 digits using substring and also converts the Double to a string 
        String result = "";
        for(int i = 0; i <= 3; i++)                                                 //For loop that counts up to 3 
        {
            if(randomNumber2.charAt(i) == guessedNumber.charAt(i))  
            {
                result += randomNumber2.charAt(i);                                      //Adds number if correct 
            }
            else
            {
                result += "x";                                                        //adds x if number is incorrect 
            }
        }
        System.out.println("The code was " + randomNumber2);
        System.out.println("The code you inputted was " + guessedNumber);             //Prints out many values.
        System.out.println("Your result was " + result);
        sc.close();
        
    }
}

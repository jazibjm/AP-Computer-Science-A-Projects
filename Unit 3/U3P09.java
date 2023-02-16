import java.util.Scanner;
public class U3P09 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to input?");            //Asks for number to input 
        int number = sc.nextInt();
        String numerals = "Your number in roman numerals is ";
        
        if(number <= 3999 && number > 0)                   //Finds out if number is invalid for the roman numeral system 
        {
            while(number >= 1000)
            {
                numerals = numerals + "M";                      //Prints out M while number is more than 1000
                number = number - 1000;
            }
            while(number >= 900)
            {
                numerals = numerals + "CM";                      //Prints out CM while number is more than 900
                number = number - 900;
            }
            while(number >= 500)
            {
                numerals = numerals + "D";                      //Prints out D while number is more than 500
                number = number - 500;
            }
            while(number >= 400)
            {
                numerals = numerals + "CD";                      //Prints out CD while number is more than 400
                number = number - 400;
            }
            while (number >= 100) 
            {
                numerals = numerals + "C";                      //Prints out C while number is more than 100
                number = number - 100;
            }
            while (number >= 90)
             {
                numerals = numerals + "XC";                      //Prints out XC while number is more than 90
                number = number - 90;
            }
            while (number >= 50)
             {
                numerals = numerals + "L";                      //Prints out L while number is more than 50
                number = number - 50;
            }
            while (number >= 40) 
            {
                numerals = numerals + "XL";                      //Prints out XL while number is more than 40
                number = number - 40;
            }
            while (number >= 10)
             {
                numerals = numerals + "X";                      //Prints out X while number is more than 10
                number = number - 10;
            }
            while (number >= 9) 
            {
                numerals = numerals + "IX";                      //Prints out IX while number is more than 9
                number = number - 9;
            }
            while (number >= 5) 
            {
                numerals = numerals + "V";                      //Prints out V while number is more than 5
                number = number - 5;
            }
            while (number >= 4)
             {
                numerals = numerals + "IV";                      //Prints out IV while number is more than 4
                number = number - 4;
            }
            while (number >= 1) 
            {
                numerals = numerals + "I";                      //Prints out I while number is more than 1
                number = number - 1;
            }
            System.out.println(numerals);
            
        }
        else
        {
            System.out.println("Invalid number! Please try again!"); //Prints out if number is invalid 
        }
        sc.close();
    }
}

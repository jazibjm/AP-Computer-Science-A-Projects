import java.util.Scanner;
public class U3E03 {
    public static void main(String [] args){
        System.out.println("Input a number");             //Prompts the user for a number 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();       
        int digits = 0; 
        if(number<0)
        {
            number = number * -1;
        }
        while(number != 0)
        {
            number = number/10;                        //Divides number by 10, adds one to digit until number is 0 
            digits++;
        }
 
            
         System.out.println(digits + " digits");               //Prints the digits 
        
        sc.close();



    }
    
}

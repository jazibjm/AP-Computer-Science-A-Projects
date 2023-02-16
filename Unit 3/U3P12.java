import java.util.Scanner;
public class U3P12 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        String pin = "1234";                                  //The pin is 1234
        String try1 = "";
        String try2 = "";
        String try3 = "";
        System.out.println("What is your pin?");                    //Prompts user for pin 
        try1 = sc.next();
        if(try1.equals(pin))                                             //Trial 1 
        {
            System.out.println("Your PIN is correct.");
        }
        else
        {
            System.out.println("Your pin is incorrect. Try again.");
            try2 = sc.next();                                             //Prompts user for 2nd trial pin 
            if(try2.equals(pin))
            {
                System.out.println("Your PIN is correct.");
            }
            else
            {   
                System.out.println("Your pin is incorrect. Try again.");                 //Prompts user for 3rd trial pin 
                try3 = sc.next();
                if(try3.equals(pin))
                {
                    System.out.println("Your PIN is correct.");
                }
                else
                {
                    System.out.println("Your pin is incorrect.");                   //Blocks card after 3 incorrect attempts. 
                    System.out.println("Your bank card is blocked.");
                }
            }
        }
        sc.close();
    }
}
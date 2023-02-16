import java.util.ArrayList;
import java.util.Scanner;          //imports 
public class TelephoneLookupData {
    public void data()
    {
        ArrayList<PhoneNumber> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i ++)     //Inputs 5 ppls info 
        {
            System.out.println("Enter a name for user " + (i+1) );
            String name = sc.nextLine();                               //Prompts user for name and phone number 
            
            System.out.println("Enter a phone number for user " + (i + 1));
            int num = sc.nextInt();
            list.add(new PhoneNumber(name, num));
            sc.nextLine();
        }
        int sentinel = 1;        //sent value 
        int value = 0;
        while(sentinel == 1)
        {
            value = 0;
            System.out.println("Find a name by phone number or a phone number by name? 1 for option one, 2 for option two.");
            value = sc.nextInt();
            if(value==1)
            {
                boolean found = false; 
                System.out.println("Enter a phone number:");
                int phoneNumber = sc.nextInt();
                for(int i = 0; i < list.size(); i++)
                {
                    
                        if(phoneNumber == list.get(i).getNum())
                        {
                            System.out.println("The name is " + list.get(i).getName());   //searches for name 
                            found = true;
                        }
                    
                }
                if(!found)
                {
                    System.out.println("No name was found with the inputted phone number.");
                }
            }
            else if(value==2)
            {
                sc.nextLine();
                boolean found = false; 
                System.out.println("Enter a name:");
                String thename = sc.nextLine();
                for(int i = 0; i < list.size(); i++)
                {
                    
                        if(thename.equals(list.get(i).getName()))
                        {
                            System.out.println("The phone number is " + list.get(i).getNum());     //searches for phone num 
                            found = true;
                        }
                
                }
                if(!found)
                {
                    System.out.println("No phone number was found with the inputted name.");   //Sends prompt if not found 
                }
            }
            else{
                System.out.println("Invalid value.");
            }
            System.out.println("Would you like to find another phone number or name? 1 for yes, 0 for no");  //Prompts user to find another phone numbeer 
            sentinel = sc.nextInt();
        }
        System.out.println("Thank you!");  //Prints out at end of program 
    }
}

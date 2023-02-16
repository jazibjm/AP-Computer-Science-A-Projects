import java.util.Scanner;
public class U5P10D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //sets up the scanner
        System.out.println("How many initial roaches?"); //prompts user for initial amount of roaches
        double initialRoaches = sc.nextDouble(); //sets up var for initial amount of roaches 
        System.out.println("What is your spray reduce rate? (for example for 10% just enter 10)"); //Spray reduction rate prompt
        double sprayRate = sc.nextDouble() * 0.01;  //spray reduction rate var
        System.out.println("How many times would you like to run the simulation?"); // prompts user for amount of times the simulation should be run 
        int amountOfTimes = sc.nextInt();  //Var for amount of times sim should be run
        U5P10 roach = new U5P10(initialRoaches, sprayRate); //Constructs roach sim 
        for(int i = 0; i < amountOfTimes; i++)     //For loop for amount of times inputted from user
        {
            roach.breed();  //calls method for breeding 
            roach.spray();   //calls method for spraying 
            roach.getRoaches();    //Calls method for printing roaches. 
        }
        sc.close();

    }
}
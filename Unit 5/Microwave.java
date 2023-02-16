import java.util.*;

public class Microwave {
   private int time;
   private int powerLvl;                   //Sets up variables
   private int amtofTimeButtonisPressed;
   private String name;
   public Microwave()
   {
       time = 0;
       powerLvl = 0;
       amtofTimeButtonisPressed = 0;
       name = "";
   }
   public Microwave(String z)
   {
        name = z;
   }
    Scanner sc = new Scanner(System.in);
    public void incTime30(){
        System.out.println("How many increments of 30 seconds would you like?");
        amtofTimeButtonisPressed = sc.nextInt();                                       //Sets up increments 
        System.out.println("Thank you, " + name + ".");
        for(int counter = 0; counter < amtofTimeButtonisPressed; counter++){
            time = time + 30;
        }
    }
    public void powerLevel(){
        System.out.println("Input power level 1 or 2");
        powerLvl = sc.nextInt();
        System.out.println("Thank you, " + name + ".");
        while (powerLvl !=1 && powerLvl !=2){                       //Sets up power level 
            System.out.println("Input a proper power level please");
            powerLvl = sc.nextInt();
        }
    }
    public void start(){
        System.out.println("Thank you, " + name + ".");
        System.out.println("Cooking for " + time + " seconds at level " + powerLvl);  //Starts the microwave
    }
    public void reset(){
        time = 0;
        powerLvl = 0;            //resets the microwave
        amtofTimeButtonisPressed = 0;
        
    }
}

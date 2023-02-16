import java.util.Scanner;
public class U4P17 {
    public void sim(double value)
    {
        double remainingSubstance = 0;
        int amountOfHours = 0;
        for(int i = 0; i <= 24; i++)       //All 24 hours 
        {
            remainingSubstance = value*(Math.pow(2.718, -i * Math.log(2)/6));               //Caluclates amount of remaining substance
            amountOfHours = i;
            System.out.println("Hour: " + amountOfHours);                                   //Prints hours and remaining substance
            System.out.println("Amount of substance remaining: " + remainingSubstance);
        }
    }
}
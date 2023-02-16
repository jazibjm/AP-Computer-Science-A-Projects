import java.util.Scanner;
public class U4E06 {
    public static void main(String[] args)
    {
        

        Scanner sc = new Scanner(System.in);
        double value;                               //Sets up all the doubles 
        double count= 0;
        double max = 0;
        double min = 999999999;
        double avg = 0;
        double range = 0;
        boolean done = false;
        DataSet U4 = new DataSet();         //Data set class               
        do
        {
           System.out.println("Enter input, 0 to quit: ");
           value = sc.nextInt();                               //Inputs all the numbers 
           if (value == 0) // Zero is the sentinel value
           {
              done = true;
              
           }
           else
           {
               U4.add(value);
               count++;
               avg = U4.getAverage(count);
               max = U4.getLargest(value, max);                 
               min = U4.getSmallest(value, min);                  //Calls all methods and returns variables 
               range = U4.getRange(max, min);

           }
        }
        while (!done);
        System.out.println("The range is: " + range);
        System.out.println("The average is: " + avg);            //Prints out all values 
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
        
    }
}